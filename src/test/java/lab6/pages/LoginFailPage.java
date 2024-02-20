package lab6.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class LoginFailPage extends PageObject {

    @FindBy(id = "Content")
    private WebElementFacade errorMessage;


    public String getErrormessage() {
        return errorMessage.getText();
    }


}
