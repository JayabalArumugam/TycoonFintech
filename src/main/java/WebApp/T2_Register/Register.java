package WebApp.T2_Register;

import WebApp.T0_Launch.Launch;
import WebApp.T1_Login.Login;
import Webelement.RegisterPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Register extends Launch {
    RegisterPage registerpage;
    Login login;

    public void CreateAccount() throws InterruptedException {
        registerpage=new RegisterPage(driver);
        login =new Login();
        jse=(JavascriptExecutor)driver;
        action=new Actions(driver);
        Thread.sleep(2000);
        if(WebAppProperty.getProperty("LandingPage").equalsIgnoreCase("YES")){
            registerpage.Registerbutton.click();
        }      else{
            login.Login_Register();
        }
        Thread.sleep(2000);
        registerpage.Fisrtname.sendKeys(WebAppProperty.getProperty("Firstname"));
        registerpage.Lastname.sendKeys(WebAppProperty.getProperty("Lastname"));
        registerpage.Email.sendKeys(WebAppProperty.getProperty("RegisterEmail"));

        Thread.sleep(500);
        try{
            action.moveToElement(registerpage.Day).click().perform();
        }catch (Exception e){
            jse.executeScript("arguments[0].scrollIntoView(true);",registerpage.SignupCountryCode);
        }
        CountryCodeChoose(WebAppProperty.getProperty("DOBDay"));

        Thread.sleep(500);
        try{
            action.moveToElement(registerpage.Month).click().perform();
        }catch (Exception e){
            jse.executeScript("arguments[0].scrollIntoView(true);",registerpage.SignupCountryCode);
        }
        CountryCodeChoose(WebAppProperty.getProperty("DOBMonth"));

        Thread.sleep(500);
        try{
            action.moveToElement(registerpage.Year).click().perform();
        }catch (Exception e){
            jse.executeScript("arguments[0].scrollIntoView(true);",registerpage.SignupCountryCode);
        }
        CountryCodeChoose(WebAppProperty.getProperty("DOBYear"));
        
        Thread.sleep(500);
        try{
            action.moveToElement(registerpage.SignupCountryCode).click().perform();
        }catch (Exception e){
            jse.executeScript("arguments[0].scrollIntoView(true);",registerpage.SignupCountryCode);
        }
        CountryCodeChoose(WebAppProperty.getProperty("SignupCountryCode"));
        Thread.sleep(500);
        registerpage.SignupMobileNumber.sendKeys(WebAppProperty.getProperty("SignupMobileNumber"));
        registerpage.Password.sendKeys(WebAppProperty.getProperty("RegisterPassword"));
        if ((WebAppProperty.getProperty("ReferalCodeAdded")).equalsIgnoreCase("YES")) {
            registerpage.ReferalCode.sendKeys(WebAppProperty.getProperty("ReferalCode"));
        }
        registerpage.TermsandCondtion.click();
        registerpage.CreateAccount.click();
        Thread.sleep(3000);
        if(registerpage.BacktoLogin.isDisplayed()){
              registerpage.BacktoLogin.click();
        }
    }
    public void Register_Login() throws InterruptedException {
        registerpage=new RegisterPage(driver);
        registerpage.Registerbutton.click();
        Thread.sleep(5000);
        registerpage.Login.click();
        Thread.sleep(3000);
        System.out.println("Login page condition passed");
    }
}