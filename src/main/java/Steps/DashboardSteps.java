package Steps;

import Pages.DashboardPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

public class DashboardSteps {
    DashboardPage dashboardPage = new DashboardPage();


    public DashboardSteps validateWelcomeText(){
        dashboardPage.welcomeMessage.shouldHave(Condition.text("123"));
         return this;
    }
}
