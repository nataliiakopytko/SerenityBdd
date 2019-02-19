package SerenityBdd.steps.serenity;

import SerenityBdd.pages.DictionaryPage;
import SerenityBdd.pages.GooglePage;
import SerenityBdd.pages.GoogleTranslatePage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.*;

public class EndUserSteps {

    DictionaryPage dictionaryPage;
    GooglePage googlePage;
    GoogleTranslatePage googleTranslatePage;

    @Step
    public void enters(String keyword) {
        dictionaryPage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
        dictionaryPage.lookup_terms();
    }

    @Step
    public void should_see_definition(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

    @Step
    public void is_the_home_page() {
        dictionaryPage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }

    @Step
    public void searchInGoogle(String text) {
        googlePage.open();
        googlePage.searchText(text);
        googlePage.getFirstLink().click();
    }

    @Step
    public void searchForGoogleTranslatePage() {
        googlePage.open();
        googlePage.searchText("Google Translate");
        googlePage.getFirstLink().click();
    }

    @Step
    public void selectLanguages() {
        googleTranslatePage.selectEnglish();
        googleTranslatePage.selectUkrainian();
    }

    @Step
    public void lookUpTranslation(String word) {
        googleTranslatePage.typeWord(word);
    }

    @Step
    public void shouldSeeTranslation(String translation) {
        assertEquals(googleTranslatePage.getTranslatedWord(), translation);
    }

    @Step
    public void checkNumberOfCharacters(int number) {
        assertEquals(googleTranslatePage.getNumberOfCharacters(), number);
    }

    @Step
    public void shouldSeeTheDefinition(String definition) {
        assertEquals(googleTranslatePage.getDefinition(), definition);
    }
}