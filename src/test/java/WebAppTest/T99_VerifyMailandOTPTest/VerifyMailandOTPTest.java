package WebAppTest.T99_VerifyMailandOTPTest;

import WebApp.T0_Launch.Launch;
import WebApp.T99_VerifyMailandOTP.VerifyMailandOTP;
import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyMailandOTPTest extends Launch {
    VerifyMailandOTP verifymailandotp;

    @Test
    public void VerifyEmailSignupTest() throws IOException, InterruptedException {
        verifymailandotp=new VerifyMailandOTP();
        verifymailandotp.VerifyEmailSignup();
    }
}
