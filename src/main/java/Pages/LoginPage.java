package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
            userNameItem = $("#username"),
            passwordItem = $("#password");
}
