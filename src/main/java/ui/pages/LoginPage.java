package ui.pages;

import com.brainhatchery.cucusel.utils.webelements.WebElementLocator;
import com.brainhatchery.cucusel.utils.webelements.enums.Locator;

public class LoginPage {

    private final WebElementLocator login_userNameInput = new WebElementLocator(Locator.ID, "user-name");
    private final WebElementLocator login_passwordInput = new WebElementLocator(Locator.ID, "password");
    private final WebElementLocator login_loginButton = new WebElementLocator(Locator.ID, "login-button");

    public LoginPage setUserName(String username) {
        login_userNameInput.sendKeys(username);
        return this;
    }

    public LoginPage setUserPassword(String userPassword) {
        login_passwordInput.sendKeys(userPassword);
        return this;
    }

    public InventoryPage clickLoginButton() {
        login_loginButton.click();
        return new InventoryPage();
    }
}
