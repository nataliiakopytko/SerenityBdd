package SerenityBdd.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.google.com/")

public class GoogleTranslatePage extends PageObject {

    private WebDriver driver;

    @FindBy(xpath = "//div[@class = 'sl-more tlid-open-source-language-list'] ")
    private WebElement moreButtonLeft;

    @FindBy(xpath = "//div[@aria-label and contains(text(), 'англійська')]")
    private WebElement firstLanguage;

    @FindBy(xpath = "//div[@class = 'tl-more tlid-open-target-language-list']")
    private WebElement moreButtonRight;

    @FindBy(xpath = "//div[@aria-label and contains(text(), 'українська')]")
    private WebElement secondLanguage;

    public String getFirstLanguage(){
       return firstLanguage.getText();
    }

    public String getSecondLanguage(){
        return secondLanguage.getText();
    }

    public void selectEnglish() {
        moreButtonLeft.click();
        firstLanguage.click();
    }
    public void selectUkrainian(){
        moreButtonRight.click();
        secondLanguage.click();
    }
}