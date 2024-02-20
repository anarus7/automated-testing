package lab6.features.search;

import lab6.steps.serenity.EndUserLoginSteps;
import lab6.steps.serenity.EndUserSearchPage;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@UseTestDataFrom("src/test/resources/features/search/searchData.csv")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityParameterizedRunner.class)
public class SearchProductStory {

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "/Users/rusana-maria/Desktop/Programare/Testare/chromedriver");
    }

    String searchString;

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;
    @Steps
    EndUserSearchPage endUserSearchPage;

    @Steps
    EndUserLoginSteps endUserLoginSteps;

    @Test
    public void searchForAproduct() {

        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10).toMillis(), TimeUnit.MILLISECONDS);
        endUserLoginSteps.gotoLoginPage();
        endUserSearchPage.search(searchString);
        endUserSearchPage.assertTitle("JPetStore Demo");


    }

}
