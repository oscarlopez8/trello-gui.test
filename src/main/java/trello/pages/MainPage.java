package trello.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    //private static final String URL = "https://trello.com/oscarlopez287/boards";

    public MainPage() {
        //driver.get(url);
    }

    @FindBy(className = SPAN_CLASS)
    private WebElement fullNameButton;

    private static final String DIV_CLASS_LIST = "div.js-list:nth-child(1)>div:nth-child(1)>div:nth-child(1)>div:nth-child(1)";
    //
    private static final String SPAN_CLASS = "_24AWINHReYjNBf";
    private static final String DIV_CSS = "div[title='%s']";

    private static final String DIV_CLASS_USER_NAME = "_1FekJJAz6Hu32v";


    /**
     * Clicks on User Button.
     *
     */
    public String findUserName() {
        fullNameButton.click();
        String classNameText = driver.findElement(By.className("_24AWINHReYjNBf")).getText();
        return classNameText;
    }

    /**
     * Goes to the board page.
     *
     * @param boardTitle is the title of the board.
     */
    public void clickOnABoard(final String boardTitle) {
        String boardCss = String.format(DIV_CSS, boardTitle);
        WebElement boardButton = driver.findElement(By.cssSelector(boardCss));
        boardButton.click();
     }

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        //To do
    }
}
