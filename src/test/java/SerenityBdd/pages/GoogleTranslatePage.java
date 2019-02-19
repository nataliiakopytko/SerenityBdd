package SerenityBdd.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleTranslatePage extends PageObject {

    @FindBy(xpath = "//div[@class = 'sl-more tlid-open-source-language-list'] ")
    private WebElement moreButtonLeft;

    @FindBy(xpath = "//div[@class = 'language_list_section']//div[contains(@onclick, 'sl_list_en')]")
    private WebElement firstLanguage;

    @FindBy(xpath = "//div[@class = 'tl-more tlid-open-target-language-list']")
    private WebElement moreButtonRight;

    @FindBy(xpath = "//div[@class = 'language_list_section']//div[@class = 'language_list_item_icon tl_list_uk_checkmark']")
    private WebElement secondLanguage;

    @FindBy(xpath = "//textarea[@id = 'source']")
    private WebElement inputField;

    @FindBy(xpath = "//span[@title]")
    private WebElement translatedWord;

    @FindBy(xpath = "//div[@class='gt-def-info'][2]//div[@class='gt-def-row']")
    private WebElement definition;

    public void selectEnglish() {
        moreButtonLeft.click();
        firstLanguage.click();
    }
    public void selectUkrainian(){
        moreButtonRight.click();
        secondLanguage.click();
    }

    public void typeWord(String word){
        inputField.click();
        inputField.sendKeys(word);
        inputField.sendKeys(Keys.RETURN);
    }

    public String getTranslatedWord(){
        return translatedWord.getText();
    }

    public int getNumberOfCharacters() {
       return getTranslatedWord().length();
    }

    public String getDefinition() {
        return definition.getText();
    }
}
