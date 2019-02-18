package SerenityBdd.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.google.com/")

public class GooglePage extends PageObject {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name='q']")
    private WebElement searchField;

    @FindBy(xpath = "//h3[@class='LC20lb']")
    private WebElement firstLink;

    public GooglePage (WebDriver driver){
        this.driver = driver;
        this.driver.get("https://www.google.com");
    }

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
