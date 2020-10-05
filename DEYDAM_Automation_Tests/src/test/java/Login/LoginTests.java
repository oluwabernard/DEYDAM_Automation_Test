package Login;

import Setup.SetUps;
import org.testng.annotations.Test;
import pageObject.DashboardPage;
import pageObject.LoginPage;

public class LoginTests extends SetUps {
 //testNG annotation
 @Test
 public void testLogin() throws InterruptedException {

     loginPage.enterUsername("MOUNTAIN");
     loginPage.enterUserPassword("MOUNTAIN12");
   //Handle for DashboardPage
     DashboardPage dashboardPage=loginPage.clickLoginBtn();
     dashboardPage.clickMyMusic();
     dashboardPage.clickMessages();
     dashboardPage.clickWelcome();
     loginPage=dashboardPage.clickLogout();
 }
}
