package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import trello.navigatePages.NavigatePages;
import trello.pages.LoginPage;
import trello.pages.TransporterPage;

public class Hook {

    private WebDriver driver;
    private static final String userName = "oscar.lopez@fundacion-jala.org";
    private static final String userPassword = "O3728236l";
    @Before
    public void login() {
        TransporterPage.navigateToURL(NavigatePages.getLoginPageUrl());
        LoginPage loginPage = new LoginPage();
        loginPage.loginInToTrello(userName, userPassword);
    }

    @After
    public void closeDriver() {

    }
}
