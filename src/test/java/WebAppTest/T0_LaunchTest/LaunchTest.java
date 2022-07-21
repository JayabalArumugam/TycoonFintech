package WebAppTest.T0_LaunchTest;

import WebApp.T0_Launch.Launch;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.PriorityQueue;

public class LaunchTest extends Launch {

    @BeforeSuite
    public void InitBrowserTest() throws InterruptedException, IOException {
        InitBrowser();
    }

    @Test (priority=1)
    public void OpenWebAppTest() throws InterruptedException, IOException {
        OpenWebApp();
    }

    @Test(priority = 2)
    public void QuitTest() throws IOException, InterruptedException {
        Quit();
    }



}
