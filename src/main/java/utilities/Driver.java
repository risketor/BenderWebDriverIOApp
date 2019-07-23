package utilities;

import config.TestConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class Driver {

    // Static main driver for all the tests
    public static AppiumDriver<MobileElement> driver;

    // Get time out amount in seconds from Runner Configuration
    private static int timeOut = TestConfig.Runner.Timeout;

    /**
     * Create the driver with the specified capabilities. Setting up an implicit wait with the time out from the config file.
     * @param capabilities
     * @throws MalformedURLException
     */
    public static AppiumDriver<MobileElement> createDriver(DesiredCapabilities capabilities) throws MalformedURLException {
        driver = new AndroidDriver(new URL(TestConfig.Appium.AppiumURL), capabilities);
        driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);

        return driver;
    }

    /**
     * Quit the driver, to be used at the end of a test.
     */
    public static void quitDriver() {
        driver.quit();
    }


    /**
     * Wait for visibility for the By element
     * @param element
     */
    public static void waitForVisibility(By element) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
}