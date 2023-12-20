package ui.steps;

import com.brainhatchery.cucusel.utils.TestContext;
import io.cucumber.java.en.When;
import ui.pages.BasePage;

public class BaseSteps {
    private final BasePage basePage;
    private final TestContext testContext;

    public BaseSteps(BasePage basePage, TestContext testContext) {
        this.basePage = basePage;
        this.testContext = testContext;
    }

    //region When
    @When("User goes to Sauce Demo page")
    public void userGoesToAdt() {
        basePage.goToUrlFromProperty("saucedemo.url");
    }
    //endregion
}
