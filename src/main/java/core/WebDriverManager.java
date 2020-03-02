package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.GetProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebDriverManager {

    // Path of gradle properties file.
    public static final String PATH_OF_GRADLE_PROPERTIES_FILE = "gradle.properties";
    // Name of property of gradle properties file.
    public static final String BROWSER_NAME = "browserName";

    // Content WebDriverManager.
    private static WebDriverManager webDriverManager;

    // Content WebDriver.
    private WebDriver webDriver;

    // Content WebDriverWait.
    private WebDriverWait webDriverWait;

    /**
     * this method is used for initializes the variables.
     */
    private WebDriverManager() {
        initialize();
    }

    /**
     * This method is used for initializes the variables.
     */
    private void initialize() {
        this.webDriver = WebDriverFactory.getWebDriver(getBrowser());
        this.webDriver.manage().window().maximize();
        this.webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 20);
    }
    /**
     * This method is used for instantiate the WebDriverManager class.
     *
     * @return a webDriverManager.
     */
    public static WebDriverManager getInstance() {
        if (webDriverManager == null) {
            webDriverManager = new WebDriverManager();
        }
        return webDriverManager;
    }

    /**
     * Uses to get a WebDriver.
     *
     * @return a WebDriver.
     */
    public WebDriver getWebDriver() {
        return webDriver;
    }

    /**
     * Uses to get a WebDriverWait.
     *
     * @return a WebDriverWait.
     */
    public WebDriverWait getWebDriverWait() {
        return webDriverWait;
    }

    /**
     * Gets a Browser name.
     * @return Names of Browser
     */
    public static String getBrowser() {
        Properties properties;
        properties = GetProperties.getProperties(PATH_OF_GRADLE_PROPERTIES_FILE);
        return properties.getProperty(BROWSER_NAME).toLowerCase();
    }
}
