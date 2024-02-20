package lab6.features.search;

import lab6.pages.Homepage;
import lab6.steps.serenity.EndUserLoginSteps;
import lab6.steps.serenity.EndUserNavigationToAnItemSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityRunner.class)
public class NavigationToAnItemStory {

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "/Users/rusana-maria/Desktop/Programare/Testare/chromedriver");
    }

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;
    @Steps
    EndUserNavigationToAnItemSteps endUserNavigationToAnItemSteps;
    @Steps
    Homepage homepage;
    @Steps
    EndUserLoginSteps endUserLoginSteps;

    @Test
    public void navigateToAnItem() {
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10).toMillis(), TimeUnit.MILLISECONDS);
        endUserLoginSteps.gotoLoginPage();
        homepage.clickOnCatImage();
        endUserNavigationToAnItemSteps.assertTitle("JPetStore Demo");
        endUserNavigationToAnItemSteps.assertSecondItemTitle("Persian");
        endUserNavigationToAnItemSteps.clickOnSecondItem();
        endUserNavigationToAnItemSteps.assertTitlePersian("Persian");
        endUserNavigationToAnItemSteps.clickOnFirstItem();
        endUserNavigationToAnItemSteps.assertTitleOnPersianPage("Adult Female Persian");

    }

}
