package Steps;

import Data.LoginData;
import Pages.LoginPage;
import io.qameta.allure.Step;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    LoginData loginData  = new LoginData();

    @Step
    public LoginSteps setUserName() {
        loginPage.userNameItem.setValue(loginData.userName);
        return this;
    }

    @Step
    public LoginSteps setPassword() {
        loginPage.passwordItem.setValue(loginData.password);
        return this;
    }
}
