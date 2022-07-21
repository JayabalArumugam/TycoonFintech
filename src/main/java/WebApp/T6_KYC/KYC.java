package WebApp.T6_KYC;

import WebApp.T0_Launch.Launch;
import Webelement.KYCPage;
import Webelement.LandingPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KYC extends Launch {
    KYCPage kycpage;
    LandingPage landingpage;
    public void AddKYC() throws InterruptedException{
        kycpage=new KYCPage(driver);
        landingpage=new LandingPage(driver);
        jse=(JavascriptExecutor)driver;
        action=new Actions(driver);
        Thread.sleep(2000);
        landingpage.ProfileMenu.click();
        Thread.sleep(2000);
        landingpage.KYC.click();
        Thread.sleep(2000);
        if(WebAppProperty.getProperty("DocumentType").equalsIgnoreCase("AADHAR")){
            action.moveToElement(kycpage.DocumentType).click().perform();
            Thread.sleep(500);
            for(int doc=1; doc<=3; doc++){
                WebElement DocTypeSelect=driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li["+doc+"]"));
                if(DocTypeSelect.getText().equalsIgnoreCase("AADHAR")){
                   jse.executeScript("arguments[0].click();",DocTypeSelect);
                }
            }
            kycpage.DocumentNumber.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("AADHARNumber"));
            kycpage.DocumentImageFront.sendKeys(WebAppProperty.getProperty("AADHARImageFront"));
            kycpage.DocumentImageBack.sendKeys(WebAppProperty.getProperty("AADHARImageBack"));
            kycpage.DocumentSelfieImage.sendKeys(WebAppProperty.getProperty("AADHARSelfieImage"));
            Thread.sleep(500);
            kycpage.DocumentNumberOptional.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("PanNumber"));
            kycpage.DocumentImageOptional.sendKeys(WebAppProperty.getProperty("PanImage"));

        } else if (WebAppProperty.getProperty("DocumentType").equalsIgnoreCase("PAN")) {
            action.moveToElement(kycpage.DocumentType).click().perform();
            Thread.sleep(500);
            for(int doc=1; doc<=3; doc++){
                WebElement DocTypeSelect=driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li["+doc+"]"));
                if(DocTypeSelect.getText().equalsIgnoreCase("PAN")){
                    jse.executeScript("arguments[0].click();",DocTypeSelect);
                }
            }
            kycpage.DocumentNumber.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("PanNumber"));
            kycpage.DocumentImageFront.sendKeys(WebAppProperty.getProperty("PanImage"));
            kycpage.DocumentSelfieImage.sendKeys(WebAppProperty.getProperty("PanSelfieImage"));
            Thread.sleep(500);
            if(WebAppProperty.getProperty("OptionalDocument").equalsIgnoreCase("YES")){
                kycpage.DocumentNumberOptional.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("AADHARNumber"));
                kycpage.DocumentImageOptional.sendKeys(WebAppProperty.getProperty("AADHARImageFront"));
            }
        }
    }
    public void UpdateKYC() throws InterruptedException{
        kycpage=new KYCPage(driver);
        landingpage=new LandingPage(driver);
        Thread.sleep(2000);
        landingpage.ProfileMenu.click();
        Thread.sleep(2000);
        landingpage.KYC.click();
        Thread.sleep(2000);
        String optdocname=kycpage.OptionalDocumentName.getText();
        if(optdocname.equalsIgnoreCase("AADHAR NUMBER")){
            kycpage.DocumentNumberOptional.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("AADHARNumber"));
            kycpage.DocumentImageOptional.sendKeys(WebAppProperty.getProperty("AADHARImageFront"));
        } else {
            kycpage.DocumentNumberOptional.sendKeys(Keys.chord(Keys.COMMAND,"a",Keys.DELETE),WebAppProperty.getProperty("PanNumber"));
            kycpage.DocumentImageOptional.sendKeys(WebAppProperty.getProperty("PanImage"));
        }

    }
}
