import Steps.DashboardSteps;
import Steps.LoginSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class LoginTests {
    LoginSteps loginSteps = new LoginSteps();
    DashboardSteps dashboardSteps = new DashboardSteps();


    @Test(description = "Login Scenario")
    @Description("Success login scenario")
    @Story("Valid username and password login test")
    public void successLogin(){
         loginSteps.setUserName()
                 .setPassword();
         dashboardSteps.validateWelcomeText();
    }
}
