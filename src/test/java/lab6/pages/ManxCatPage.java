package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ManxCatPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[3]")
    private WebElementFacade name;


    public String getName() {
        return name.getText();
    }


}
