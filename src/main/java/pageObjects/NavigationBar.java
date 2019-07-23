package pageObjects;

import org.openqa.selenium.By;
import utilities.Driver;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class NavigationBar extends Driver {

    private final By webView_button = By.xpath("//android.view.ViewGroup[@content-desc=\"WebView\"]");
    private final By login_button = By.xpath("//android.view.ViewGroup[@content-desc=\"Login\"]");
    private final By forms_button = By.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]");

    public void waitToLoad(){
        waitForVisibility(webView_button);
        waitForVisibility(login_button);
        waitForVisibility(forms_button);
    }

    public void clickWebViewButton() {
        driver.findElement(webView_button).click();
    }

    public void clickLoginButton() {
        driver.findElement(login_button).click();
    }

    public void clickFormsButton() {
        driver.findElement(forms_button).click();
    }
}
