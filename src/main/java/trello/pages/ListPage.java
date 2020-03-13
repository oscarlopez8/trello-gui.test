package trello.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ListPage extends BasePage {

    private static final String LIST_NAME = "NewList";
    private static final String NAME_INPUT = "name";

    @FindBy(name = NAME_INPUT)
    WebElement textName;

//    @FindBy(xpath = "//*[@id=board]/div/form/div/input")
//    private WebElement buttonAddNewList;

    @FindBy(className = "js-save-edit")
    private WebElement buttonAddNewList;

    /**
     * Writes in listNameField WebElement.
     *
     * @param text is to write in listNameField WebElement.
     */
    private void setListName(final String text) {
        textName.sendKeys(text);
    }

    public void writeOnListName(final String nameList) {
        setListName(nameList);
    }

    public void clickOnAddNewList() {
        this.buttonAddNewList.click();
    }

//    /**
//     * Clicks to submit login form.
//     */
//    private void clickLoginButton() {
//        loginButton.click();
//    }

    @Override
    protected void waitUntilPageObjectIsLoaded() {
        //wait.until(ExpectedConditions.elementToBeClickable(this.textName));
    }
}
