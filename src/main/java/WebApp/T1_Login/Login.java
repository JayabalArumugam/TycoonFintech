package WebApp.T1_Login;
import WebApp.T0_Launch.Launch;
import Webelement.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;


public class Login extends Launch  {

    LoginPage loginpage;

    public void UserLogin() throws InterruptedException, IOException {
        jse=(JavascriptExecutor)driver;
        loginpage=new LoginPage(driver);
        Thread.sleep(2000);
        if(WebAppProperty.getProperty("LandingPage").equalsIgnoreCase("YES")) {
            loginpage.Login.click();
        }
        loginpage.Email.sendKeys(WebAppProperty.getProperty("LoginEmail"));
        loginpage.Password.sendKeys(WebAppProperty.getProperty("LoginPassword"));
        Thread.sleep(2000);
        loginpage.LoginButton.click();
        Thread.sleep(3000);
        if(WebAppProperty.getProperty("2FALogin").equalsIgnoreCase("YES")){
            if(loginpage.VerifyOTPButton.getText().equalsIgnoreCase("VERIFY")){
                loginpage.VerifyOTPButton.click();
            } else {
                loginpage.SendOTPButton.click();
                Thread.sleep(2000);
                NewTab();
                driver.switchTo().window(Tabs.get(1));

                loginpage.VERIFYMAILIInput.sendKeys(WebAppProperty.getProperty("Username"));
                loginpage.VERIFYMAILsent.click();
                Thread.sleep(2000);
                for(int i=1; i<3; i++){
                    if(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr["+i+"]/td[2]")).getText().equalsIgnoreCase("TITA CENTER")){
                        driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr["+i+"]/td[2]")).click();
                        break;
                    }
                }
                String OTP=loginpage.VERIFYMAILotp.getText();
                System.out.println(OTP);
                loginpage.VerifyOTPButton.click();
            }
        } else{
            loginpage.RemindLaterButton.click();
        }
        Thread.sleep(3000);
    }
    public void UserLoginV2() throws InterruptedException, IOException {
        jse=(JavascriptExecutor)driver;
        loginpage=new LoginPage(driver);
        jse=(JavascriptExecutor)driver;
        Thread.sleep(2000);
        if(WebAppProperty.getProperty("LandingPage").equalsIgnoreCase("YES")) {
        wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(loginpage.Login));
        loginpage.Login.click();
        }
        loginpage.Email.sendKeys(WebAppProperty.getProperty("LoginEmail"));
        loginpage.Password.sendKeys(WebAppProperty.getProperty("LoginPassword"));
        Thread.sleep(1000);
        loginpage.LoginButton.click();
        Thread.sleep(1000);
    }

    public void ForgotPassword() throws InterruptedException{
        loginpage=new LoginPage(driver);
        if(loginpage.Login.isDisplayed()){
            loginpage.Login.click();
        }
        Thread.sleep(5000);
        loginpage.ForgotPassword.click();
        Thread.sleep(4000);
    }

    public void Login_Register() throws InterruptedException{
        loginpage=new LoginPage(driver);
        if(WebAppProperty.getProperty("LandingPage").equalsIgnoreCase("YES")) {
            loginpage.Login.click();
        }
        Thread.sleep(2000);
        loginpage.RegisterButton.click();
        System.out.println("Register page condition passed");

    }


}
