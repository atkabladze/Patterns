package Steps;

import Pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    public LoginSteps setUserName(String userName) {
        loginPage.userNameItem.setValue(userName);
        return this;
    }

    public LoginSteps setPassword(String password) {
        loginPage.userNameItem.setValue(password);
        return this;
    }
}
