package Webelement;

import WebApp.T0_Launch.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Launch {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    //Login - Login button in landing Page
    @FindBy(xpath = "/html/body/header/nav/div/div/div/form/a")
    public WebElement Login;

    //Login - Email field
    @FindBy(xpath = "//form/div/div[1]/div/div/input")
    public WebElement Email;

    //Login - Password field
    @FindBy(xpath = "//form/div/div[2]/div/div/input")
    public WebElement Password;

    //Login - Forgot password button
    @FindBy(xpath = " /html/body/div/div/div[2]/div[1]/div/form/div/a ")
    public WebElement ForgotPassword;

    //Login - Login button
    @FindBy(xpath = "//form/div/button")
    public WebElement LoginButton;

    //Login - Register button
    @FindBy(xpath = "//form/div/p/a ")
    public WebElement RegisterButton;

    //Login - Password Visiblity icon
    @FindBy(xpath = "//form/div/div[2]/div/div/button ")
    public WebElement PasswordVisibleButton;

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/div/p/button")
    public WebElement RemindLaterButton;

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/div/div/div/button")
    public WebElement SendOTPButton;

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/div/div/div/button")
    public WebElement VerifyOTPButton;

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/div/div/div/div/div[]/input")
    public WebElement OTPInput;


    @FindBy(xpath = "/html/body/div[1]/header[2]/div[1]/div/div/div/div/input")
    public WebElement VERIFYMAILIInput;

    @FindBy(xpath = "/html/body/div[1]/header[2]/div[1]/div/div/div/div/button")
    public WebElement VERIFYMAILsent;

    @FindBy(xpath = "/html/body/div/div/b")
    public WebElement VERIFYMAILotp;

}
