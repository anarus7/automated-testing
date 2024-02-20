package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BreedPersianPage extends PageObject {

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[2]/td[1]/a")
    private WebElementFacade firstItem;

    @FindBy(xpath = "/html/body/div[2]/div[2]/h2")
    private WebElementFacade title;

    public String getTitleText() {
        return title.getText();
    }

    public void clickOnFirstItem() {
        firstItem.click();
    }


}
