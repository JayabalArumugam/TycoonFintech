package Webelement;

import WebApp.T0_Launch.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KYCPage extends Launch {
    public KYCPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/div[2]/div[1]/div/div[2]/div[1]/div/div/div")
    public WebElement DocumentType;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div")
    public WebElement DocumentNumber;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/div[2]/div[1]/div/div[2]/div[3]/div/div/label/img")
    public WebElement DocumentImageFront;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/div[2]/div[1]/div/div[2]/div[4]/div/div/label/img")
    public WebElement DocumentImageBack;

    @FindBy(xpath = "//*[@id=\"userPicture\"]")
    public WebElement DocumentSelfieImage;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/div[2]/div[1]/div/div[3]/div[2]/div/div/div/input")
    public WebElement DocumentNumberOptional;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/div[2]/div[1]/div/div[3]/div[4]/div/div/label/img")
    public WebElement DocumentImageOptional;

    @FindBy(xpath = "//*[@id=\"addressDocumentType\"]/p")
    public WebElement AddressDocType;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/div[2]/div[2]/div/div[2]/div[3]/div/div/label/img")
    public WebElement AddressDocumentImage;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[6]")
    public WebElement DocumentTypeSelect;

    @FindBy(xpath = "/html/body/div/div/div[2]/form/div/div[3]/div/div/button")
    public WebElement KYCSubmitButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/div/div[6]/input")
    public WebElement AadharOTP;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[2]/button")
    public WebElement AadharVerifyButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/div/div[1]/button")
    public WebElement OTPCloseButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/form/div/div[2]/div[1]/div/div[3]/div[2]/div/label")
    public WebElement OptionalDocumentName;
}
