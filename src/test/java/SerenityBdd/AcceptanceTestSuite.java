package SerenityBdd;


import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.webdriver.Configuration;

import static net.thucydides.core.ThucydidesSystemProperty.WEBDRIVER_DRIVER;
import static net.thucydides.core.ThucydidesSystemProperty.WEBDRIVER_PROVIDED_TYPE;

public class AcceptanceTestSuite extends SerenityStories {
    private Configuration configuration;

    public  AcceptanceTestSuite(){
        configuration = super.getSystemConfiguration();
        configuration.setIfUndefined(WEBDRIVER_DRIVER.getPropertyName(),"provided");
        configuration.setIfUndefined(WEBDRIVER_PROVIDED_TYPE.getPropertyName(), "mydriver");
        configuration.setIfUndefined("webdriver.provided.mydriver", "drivers.ChromeWebDriver");
    }
}
