package runTest;

import config.TestConfig;
import org.junit.*;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;
import utilities.AppiumSetup;
import utilities.Driver;
import utilities.Helper;
import java.net.MalformedURLException;

/**
* Created by A.Bartolome 19/07/2019
*/
public class BenderSuiteTest extends Driver {

    // Create a new instance of the pages class and initialise any elements in it. POM
    public HomePage homePage;
    public NavigationBar navigationBar;
    public LoginPage loginPage;
    public FormsPage formsPage;
    public WebViewPage webViewPage;

    public BenderSuiteTest() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        navigationBar = PageFactory.initElements(driver, NavigationBar.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        formsPage = PageFactory.initElements(driver, FormsPage.class);
        webViewPage = PageFactory.initElements(driver, WebViewPage.class);
    }

    /**
     * Before starting each test, the Appium driver will be created
     * @throws MalformedURLException
     */
    @Before
    public void setupBefore() throws MalformedURLException {
        AppiumSetup.appiumSetup();
    }

    /**
     * After each test in this class, the driver will be killed
     */
    @After
    public void tearDownAfter(){
        Driver.quitDriver();
    }



    // TEST CASES

    /**
     * WebView Tab Test
     * Change the WebView context when the WebView tab loads
     * Click in the Get Started button in the WebView
     */
    @Test
    public void WebViewTabTest() {

        // To make sure that the Home page and the Navigation bar are loaded right
        homePage.waitToLoad();
        navigationBar.waitToLoad();

        // Go to WebView page
        navigationBar.clickWebViewButton();
        Helper.switchToContext(webViewPage.getWebViewName());
        webViewPage.waitToLoad();

        // Click on Getting Started button
        webViewPage.clickOnGetStartedButton();

        // To make sure that Getting Started section loads
        webViewPage.waitToLoadGettingStartedSection();
    }

    /**
     * Login Tab Test
     * Make a correct login (valid email and pwd 8 chars)
     * Accept the alert after the login
     */
    @Test
    public void LoginPageTest() {

        // To make sure that the Home page and the Navigation bar are loaded right
        homePage.waitToLoad();
        navigationBar.waitToLoad();

        // Go to Login page
        navigationBar.clickLoginButton();
        loginPage.waitToLoad();

        // Make a correct login
        loginPage.enterEmailField(TestConfig.TestData.email);
        loginPage.enterPasswordField(TestConfig.TestData.password);

        // Dismiss the keyboard as it is covering the login button
        driver.hideKeyboard();

        // Click on Login, assert that the Ok alert is displayed and click on it
        loginPage.clickLoginButton();
        assert(loginPage.isAlertOkButtonDisplayed());
        loginPage.clickOkAlert();

        // To make sure that Login page is loaded after dismissing the alert
        loginPage.waitToLoad();
    }

    /**
     * Forms Tab Test
     * Turn Switch on and off
     * Choose a value in the dropdown box
     * Click in the Active button and then Cancel
     */
    @Test
    public void FormsPageTest() {

        // To make sure that the Home page and the Navigation bar are loaded right
        homePage.waitToLoad();
        navigationBar.waitToLoad();

        // Go to Forms page
        navigationBar.clickFormsButton();
        formsPage.waitToLoad();

        // Turn Switch on and off
        formsPage.clickOnSwitchButton();
        formsPage.clickOnSwitchButton();

        // Choose a value in the dropdown box. Assert that options are not zero. And choose the last option
        formsPage.clickOnDropdownButton();
        int numberOfOptions = formsPage.getDropdownNumberOfOptions();
        assert (numberOfOptions>0);
        formsPage.clickOnDropdownOption(numberOfOptions-1);

        // To make sure that the forms page is displayed after clicking on the dropdown option
        formsPage.waitToLoad();

        // Click in the Active button and then Cancel
        formsPage.clickOnActiveButton();
        formsPage.clickOnCancelAlertForActiveButton();

        // To make sure that Forms page is loaded after dismissing the alert
        formsPage.waitToLoad();
    }
}
