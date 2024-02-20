package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CatBreedsPage extends PageObject {


    @FindBy(xpath = "/html/body/div[2]/div[2]/h2")
    private WebElementFacade catTitle; //assert if it's cats


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[3]/td[1]/a")
    private WebElementFacade secondTable;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[3]/td[2]")
    private WebElementFacade checkCatBreedName; //assert name

    public String getTitleText() {
        return catTitle.getText();
    }

    public String getNameOfTheBreed() {
        return checkCatBreedName.getText();

    }

    public void clickSecondTable() {
        secondTable.click();
    }


}
