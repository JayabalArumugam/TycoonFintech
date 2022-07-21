package WebAppTest.T3_LoginTest;
import WebApp.T0_Launch.Launch;
import WebApp.T1_Login.Login;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends Launch {
    Login login;

    @Test (priority = 1)
    public void UserLoginTest() throws InterruptedException, IOException {
        login=new Login();
        login.UserLogin();
    }
    @Test (priority = 2)
    public void ForgotPasswordTest() throws InterruptedException{
        login=new Login();
        login.ForgotPassword();
    }
    @Test (priority = 3)
    public void Login_RegisterTest() throws InterruptedException{
        login=new Login();
        login.Login_Register();
    }
    @Test
    public void UserLoginV2Test() throws InterruptedException, IOException {
        login=new Login();
        login.UserLoginV2();
    }
}
