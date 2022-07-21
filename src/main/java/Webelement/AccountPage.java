package Webelement;

import WebApp.T0_Launch.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Launch {
    public AccountPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[1]/div/form/div[1]/a")
    public WebElement EditProfileButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[2]/a")
    public WebElement ChangePasswordButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div[1]/div[1]/div/form/div[2]/div[6]/div/a")
    public WebElement ChangeProfileImageButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[1]/div/div/div/input")
    public WebElement EditFirstname;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[2]/div/div/div/input")
    public WebElement EditLastname;

   //not used email is not able to edit
    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[3]/div/div/div/input")
    public WebElement EditEmail;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[4]/div/div/div[1]")
    public WebElement EditPrimaryCountryCode;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[4]/div/div/div[2]/div/input")
    public WebElement EditPrimaryMobileNumber;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[5]/div/div/div[1]")
    public WebElement EditSecondaryCountryCode;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[5]/div/div/div[2]/div/input")
    public WebElement EditSecondaryMobileNumber;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[6]/div/div/div/input")
    public WebElement EditNomineeName;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[8]/div/div/div/input")
    public WebElement EditNomineeRelation;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[7]/div/div/div[1]")
    public WebElement EditNomineeCountryCode;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[7]/div/div/div[2]/div/input")
    public WebElement EditNomineeMobileNumber;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[10]/div/span/div/div/label/div")
    public WebElement EditProfileImage;

//    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[1]/div/div[6]/div/span/div/div/label/div/img")
//    public WebElement ProfileImageUpload;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[2]/div/button")
    public WebElement EditProfileSaveButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/form/div/div[2]/div/a")
    public WebElement DiscardButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[9]/div/button[2]")
    public WebElement PaymentEditButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[1]/div/div/div/input")
    public WebElement AccountNumber;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[2]/div/div/div/input")
    public WebElement AccountType;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[3]/div/div/div/input")
    public WebElement BankName;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[4]/div/div/div/input")
    public WebElement BranchName;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[5]/div/div/div/input")
    public WebElement IFSCCode;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[6]/div/div/div/input")
    public WebElement GpayUPIId;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[7]/div/div/div/input")
    public WebElement UPIId;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[8]/div/div/div[1]")
    public WebElement AccountMobileCountryCode;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public WebElement AccountMobileCountryList;
    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[8]/div/div/div[2]/div/input")
    public WebElement AccountMobileNumber;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[1]/div[2]/div/form/div[9]/div/button[2]")
    public WebElement PaymentSaveButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/a")
    public WebElement TwoFactorFAEnableandDisable;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div[2]/div[1]/div/div/a")
    public WebElement TwoFactorSendOTP;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/p/button")
    public WebElement TwoFactorRemindmelater;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/div/div/div/div/input")
    public WebElement TwoFactorOTPInput;

    @FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/div/div/button")
    public WebElement TwoFactorVerify;

}
