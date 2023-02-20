import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the format: ");
        String input = scanner.nextLine();

        String result = checkPattern(input);
        System.out.println(result);
    }
    public static String checkPattern(String input) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String ipRegex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        String dateRegex = "^\\d{2}-\\d{2}-\\d{4}$";
        String dateRegex2 = "^[A-Za-z]+,\\s[A-Za-z]+\\s\\d{2}$";

        if (Pattern.matches(emailRegex, input)) {
            return "\n'This is Email'";
        } else if (Pattern.matches(ipRegex, input)) {
            return "\n'This is IP'";
        } else if (Pattern.matches(dateRegex, input)) {
            return "\n'This is dd-MM-yyyy format'";
        } else if (Pattern.matches(dateRegex2, input)) {
            return "\n'This is dddd, MMMM yy format'";
        } else {
            return "\n'Unknown format'";
        }
    }
}
