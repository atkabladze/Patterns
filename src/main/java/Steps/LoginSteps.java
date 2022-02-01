package Steps;

import Data.LoginData;
import Pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();
    LoginData loginData  = new LoginData();

    public LoginSteps setUserName() {
        loginPage.userNameItem.setValue(loginData.userName);
        return this;
    }

    public LoginSteps setPassword() {
        loginPage.passwordItem.setValue(loginData.password);
        return this;
    }
}
