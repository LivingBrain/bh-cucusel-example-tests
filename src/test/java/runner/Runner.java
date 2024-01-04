package runner;

import com.brainhatchery.cucusel.CucuselRunner;
import com.brainhatchery.cucusel.ui.driver.BrowserOptionsContext;
import io.cucumber.java.Before;
import io.cucumber.testng.CucumberOptions;

//Add runner to glue so Cucumber Hooks in this class will be processed.
@CucumberOptions(
        features = {"src/test/resources/ui/features"},
        glue = {"ui/steps", "runner"})
public class Runner extends CucuselRunner {

    @Before("@UI")
    public void setupDriverOptions() {
        BrowserOptionsContext.getInstance().setCapability("browserVersion", "NewBrowserVersion");
    }
}
