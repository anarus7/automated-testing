package lab6.steps.serenity;

import lab6.pages.BreedPersianPage;
import lab6.pages.CatBreedsPage;
import lab6.pages.Homepage;
import lab6.pages.PersianCatPesonalPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class EndUserNavigationToAnItemSteps {

    Homepage homepage;

    CatBreedsPage catBreedsPage;

    BreedPersianPage breedPersianPage;

    PersianCatPesonalPage persianCatPesonalPage;


    @Step
    public void clickOnImage() {
        homepage.clickOnCatImage();
    }


    @Step
    public void assertTitle(String titleExpected) {
        String actualTitle = catBreedsPage.getTitle();
        Assert.assertEquals(titleExpected, actualTitle);
    }


    @Step
    public void assertSecondItemTitle(String expectedTitle) {
        String actual = catBreedsPage.getNameOfTheBreed();
        Assert.assertEquals(expectedTitle, actual);
    }

    @Step
    public void clickOnSecondItem() {
        catBreedsPage.clickSecondTable();
    }

    @Step
    public void assertTitlePersian(String expectedTitle) {
        String actualTitle = breedPersianPage.getTitleText();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Step

    public void clickOnFirstItem() {
        breedPersianPage.clickOnFirstItem();
    }


    @Step
    public void assertTitleOnPersianPage(String expected) {
        String actualTitle = persianCatPesonalPage.getTitleOnPage();
        Assert.assertEquals(expected, actualTitle);

    }


}
