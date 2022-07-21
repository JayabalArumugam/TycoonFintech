package WebAppTest.T2_RegisterTest;

import WebApp.T0_Launch.Launch;
import WebApp.T2_Register.Register;
import org.testng.annotations.Test;

import java.util.PriorityQueue;

public class RegisterTest extends Launch {
    Register register;

    @Test (priority = 1)
    public void CreateAccountTest() throws InterruptedException{
        register=new Register();
        register.CreateAccount();
    }
    @Test (priority = 2)
    public void Register_LoginTest() throws InterruptedException{
        register=new Register();
        register.Register_Login();
    }

}
