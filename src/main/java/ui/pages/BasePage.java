package ui.pages;

import com.brainhatchery.cucusel.utils.configuration.CucuselConfig;
import com.brainhatchery.cucusel.utils.driver.Driver;

public class BasePage {

    public void goToUrlFromProperty(String property) {
        Driver.getInstance().manage().window().maximize();
        Driver.getInstance().get(CucuselConfig.getProperty(property));
    }
}
