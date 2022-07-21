package Webelement;

import WebApp.T0_Launch.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends Launch {
    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div/div/div[2]/header/div/div/div[3]/div[1]/a")
    public WebElement SpotButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/header/div/div/div[3]/div[2]/a")
    public WebElement P2PButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/header/div/div/div[3]/div[3]/a")
    public WebElement WalletButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/header/div/div/div[3]/div[4]/a")
    public WebElement DashboardButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/header/div/div/div[5]/button[1]")
    public WebElement NotificationButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/div/div[1]/a")
    public WebElement NotificationViewall;

    @FindBy(xpath = "/html/body/div/div/div[2]/header/div/div/div[5]/button[2]")
    public WebElement ProfileMenu;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/a[1]")
    public WebElement Account;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/a[2]")
    public WebElement KYC;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/a[3]")
    public WebElement InviteFriends;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/a[4]")
    public WebElement HelpCenter;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public WebElement LogoutButton;
}
