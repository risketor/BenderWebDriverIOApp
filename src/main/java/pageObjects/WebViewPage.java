package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.Helper;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class WebViewPage extends Driver {

    private final By getStarted_button = By.linkText("Getting Started");
    private final By gitterChannel_link = By.linkText("Gitter Channel");
    private final String webViewName = "WEBVIEW_com.wdiodemoapp";

    public void WebViewPage(){
        PageFactory.initElements(driver, WebViewPage.class);
    }

    public void waitToLoad() {
        waitForVisibility(getStarted_button);
    }

    /**
     * Wait to load the Getting Started section. Waiting for a link text element
     */
    public void waitToLoadGettingStartedSection(){
        waitForVisibility(gitterChannel_link);
    }
    /**
     * First using Helper method for an action to move to the element (scrolling down)
     * As if it is not in the screen it is not possible to click on it.
     */
    public void clickOnGetStartedButton() {
        Helper.moveToElement(driver.findElement(getStarted_button));
        driver.findElement(getStarted_button).click();
    }

    /**
     * Returning the WebView content name, to switch to the WebView
     * @return
     */
    public String getWebViewName() {
        return webViewName;
    }
}
