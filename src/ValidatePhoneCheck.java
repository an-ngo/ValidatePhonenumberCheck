import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidatePhoneCheck {
    public static void main(String[] args) {
        
    Pattern pattern ;
    Matcher matcher;
    final String PHONENUMBER_REGEX = "^\\([0-9]{2}\\)-\\([0]{1}[0-9]{9}\\)$";
    String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)"};
    pattern = Pattern.compile(PHONENUMBER_REGEX);
    for (String phone : validPhoneNumber) {
        matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }
    for (String phone : invalidPhoneNumber) {
        matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }

    }
}
