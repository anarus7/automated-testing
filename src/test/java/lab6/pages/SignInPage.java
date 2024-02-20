package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SignInPage extends PageObject {

    @FindBy(name = "username")
    public WebElementFacade usernameInput;

    @FindBy(name = "password")
    private WebElementFacade passwordInput;

    @FindBy(name = "signon")
    private WebElementFacade loginButton;


    public void signIn(String username, String password) {
        usernameInput.type(username);
        passwordInput.type(password);
        loginButton.click();
    }


}
