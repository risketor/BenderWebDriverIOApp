package pageObjects;

import org.openqa.selenium.By;
import utilities.Driver;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class HomePage extends Driver {

    private final By robot_image = By.xpath("//android.widget.ScrollView[@content-desc=\"Home-screen\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
    private final By page_title = By.xpath("//android.widget.ScrollView[@content-desc=\"Home-screen\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]");

    public void waitToLoad() {
        waitForVisibility(robot_image);
        waitForVisibility(page_title);
    }
}
