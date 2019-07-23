package utilities;

import config.TestConfig;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.net.MalformedURLException;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class AppiumSetup {

    /**
     * Create the Appium driver with specific capabilities
     * @throws MalformedURLException
     */
    public static void appiumSetup() throws MalformedURLException {
        File appDir = new File("app");
        File app = new File(appDir, TestConfig.App.Name);

        // Create the driver with the capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", TestConfig.Device.PlatformVersion);
        capabilities.setCapability("deviceName", TestConfig.Device.Name);
        capabilities.setCapability("app", app.getAbsolutePath());

        Driver.createDriver(capabilities);
    }
}
