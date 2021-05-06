import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRgistration {
    boolean test;
    public boolean firstNameTest() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name");
        String string = scan.nextLine();
        test= Pattern.compile("(^[A-Z]{1}[a-z]{2,}$)").matcher(string).matches();

        if (test){
            System.out.println("First name is valid");
        }
        else {
            System.out.println("First name is not valid");
        }
        return test;
    }
    public static void main(String[] args) {
        UserRgistration userRgistration = new UserRgistration();
        userRgistration.firstNameTest();
    }
}
