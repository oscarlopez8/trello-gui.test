package trello.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BoardPage extends BasePage {

    public BoardPage() {
        //driver.get(url);
    }

    @FindBy(className = CSS_BUTTON_PLUS)
    WebElement buttonPlus;

    @FindBy(className = CSS_BUTTON_CREATE_A_BOARD)
    WebElement buttonCreateBoard;

    @FindBy(className = INPUT_NAME)
    WebElement inputName;

    @FindBy(className = SELECT_ORGANIZATION)
    WebElement selectOrganization;

    @FindBy(className = KIND_OF_BOARD)
    WebElement kindOfBoard;

    @FindBy(className = CREATE_BOARD_BUTTON)
    WebElement createBoardButton;

    private static final String CSS_BUTTON_PLUS = "_3r1LXvjBp8zfAv";
    private static final String CSS_BUTTON_CREATE_A_BOARD = "_2jR0BZMM5cBReR";
    private static final String INPUT_NAME = "_23NUW98LaZfBpQ";
    private static final String SELECT_ORGANIZATION = "_1se-PM9Q1YyEtg"; //_1se-PM9Q1YyEtg
    private static final String KIND_OF_BOARD = "_1Lkx3EjS3wCrs7";
    private static final String CREATE_BOARD_BUTTON = "_3UeOvlU6B5KUnS";

    public void clickOnPlusButton() {
        //wait.until(ExpectedConditions.elementToBeSelected(this.buttonCreateBoard);// .elementToBeClickable(this.buttonPlus));
        buttonPlus.click();
        //wait.until(ExpectedConditions.elementToBeSelected(this.buttonCreateBoard));
        buttonCreateBoard.click();

    }

    public void setInputName(String name) {
        this.inputName.sendKeys(name);
    }

    public void setSelectOrganization(String name) {
        this.selectOrganization.sendKeys(name);
    }

    public void setKindOfBoard(String name) {
        this.kindOfBoard.sendKeys(name);
    }

    private void clickCreateButton() {
        this.createBoardButton.click();
    }

    public void createBoard(final String boardName) {
        //wait.until(ExpectedConditions.elementToBeClickable(this.inputName));
        setInputName(boardName);
        clickCreateButton();
        String uri = driver.getTitle();

        String actualResult = driver.findElement(By.className("js-board-editing-target board-header-btn-text")).getText();
        System.out.println(actualResult);
    }

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        //To do
    }
}
