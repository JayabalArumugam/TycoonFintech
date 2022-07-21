package Webelement;

import WebApp.T0_Launch.Launch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailinatorPage extends Launch {
    public MailinatorPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "/html/body/div[1]/header[1]/div[1]/div/div/div[1]/div/input")
    public WebElement MailInput;

    @FindBy(xpath = "//html/body/div[1]/header[1]/div[1]/div/div/div[1]/div/button")
    public WebElement MailGoButton;

    @FindBy(xpath = "/html/body/div/main/div[2]/div[3]/div/div[4]/div/div/table/tbody/tr/td[2]")
    public WebElement MailInbox;

    @FindBy(xpath = "/html/body/div/div/a")
    public WebElement MailLoginLink;
}
