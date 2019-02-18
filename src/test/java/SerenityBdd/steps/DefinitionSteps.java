package SerenityBdd.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import SerenityBdd.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Given("opened google page with '$text'")
    public void openedGooglePageWithText(String text){
        endUser.searchInGoogle(text);
    }

    @Given("the user is on the google translate page")
    public void theUserIsOnTheGoogleTranslatePage(){
        endUser.searchForGoogleTranslatePage();
    }

    @Given("selected languages from англійська to українська")
    public void selectedLanguagesFromEnglishtoUkrainian(){
        endUser.selectLanguages();
    }

}
