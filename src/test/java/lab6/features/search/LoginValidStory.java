package lab6.features.search;

import lab6.steps.serenity.EndUserLoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class LoginValidStory {

    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "/Users/rusana-maria/Desktop/Programare/Testare/chromedriver");
    }

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;
    @Steps
    public EndUserLoginSteps endUserLoginSteps;


    @Test
    public void successful_login() {
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10).toMillis(), TimeUnit.MILLISECONDS);
        endUserLoginSteps.gotoLoginPage();
        endUserLoginSteps.clickSignInButton();
        endUserLoginSteps.enterLoginData();
        endUserLoginSteps.assertCurrentURl();
    }


}
