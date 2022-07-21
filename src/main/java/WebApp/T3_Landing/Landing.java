package WebApp.T3_Landing;

import WebApp.T0_Launch.Launch;
import Webelement.LandingPage;

public class Landing extends Launch {
    LandingPage landingpage;

    public void TradePage(){
        landingpage=new LandingPage(driver);

        if(WebAppProperty.getProperty("TradePage").equalsIgnoreCase("SPOT")){
            landingpage.SpotButton.click();
        }


    }


}
