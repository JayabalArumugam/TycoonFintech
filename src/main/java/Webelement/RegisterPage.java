package Webelement;

import WebApp.T0_Launch.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Launch  {
    public RegisterPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    //Landing Page - Register Button
    @FindBy (xpath=" /html/body/div[2]/div/main/section[1]/div[2]/div/div/div/div[1]/div/div/a[1]")
    public WebElement Registerbutton;

    //Create Account - Firstname Text Field
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[1]/div[1]/div/div/input")
    public WebElement Fisrtname;

    //Create Account - Lastname Text Field
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[1]/div[2]/div/div/input")
    public WebElement Lastname;

    //Create Account - Email Text Field
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[2]/div/div/input")
    public WebElement Email;

    //Create Account - Password Text Field

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/form/div/div[3]/div/div[1]/div")
    public WebElement Day;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/form/div/div[3]/div/div[2]/div")
    public WebElement Month;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/form/div/div[3]/div/div[3]/div")
    public WebElement Year;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/form/div/div[4]/div/div[2]/div/input")
    public WebElement SignupMobileNumber;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/form/div/div[4]/div/div[1]/div")
    public WebElement SignupCountryCode;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div[1]/div/form/div/div[5]/div/div/input")
    public WebElement Password;

    //Create Account - Referal Code Text Field
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[6]/div/div/input")
    public WebElement ReferalCode;

    // Create Account - T&C checkbox
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[7]/label/span[1]")
    public WebElement TermsandCondtion;

    //Create Account - Signup button
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/button")
    public WebElement CreateAccount;

    //Create Account - Login button
    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/p/a")
    public WebElement Login;

    //Create Account - Visiblity Button for Password
    @FindBy(xpath="/html/body/div[2]/div/div[2]/div[1]/div/form/div/div[5]/div/div/div/button")
    public WebElement VisiblityButton;

    //Create Account - Success Signup Popup
//    @FindBy(xpath="/html/body/div[2]/div[3]/div/div[2]/a")
    @FindBy(css = "body > div.MuiModal-root.MuiDialog-root.css-13d70cs > div.MuiDialog-container.MuiDialog-scrollPaper.css-16u656j > div > div.MuiDialogContent-root.css-1rkgore > a > h6")
    public WebElement BacktoLogin;

    @FindBy(css="body > div.MuiModal-root.MuiDialog-root.css-13d70cs > div.MuiDialog-container.MuiDialog-scrollPaper.css-16u656j > div > div.MuiDialogContent-root.css-1rkgore > button > h6")
    public WebElement ResendMailButton;


    //Create Account - Success Signup Popup Close button
    @FindBy(xpath="")
    public WebElement BacktoLoginClose;

    //Create Account - Success signup popup content
//    @FindBy(xpath="/html/body/div[2]/div[3]/div/div[2]/p")
    @FindBy(css = "body > div.MuiModal-root.MuiDialog-root.css-13d70cs > div.MuiDialog-container.MuiDialog-scrollPaper.css-16u656j > div > div.MuiDialogContent-root.css-1rkgore > h5")
    public WebElement BacktoLoginContent;

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[2]/div/p")
    public WebElement RegisterEmailError;
    //email must be a valid email
    //No email provided

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[3]/div/p")
    public WebElement RegisterPasswordError;
    //Password is required
    //Password too short

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[1]/div[1]/div/p")
    public WebElement RegisterFirstnameError;

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[1]/div[2]/div/p")
    public WebElement RegisterLastnameError;

    @FindBy(xpath="/html/body/div/div/div[2]/div[1]/div/form/div/div[5]/p")
    public WebElement RegisterAgreeTermsError;


}
