package ui.steps;

import io.cucumber.java.en.When;
import ui.pages.LoginPage;

import static utils.Users.userRoles;

public class LoginSteps {
    private final LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    //region When
    @When("^User logs in as (Standard user|Locked user|Problem user|Performance user) on Login page$")
    public void userLogsInWithUsernameAndPassword(String userRole) {
        String userName = userRoles.get(userRole).getUserName();
        String userPassword = userRoles.get(userRole).getUserPassword();
        loginPage
                .setUserName(userName)
                .setUserPassword(userPassword)
                .clickLoginButton();
    }
    //endregion
}
