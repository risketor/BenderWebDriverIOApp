package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by A.Bartolome 19/07/2019
 */
public class Helper extends Driver {

    /**
     * An action to move the screen to the WebElement, e.g. scrolling to where that element is in the screen.
     * @param element
     */
    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * Switching to a given context name.
     * @param contextName
     */
    public static void switchToContext(String contextName) {
        RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(driver);
        Map<String,String> params = new HashMap<>();
        params.put("name", contextName);
        executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
    }
}
