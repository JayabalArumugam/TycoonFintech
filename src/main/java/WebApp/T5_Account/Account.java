package WebApp.T5_Account;

import WebApp.T0_Launch.Launch;
import Webelement.AccountPage;
import Webelement.LandingPage;
import Webelement.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class Account extends Launch {
    AccountPage accountpage;
    LandingPage landingpage;
    LoginPage loginpage;

    public void EditProfile() throws InterruptedException{
        accountpage=new AccountPage(driver);
        landingpage=new LandingPage(driver);
        jse=(JavascriptExecutor)driver;
        action=new Actions(driver);
        Thread.sleep(2000);
        landingpage.ProfileMenu.click();
        Thread.sleep(2000);
        landingpage.Account.click();
        Thread.sleep(2000);
        jse.executeScript("arguments[0].click();",accountpage.EditProfileButton);
        Thread.sleep(500);


        //EDIT PROFILE
        accountpage.EditFirstname.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("EditFirstname"));
        accountpage.EditLastname.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("EditLastname"));
        Thread.sleep(500);
        try {
            action.moveToElement(accountpage.EditPrimaryCountryCode).click().perform();

        } catch (Exception e){
            jse.executeScript("arguments[0].scrollIntoView(true);",accountpage.EditPrimaryCountryCode);
            System.out.println("Exception Found:"+e);
        }
        CountryCodeChoose(WebAppProperty.getProperty("EditPrimaryCountryCode"));
//        for (int countrycode=1; countrycode<=246; countrycode++){
////            String codeee= driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li["+countrycode+"]")).getAttribute("data-value");
////           System.out.println("CSS code:"+codeee);
//            WebElement countrycodeelement=driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li["+countrycode+"]"));
////            System.out.println("Element name:"+countrycodeelement);
//            if(driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li["+countrycode+"]")).getAttribute("data-value").equalsIgnoreCase(WebAppProperty.getProperty("EditCountryCode"))){
//                jse.executeScript("arguments[0].click();",countrycodeelement);
//                break;
//            }
//        }
        accountpage.EditPrimaryMobileNumber.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("EditPrimaryMobileNumber"));
        Thread.sleep(500);
        try {
            action.moveToElement(accountpage.EditSecondaryCountryCode).click().perform();

        } catch (Exception e){
            jse.executeScript("arguments[0].scrollIntoView(true);",accountpage.EditSecondaryCountryCode);
            System.out.println("Exception Found:"+e);
        }
        CountryCodeChoose(WebAppProperty.getProperty("EditSecondaryCountryCode"));
        accountpage.EditSecondaryMobileNumber.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("EditSecondaryMobileNumber"));

        Thread.sleep(500);
        try {
            action.moveToElement(accountpage.EditNomineeCountryCode).click().perform();

        } catch (Exception e){
            jse.executeScript("arguments[0].scrollIntoView(true);",accountpage.EditNomineeCountryCode);
            System.out.println("Exception Found:"+e);
        }
        CountryCodeChoose(WebAppProperty.getProperty("EditNomineeCountryCode"));
        accountpage.EditNomineeMobileNumber.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("EditNomineeMobileNumber"));
        accountpage.EditNomineeName.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("EditNomineeName"));
        accountpage.EditNomineeRelation.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("EditNomineeRelation"));

        if(WebAppProperty.getProperty("ChangeImage").equalsIgnoreCase("YES")){
            jse.executeScript("arguments[0].click();",accountpage.EditProfileImage);
//            jse.executeScript("arguments[0].scrollIntoView(true);",accountpage.EditProfileImage);

            accountpage.EditProfileImage.sendKeys("Users/jayabalarumugam/Documents/Pictures/15412.png");

        }
        Thread.sleep(1000);
        if(WebAppProperty.getProperty("SaveProfile").equalsIgnoreCase("NO")){
            accountpage.DiscardButton.click();
        }
        accountpage.EditProfileSaveButton.click();
        Thread.sleep(2000);
    }

    public void EditPaymentDetails()throws InterruptedException{
        accountpage=new AccountPage(driver);
        landingpage=new LandingPage(driver);
        jse=(JavascriptExecutor)driver;
        action=new Actions(driver);
        Thread.sleep(2000);
        landingpage.ProfileMenu.click();
        Thread.sleep(2000);
        landingpage.Account.click();
        Thread.sleep(2000);
        jse.executeScript("arguments[0].click();",accountpage.PaymentEditButton);
        Thread.sleep(1000);
//        jse.executeScript("window.scrollBy(0,100)");
        Thread.sleep(500);
        accountpage.AccountNumber.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("AccountNumber"));
        accountpage.AccountType.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("AccountType"));
        accountpage.BankName.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("BankName"));
        accountpage.BranchName.sendKeys(Keys.chord(Keys.COMMAND+"a",Keys.DELETE),WebAppProperty.getProperty("BranchName"));
        accountpage.IFSCCode.sendKeys(Keys.chord(Keys.COMMAND+"a",Keys.DELETE),WebAppProperty.getProperty("IFSCCode"));
        accountpage.GpayUPIId.sendKeys(Keys.chord(Keys.COMMAND+"a",Keys.DELETE),WebAppProperty.getProperty("GPayUPI"));
        accountpage.UPIId.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("UPIId"));
//        jse.executeScript("arguments[0].scrollIntoView(true);",accountpage.AccountMobileCountryCode);
        Thread.sleep(500);
        try {
            action.moveToElement(accountpage.AccountMobileCountryCode).click().perform();

        } catch (Exception e){
            jse.executeScript("arguments[0].scrollIntoView(true);",accountpage.AccountMobileCountryCode);
            System.out.println("Exception Found:"+e);
        }
        for (int c=1; c<=246; c++){
//            String codeee= driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li["+c+"]")).getAttribute("data-value");
//           System.out.println("CSS code:"+codeee);
            WebElement countrycodeelement=driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li["+c+"]"));
//            System.out.println("Element name:"+countrycodeelement);
            if(driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li["+c+"]")).getAttribute("data-value").equalsIgnoreCase(WebAppProperty.getProperty("PaymentCountryCode"))){
                countrycodeelement.click();
                break;
            }
        }
        accountpage.AccountMobileNumber.sendKeys(Keys.chord(Keys.COMMAND+"a",Keys.DELETE),WebAppProperty.getProperty("PaymentMobileNumber"));
        Thread.sleep(1000);
        if(WebAppProperty.getProperty("SavePaymentDetails").equalsIgnoreCase("YES")){
            accountpage.PaymentSaveButton.click();
        } else{
            //Cancel the edited payment details
            accountpage.PaymentEditButton.click();
        }
    }

    public void TwoFactor() throws InterruptedException{

    }
    public void ChangePassword() throws InterruptedException{

    }
}
