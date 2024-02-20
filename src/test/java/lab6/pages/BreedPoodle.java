package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class BreedPoodle extends PageObject {


    @FindBy(xpath = "//*[@id=\"Catalog\"]/h2")
    private WebElementFacade poodleTitle; //will asser it it eqauls


    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")
    private WebElementFacade poodleProductId; //asert it it eqauls


    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")
    private WebElementFacade addToCartbutton;


    public void clickAddToCart() {
        addToCartbutton.click();
    }

    public String getTitle() {
        return poodleTitle.getText();
    }


}
