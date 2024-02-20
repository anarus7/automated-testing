package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class BreedCategory extends PageObject {


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[3]/td[1]/a")
    private WebElementFacade productIdPoodle;


    @FindBy(xpath = "//*[@id=\"Catalog\"]/h2")
    private WebElementFacade title; //will assert if it's dog


    public void clickOnProductIdPoodle() {
        productIdPoodle.click();

    }

    public String getTextFromTitle() {
        return title.getText().trim();
    }


}
