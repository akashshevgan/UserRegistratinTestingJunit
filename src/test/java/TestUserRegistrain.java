import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserRegistrain {

    @Test
    public void firstName() {
        UserRgistration firstName = new UserRgistration();
        boolean result = firstName.firstNameTest("Akash");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void lastName() {
        UserRgistration lastName = new UserRgistration();
        boolean result = lastName.lastNameTest("Shevgan");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void email() {
        UserRgistration user = new UserRgistration();
        boolean result = user.emailTest("akashshevgan11@gmail.com");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void phone() {
        UserRgistration user = new UserRgistration();
        boolean result = user.mobileNumberTest("91 8793447817");
        Assertions.assertEquals(true,result);
    }
    @Test
    public void password() {
        UserRgistration user = new UserRgistration();
        boolean result = user.passwordTest("Akash123$");
        Assertions.assertEquals(true,result);
    }
}
