import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FisrtTest {
    private AppiumDriver driver;
 @Before
    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("deviceName","AndroidTestDevice");
        capabilities.setCapability("platformVersion","6.0.1");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","ru.finassist.sandbox.debug");
        capabilities.setCapability("appActivity","ru.finassist.presentation.main.MainActivity");
        capabilities.setCapability("app","C:/Users/Dimooon/Desktop/JavaAppiumAutomator/apks/FinAssist.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @After
    public void tearDown()
    {
        driver.quit();
    }
@Test
    public void firstTest()
    {
        System.out.println("First test run!!!!!!");
    }
}
