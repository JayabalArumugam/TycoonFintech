package WebApp.T0_Launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Launch {
    public static WebDriver driver;
    public static File src = new File("src");
    public static FileInputStream WebAppPropertyfile;
    public static Properties WebAppProperty = new Properties();
    public JavascriptExecutor jse;
    public ArrayList<String> Tabs;
    public Actions action;
    public Select countrycode;

    public WebDriverWait wait;



    //To init the browser
    public void InitBrowser() throws InterruptedException, IOException {
//        WebAppPropertyfile=new FileInputStream(src+"\\WebApp.properties");
        WebAppPropertyfile = new FileInputStream(src + "/main/java/properties/webPanelProperties/WebApp.properties");
        WebAppProperty.load(WebAppPropertyfile);
       /*
        if("WINDOWS".equalsIgnoreCase(WebAppProperty.getProperty("SystemOS"))){
           if("Chrome".equalsIgnoreCase(WebAppProperty.getProperty("BrowserName"))){
               System.setProperty("webdriver.chrome.driver", src+ "\\Driver\\Windows\\Chrome\\chromedriver.exe");   //To fetch the driver from exe file
               WebDriverManager.chromedriver().setup(); //To Setup the driver from dependency//

           }
       }
       */
        WebDriverManager.chromedriver().setup(); //To Setup the driver from dependency//
//        WebDriverManager.firefoxdriver().setup(); //To Setup the driver from dependency//
//        WebDriverManager.edgedriver().setup(); //To Setup the driver from dependency//
        driver = new ChromeDriver();
//        driver=new FirefoxDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    //To launch the TITAcenter application
    public void OpenWebApp() throws IOException, InterruptedException {
        WebAppPropertyfile = new FileInputStream(src + "/main/java/properties/webPanelProperties/WebApp.properties");
        WebAppProperty.load(WebAppPropertyfile);
        driver.get(WebAppProperty.getProperty("URL"));
        Thread.sleep(3000);
    }

    public void NewTab() throws InterruptedException, IOException {
        WebAppPropertyfile = new FileInputStream(src + "/main/java/properties/webPanelProperties/WebApp.properties");
        WebAppProperty.load(WebAppPropertyfile);
        jse=(JavascriptExecutor)driver;
        jse.executeScript("window.open()");
        Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        Thread.sleep(2000);
        driver.get(WebAppProperty.getProperty("VerifyEMailURL"));
        Thread.sleep(2000);
    }

    public String CountryCodeChoose( String EditCountryCode){
        for (int countrycode=1; countrycode<=246; countrycode++){
//            String codeee= driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li["+countrycode+"]")).getAttribute("data-value");
//           System.out.println("CSS code:"+codeee);
            WebElement countrycodeelement=driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li["+countrycode+"]"));
//            System.out.println("Element name:"+countrycodeelement);
            if(driver.findElement(By.xpath("/html/body/div[3]/div[3]/ul/li["+countrycode+"]")).getAttribute("data-value").equalsIgnoreCase(EditCountryCode)){
                jse.executeScript("arguments[0].click();",countrycodeelement);
                break;
            }
        }
        return EditCountryCode;
    }

    public void Quit() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}


