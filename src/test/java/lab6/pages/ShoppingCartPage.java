package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ShoppingCartPage extends PageObject {


    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/a")
    private WebElementFacade proceedToCheckoutButton;


    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[3]/td[1]/input")
    private WebElementFacade updateCardButton;


    @FindBy(xpath = "//*[@id=\"Cart\"]/form/table/tbody/tr[2]/td[5]/input")
    private WebElementFacade quantityInput;


    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/form/table/tbody/tr[2]/td[3]")
    private WebElementFacade description;


    public void clickUpdateCardButton() {
        updateCardButton.click();
    }

    public void clickOnProceedToCheckout() {
        proceedToCheckoutButton.click();
    }

    public int getQuantity() {
        return Integer.parseInt(quantityInput.getAttribute("value"));
    }

    public String getDescription() {
        return description.getText();
    }

}