package SerenityBdd.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.google.com/")

public class GooglePage extends PageObject {

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//h3[@class='LC20lb']")
    private WebElement firstLink;

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getFirstLink() {
        return firstLink;
    }

    public void searchText(String text){
        getSearchField().sendKeys(text);
        getSearchField().sendKeys(Keys.RETURN);
    }
}
