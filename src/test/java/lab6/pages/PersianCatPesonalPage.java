package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PersianCatPesonalPage extends PageObject {


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[3]/td/b/font")
    private WebElementFacade getTitle;

    public String getTitleOnPage() {
        return getTitle.getText();
    }


}
