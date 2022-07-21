package WebApp.T99_VerifyMailandOTP;

import WebApp.T0_Launch.Launch;
import Webelement.LoginPage;
import Webelement.MailinatorPage;
import Webelement.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;

public class VerifyMailandOTP extends Launch{
    LoginPage loginpage;
    MailinatorPage mailpage;
    RegisterPage registerPage;

        public void VerifyEmailSignup() throws InterruptedException, IOException {
            loginpage=new LoginPage(driver);
            mailpage=new MailinatorPage(driver);
            registerPage=new RegisterPage(driver);
            Thread.sleep(2000);
            if(WebAppProperty.getProperty("LandingPage").equalsIgnoreCase("YES")) {
                loginpage.Login.click();
            }
            loginpage.Email.sendKeys(WebAppProperty.getProperty("LoginEmail"));
            loginpage.Password.sendKeys(WebAppProperty.getProperty("LoginPassword"));
            Thread.sleep(2000);
            loginpage.LoginButton.click();
            Thread.sleep(2000);
            if(registerPage.ResendMailButton.isDisplayed()){
                registerPage.ResendMailButton.click();
            }
            jse=(JavascriptExecutor)driver;
            NewTab();
            driver.switchTo().window(Tabs.get(1));
//            driver.get(WebAppProperty.getProperty("VerifyEMailURL"));
            Thread.sleep(1000);
            mailpage.MailInput.sendKeys(WebAppProperty.getProperty("Username"));
            mailpage.MailGoButton.click();
            Thread.sleep(3000);
            for(int i =1; i<10; i++){
               System.out.println("EmailText:"+driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr["+i+"]/td[2]")).getText());
                if(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr["+i+"]/td[2]")).getText().equalsIgnoreCase(WebAppProperty.getProperty("Appname"))){
                    driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr["+i+"]/td[2]")).click();
                    break;
                }
            }
            jse.executeScript("arguments[0].ScrollIntoView(true);",mailpage.MailLoginLink);
            jse.executeScript("arguments[0].click();",mailpage.MailLoginLink);



//            if(WebAppProperty.getProperty("LandingPage").equalsIgnoreCase("YES")) {
//                loginpage.Login.click();
//            }
//            loginpage.Email.sendKeys(WebAppProperty.getProperty("LoginEmail"));
//            loginpage.Password.sendKeys(WebAppProperty.getProperty("LoginPassword"));
//            Thread.sleep(2000);
//            loginpage.LoginButton.click();
//            Thread.sleep(3000);

//            if(WebAppProperty.getProperty("2FALogin").equalsIgnoreCase("YES")){
//                if(loginpage.VerifyOTPButton.getText().equalsIgnoreCase("VERIFY")){
//                    loginpage.VerifyOTPButton.click();
//                } else {
//                    loginpage.SendOTPButton.click();
//                    Thread.sleep(2000);
//                    NewTab();
//                    driver.switchTo().window(Tabs.get(1));
//
//                    loginpage.VERIFYMAILIInput.sendKeys(WebAppProperty.getProperty("Username"));
//                    loginpage.VERIFYMAILsent.click();
//                    Thread.sleep(2000);
//                    for(int i=1; i<3; i++){
//                        if(driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr["+i+"]/td[2]")).getText().equalsIgnoreCase("TITA CENTER")){
//                            driver.findElement(By.xpath("/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr["+i+"]/td[2]")).click();
//                            break;
//                        }
//                    }
//                    String OTP=loginpage.VERIFYMAILotp.getText();
//                    System.out.println(OTP);
//                    loginpage.VerifyOTPButton.click();
//                }
//            } else{
//                loginpage.RemindLaterButton.click();
//            }
            Thread.sleep(3000);
        }
}
