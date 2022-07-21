package WebAppTest.T5_AccountTest;

import WebApp.T0_Launch.Launch;
import WebApp.T5_Account.Account;
import org.testng.annotations.Test;

public class AccountTest extends Launch {
   Account account;

    @Test(priority = 1)
    public void EditProfileTest() throws InterruptedException{
      account=new Account();
        account.EditProfile();
    }
    @Test(priority = 2)
    public void EditPaymentDetailsTest() throws InterruptedException{
        account=new Account();
       account.EditPaymentDetails();
    }
    @Test(priority = 4)
    public void ChangePasswordTest() throws InterruptedException{
        account.ChangePassword();
    }
    @Test(priority = 3)
    public void TwoFactorTest() throws InterruptedException{
        account.TwoFactor();
    }
}
