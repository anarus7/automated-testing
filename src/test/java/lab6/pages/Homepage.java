package lab6.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class Homepage extends PageObject {


    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div/map/area[5]")
    private WebElementFacade catImage;

    @FindBy(id = "MenuContent")
    private WebElementFacade signIn;


    @FindBy(xpath = "/html/body/div[1]/div[3]/div/form/input[1]")
    private WebElementFacade searchFormInput;


    @FindBy(css = "input[value='Search']")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//*[@id=\"SidebarContent\"]/a[2]/img")
    private WebElementFacade searchDogs;


    public void clickToSignIn() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.pollingEvery(500, TimeUnit.MILLISECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
    }


    public void clickOnDogText() {
        searchDogs.click();
    }


    public void searchForAproduct(String productName) {
        searchFormInput.type(productName);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickOnCatImage() {
        catImage.click();
    }


}


