package lab6.steps.serenity;


import lab6.pages.Homepage;
import lab6.pages.SignInPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class EndUserLoginSteps {

    Homepage homepage;
    SignInPage signInPage;

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
        signInPage.signIn("anarus7",
                "veterinara");
    }

    @Step
    public void assertCurrentURl() {
        Assert.assertEquals("https://petstore.octoperf.com/actions/Catalog.action",
                "https://petstore.octoperf.com/actions/Catalog.action");

    }


}