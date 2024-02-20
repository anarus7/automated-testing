package lab6.steps.serenity;

import lab6.pages.*;
import lab6.utility.OrderInformation;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class EndUserAddToCartItemSteps {

    Homepage homepage;
    BreedCategory breedCategory;

    BreedPoodle breedPoodle;

    ShoppingCartPage shoppingCartPage;
    PaymentPage paymentPage;

    OrderConfirmationPage orderConfirmationPage;

    OrderSubmittedPage orderSubmittedPage;

    @Step
    public void clickOnDogText() {
        homepage.clickOnDogText();
    }

    @Step
    public void clickOnBreedCategory() {
        breedCategory.clickOnProductIdPoodle();
    }

    @Step
    public void assertTitleIsPoodle(String expectedTitle) {
        String actualTitle = breedPoodle.getTitle();
        Assert.assertEquals("This is not Poodle ", expectedTitle, actualTitle);
    }

    @Step
    public void assertTitleIsDogs(String expectedTitle) {
        String actualTitle = breedCategory.getTextFromTitle();
        Assert.assertEquals("Title is not 'Poodle'", expectedTitle, actualTitle);
    }


    @Step
    public void clickOnBreedPoodle() {
        breedPoodle.clickAddToCart();
    }

    //ShoppingPage1

    @Step
    public void assertQuantity(int expectedQuantity) {
        int actualQuantity = shoppingCartPage.getQuantity();
        Assert.assertEquals("Quantity is not 1", expectedQuantity, actualQuantity);
    }


    @Step
    public void assertDescription(String expected) {
        String actualText = shoppingCartPage.getDescription();
        Assert.assertEquals(expected, actualText);
    }

    @Step
    public void clickUpdateCart() {
        shoppingCartPage.clickUpdateCardButton();
    }

    @Step
    public void clickOnProceedToCheckout() {
        shoppingCartPage.clickOnProceedToCheckout();
    }

    //PaymentPage

    public void assertPaymentInformation() {

        String enteredCardNumber = paymentPage.getCardNumber();
        Assert.assertTrue("Card number should contain only numbers", enteredCardNumber.replaceAll("\\s", "").matches("\\d+"));
        String enteredExpiryDate = paymentPage.getExpiryDate();
        Assert.assertTrue("Expiry date should be in MM/YY format", enteredExpiryDate.matches("^(0[1-9]|1[0-2])/\\d{2}$"));
        String enteredFirstName = paymentPage.getFirstName();
        Assert.assertTrue("First name should contain only letters", enteredFirstName.matches("[A-Za-z]+"));
        String enteredLastName = paymentPage.getLastName();
        Assert.assertTrue("Last name should contain only letters and hyphens", enteredLastName.matches("[A-Za-z\\-]+"));
        String enteredCityName = paymentPage.getCity();
        Assert.assertTrue("City name should contain only letters", enteredCityName.matches("[A-Za-z]+"));
        String enteredStateName = paymentPage.getStateName();
        Assert.assertTrue("State name should contain only letters", enteredStateName.matches("[A-Za-z]+"));
        String enteredZip = paymentPage.getZip();
        Assert.assertTrue("Zip should contain only integers", enteredZip.matches("\\d+"));
        String enteredCountry = paymentPage.getCountry();
        Assert.assertTrue("Country should contain only letters", enteredCountry.matches("[A-Za-z]+"));
    }


    public OrderInformation getOrderFromPaymentPage() {
        OrderInformation orderInformationOnPaymentPage = new OrderInformation(
                paymentPage.getFirstName(), paymentPage.getLastName(),
                paymentPage.getFirstAdress(), paymentPage.getSecondAdrress(),
                paymentPage.getCity(), paymentPage.getStateName(),
                paymentPage.getZip(), paymentPage.getCountry());

        return orderInformationOnPaymentPage;
    }


    public OrderInformation getOrderFromOrderConfirmationPage() {
        OrderInformation orderInformationOrderConfirmationPage = new OrderInformation(
                orderConfirmationPage.getFirstName(), orderConfirmationPage.getLastName(),
                orderConfirmationPage.getAddress1(), orderConfirmationPage.getAddress2(),
                orderConfirmationPage.getCity(), orderConfirmationPage.getState(),
                orderConfirmationPage.getZip(), orderConfirmationPage.getCountry());

        return orderInformationOrderConfirmationPage;
    }


    public OrderInformation getOrderFromSubmitedPage() {
        OrderInformation orderInformationFromSubmittedPage = new OrderInformation(orderSubmittedPage.getFirstName(),
                orderSubmittedPage.getLastName(), orderSubmittedPage.getAddress1(), orderSubmittedPage.getAddress2(), orderSubmittedPage.getCity(),
                orderSubmittedPage.getState(), orderSubmittedPage.getZip(), orderSubmittedPage.getCountry());
        return orderInformationFromSubmittedPage;

    }

    public void assertPaymentDetailsFromPaymentPageAndOrderConfirmation(OrderInformation orderInformation, OrderInformation orderInformation1) {
        Assert.assertEquals(orderInformation, orderInformation1);
    }


    public void assertOrderConfirmationDetailswithOrderSubmittedDdetails(OrderInformation firstPage, OrderInformation secondPage) {
        Assert.assertEquals(firstPage, secondPage);
    }

    @Step
    public void clickOnContinueButton() {
        paymentPage.clickOnContinueButton();
    }


    @Step
    public void clickOnOrderConfirmationButton() {
        orderConfirmationPage.clickOnConfirmButton();
    }


    @Step
    public void assertSubmittedMessage(String messageExpected) {
        String actualMessage = orderSubmittedPage.getSubmmitedMesageText();
        Assert.assertEquals("Submitted message is not as expected", messageExpected, actualMessage);
    }


}

