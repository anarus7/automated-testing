package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaymentPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"Catalog\"]/form/input")
    private WebElementFacade continueButton;


    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[3]/td[2]/input")
    private WebElementFacade cardNumberInput;


    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[4]/td[2]/input")
    private WebElementFacade expiryDateMMYYYY;


    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[6]/td[2]/input")
    private WebElementFacade firstName;

    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[7]/td[2]/input")
    private WebElementFacade lastName;

    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[8]/td[2]/input")
    private WebElementFacade addres1;

    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[9]/td[2]/input")
    private WebElementFacade addres2;


    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[10]/td[2]/input")
    private WebElementFacade cityName;//only letters

    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[11]/td[2]/input")
    private WebElementFacade stateName; //only letters

    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[12]/td[2]/input")
    private WebElementFacade zip; //only integers

    @FindBy(xpath = "/html/body/div[2]/div/form/table/tbody/tr[13]/td[2]/input")
    private WebElementFacade country; // only letters

    public void clickOnContinueButton() {
        continueButton.click();
    }


    public String getCardNumber() {
        return cardNumberInput.getValue();
    }

    public String getExpiryDate() {
        return expiryDateMMYYYY.getValue();
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public String getLastName() {
        return lastName.getValue();
    }

    public String getFirstAdress() {
        return addres1.getValue();
    }

    public String getSecondAdrress() {
        return addres2.getValue();
    }

    public String getCity() {
        return cityName.getValue();
    }

    public String getStateName() {
        return stateName.getValue();
    }

    public String getZip() {
        return zip.getValue();
    }

    public String getCountry() {
        return country.getValue();
    }

}
