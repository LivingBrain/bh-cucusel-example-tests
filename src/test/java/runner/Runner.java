package runner;

import com.brainhatchery.cucusel.CucuselRunner;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/ui/features"},
        glue = {"ui/steps"})
public class Runner extends CucuselRunner {
}
