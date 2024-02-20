package lab6.steps.serenity;

import lab6.pages.Homepage;
import lab6.pages.ManxCatPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class EndUserSearchPage {

    Homepage homepage;
    ManxCatPage manxCatPage;

    @Step
    public void search(String searchValue) {
        homepage.searchForAproduct(searchValue);
        homepage.clickSearchButton();
    }

    @Step
    public void assertTitle(String expected) {
        String currentTitle = manxCatPage.getTitle();
        Assert.assertEquals("title is not equal", expected, currentTitle);

    }
}
