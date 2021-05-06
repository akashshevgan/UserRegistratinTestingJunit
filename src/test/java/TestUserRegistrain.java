import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserRegistrain {
    @Test
    public void firstNameTest() {
        UserRgistration firstName = new UserRgistration();
        boolean result = firstName.firstNameTest();
        Assertions.assertEquals(false,result);
    }
}

