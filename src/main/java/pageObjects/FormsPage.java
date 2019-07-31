package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class FormsPage extends Driver {

    private final By switch_field = By.id("switch");
    private final By dropdown_button = By.id("select-Dropdown");
    private final By dropdown_options = By.id("select_dialog_listview");
    private final By active_button = By.id("button-Active");
    private final By cancel_alert_active_button = By.id("android:id/button2");

    public void FormsPage(){
        PageFactory.initElements(driver, FormsPage.class);
    }

    public void waitToLoad() {
        waitForVisibility(switch_field);
        waitForVisibility(active_button);
    }

    public void clickOnSwitchButton (){
        driver.findElement(switch_field).click();
    }

    public void clickOnDropdownButton (){
        driver.findElement(dropdown_button).click();
    }

    public int getDropdownNumberOfOptions (){
        return driver.findElements(dropdown_options).size();
    }

    public void clickOnDropdownOption (int index){
        driver.findElements(dropdown_options).get(index).click();
    }

    public void clickOnActiveButton(){
        driver.findElement(active_button).click();
    }

    public void clickOnCancelAlertForActiveButton(){
        driver.findElement(cancel_alert_active_button).click();
    }
}
