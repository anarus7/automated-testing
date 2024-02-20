package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class OrderSubmittedPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"Content\"]/ul/li")
    private WebElementFacade submittedMessage; // will assert


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[1]/th")
    private WebElementFacade orderDetails;


    public String getSubmmitedMesageText() {
        return submittedMessage.getText();
    }


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[16]/td[2]")
    private WebElementFacade firstName;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[17]/td[2]")
    private WebElementFacade lastName;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[18]/td[2]")
    private WebElementFacade address1;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[19]/td[2]")
    private WebElementFacade address2;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[20]/td[2]")
    private WebElementFacade city;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[21]/td[2]")
    private WebElementFacade state;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[22]/td[2]")
    private WebElementFacade zip;


    @FindBy(xpath = "/html/body/div[2]/div[2]/table/tbody/tr[23]/td[2]")
    private WebElementFacade country;


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
