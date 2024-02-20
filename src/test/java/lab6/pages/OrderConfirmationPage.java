package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class OrderConfirmationPage extends PageObject {


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[3]/td[2]")
    private WebElementFacade firstName;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[4]/td[2]")
    private WebElementFacade lastName;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[14]/td[2]")
    private WebElementFacade address1;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[15]/td[2]")
    private WebElementFacade address2;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[7]/td[2]")
    private WebElementFacade city;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[8]/td[2]")
    private WebElementFacade state;

    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[9]/td[2]")
    private WebElementFacade zip;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[10]/td[2]")
    private WebElementFacade country;


    @FindBy(xpath = "/html/body/div[2]/div[2]/a")
    private WebElementFacade confirmButton;


    public void clickOnConfirmButton() {
        confirmButton.click();
    }


    public String getFirstName() {
        return firstName.getText();
    }

    public String getLastName() {
        return lastName.getText();
    }

    public String getAddress1() {
        return address1.getText();
    }

    public String getAddress2() {
        return address2.getText();
    }

    public String getCity() {
        return city.getText();
    }

    public String getState() {
        return state.getText();
    }

    public String getZip() {
        return zip.getText();
    }

    public String getCountry() {
        return country.getText();
    }


}
