package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class LoginPage extends Driver {

    private final By email_field = By.id("input-email");
    private final By password_field= By.id("input-password");
    private final By login_button = By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]");
    private final By alert_ok_button = By.id("android:id/button1");

    public void LoginPage(){
        PageFactory.initElements(driver, LoginPage.class);
    }

    public void waitToLoad() {
        waitForVisibility(email_field);
        waitForVisibility(password_field);
        waitForVisibility(login_button);
    }

    public void enterEmailField(String email){
        driver.findElement(email_field).setValue(email);
    }

    public void enterPasswordField(String pwd){
        driver.findElement(password_field).setValue(pwd);
    }

    public void clickLoginButton(){
        driver.findElement(login_button).click();
    }

    public boolean isAlertOkButtonDisplayed(){
        return driver.findElement(alert_ok_button).isDisplayed();
    }

    public void clickOkAlert() {
        driver.findElement(alert_ok_button).click();
    }
}
