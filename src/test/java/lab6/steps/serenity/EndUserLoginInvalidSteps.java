package lab6.steps.serenity;

import lab6.pages.Homepage;
import lab6.pages.LoginFailPage;
import lab6.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class EndUserLoginInvalidSteps {

    private WebDriver driver;
    Homepage homepage;
    SignInPage signInPage;

    LoginFailPage loginFailPage;


    @Step
    public void gotoLoginPage() {
        homepage.open();
    }

    @Step
    public void clickSignInButton() {
        homepage.open();
        homepage.clickToSignIn();

    }

    @Step

    public void enterLoginData() {
        signInPage.signIn("anarus8", "veterinarra");
    }

    @Step
    public void assertInvalid_login() {
        String actualErrorMessage = loginFailPage.getErrormessage();
        String expectedErrorMessage = "Invalid username or password. Signon failed.";
        Assert.assertTrue("Error message does not contain 'failed'", actualErrorMessage.contains(expectedErrorMessage));

    }


}
