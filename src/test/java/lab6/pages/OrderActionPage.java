package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class OrderActionPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/table/tbody/tr[6]/td[2]/input")
    private WebElementFacade checkName;  //assert if it is the same name

    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElementFacade proceedToCheckOutButton;


    private void clickOnContinueButton() {
        proceedToCheckOutButton.click();
    }
}
