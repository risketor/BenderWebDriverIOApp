package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class HomePage extends Driver {

    private final By robot_image = By.xpath("//android.widget.ScrollView[@content-desc=\"Home-screen\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
    private final By page_title = By.xpath("//android.widget.ScrollView[@content-desc=\"Home-screen\"]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]");

    public void HomePage(){
        PageFactory.initElements(driver, HomePage.class);
    }

    public void waitToLoad() {
        waitForVisibility(robot_image);
        waitForVisibility(page_title);
    }
}
