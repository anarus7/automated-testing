package lab6.features.search;

import lab6.steps.serenity.EndUserAddToCartItemSteps;
import lab6.steps.serenity.EndUserLoginSteps;
import lab6.utility.OrderInformation;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityRunner.class)
public class AddToCartItemStory {
    
    @Steps
    EndUserLoginSteps endUserLoginSteps;
    @Steps
    EndUserAddToCartItemSteps endUserAddToCartItemSteps;


    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "/Users/rusana-maria/Desktop/Programare/Testare/chromedriver");
    }

    @Managed(uniqueSession = true, driver = "chrome")
    public WebDriver webdriver;


    @Test
    public void addItemToCart() {
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10).toMillis(), TimeUnit.MILLISECONDS);
        endUserLoginSteps.gotoLoginPage();
        endUserLoginSteps.clickSignInButton();
        endUserLoginSteps.enterLoginData();

        //breedCategory
        endUserAddToCartItemSteps.clickOnDogText();
        endUserAddToCartItemSteps.clickOnBreedCategory();
        endUserAddToCartItemSteps.assertTitleIsPoodle("Poodle");
        endUserAddToCartItemSteps.assertTitleIsDogs("Poodle");
        endUserAddToCartItemSteps.clickOnBreedPoodle();

        //shoppingCartPage1
        endUserAddToCartItemSteps.assertQuantity(1);
        endUserAddToCartItemSteps.assertDescription("Male Puppy Poodle");
        endUserAddToCartItemSteps.clickUpdateCart();
        endUserAddToCartItemSteps.clickOnProceedToCheckout();

        //shoppingCartPage2//PersonalDetails
        endUserAddToCartItemSteps.assertPaymentInformation();

        OrderInformation orderFromPaymentPage = endUserAddToCartItemSteps.getOrderFromPaymentPage();

        endUserAddToCartItemSteps.clickOnContinueButton();

        OrderInformation orderFromOrderConfirmationPage = endUserAddToCartItemSteps.getOrderFromOrderConfirmationPage();

        endUserAddToCartItemSteps.assertPaymentDetailsFromPaymentPageAndOrderConfirmation(orderFromPaymentPage, orderFromOrderConfirmationPage);


        //orderConfirmationPage
        endUserAddToCartItemSteps.clickOnOrderConfirmationButton();

        OrderInformation orderInformationSubmittedPage = endUserAddToCartItemSteps.getOrderFromSubmitedPage();

        endUserAddToCartItemSteps.assertOrderConfirmationDetailswithOrderSubmittedDdetails(orderFromOrderConfirmationPage, orderInformationSubmittedPage);

        endUserAddToCartItemSteps.assertSubmittedMessage("Thank you, your order has been submitted.");


    }


}

