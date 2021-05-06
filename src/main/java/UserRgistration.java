import java.util.regex.Pattern;

public class UserRgistration {

    public boolean firstNameTest(String firstname) {
        boolean test = Pattern.compile("(^[A-Z]{1}[a-z]{2,}$)").matcher(firstname).matches();
        if (test) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First name is invalid");
        }
        return test;
    }

    public boolean lastNameTest(String lastname) {
        boolean test = Pattern.compile("^[A-Z][a-z]{3,20}").matcher(lastname).matches();
        if (test) {
            System.out.println(lastname + " lastname is Valid ");
        } else {
            System.out.println(lastname + " lastname is Invalid ");
        }
        return test;
    }

    public boolean emailTest(String email) {
        boolean test = Pattern.compile("(^[a-z 0-9]{0,30} *([.+/-]?[a-z 0-9]{1,20})@[a-z]{1,20}.([a-z]{2,3} *(.[a-z]{2,3}))$)").matcher(email).matches();
        if (test) {
            System.out.println(email + " email is Valid ");
        } else {
            System.out.println(email + " email is Invalid ");
        }
        return test;
    }

    public boolean mobileNumberTest(String phone) {
        boolean test = Pattern.compile("^[0-9]{2}\\s[0-9]{10}").matcher(phone).matches();
        if (test) {
            System.out.println(phone + " mobile number is Valid ");
        } else {
            System.out.println(phone + " mobile number is Invalid ");
        }
        return test;
    }

    public boolean  passwordTest (String password) {
        boolean test = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-]?){8,32}.*$").matcher(password).matches();
        if (test) {
            System.out.println (password + " password is Valid ");
        } else {
            System.out.println (password + " password is Invalid ");
        }
        return test;
    }
}