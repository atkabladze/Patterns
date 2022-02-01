import Steps.DashboardSteps;
import Steps.LoginSteps;
import org.testng.annotations.Test;

public class LoginTests {
    LoginSteps loginSteps = new LoginSteps();
    DashboardSteps dashboardSteps = new DashboardSteps();
    @Test
    public void successLogin(){
         loginSteps.setUserName("test")
                 .setPassword("test123");
         dashboardSteps.validateWelcomeText();
    }
}
