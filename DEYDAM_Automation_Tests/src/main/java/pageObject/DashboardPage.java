package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
 //create a webDriver object for this
 private WebDriver driver;
//create a constructor
    public DashboardPage(WebDriver driver){
        this.driver=driver;
    }
  //Locate element
    private By MyMusic =By.className("sidebar__link-title");
    private By MOUNTAIN=By.className("topbar__avatar-name");
    private By logout = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]/p");

 //function to interact with the element
public void clickMyMusic()throws InterruptedException{
    //wait
    Thread.sleep(3000);
    driver.findElement(MyMusic).click();
}

 public void clickWelcome()throws InterruptedException{
  //wait for 10secs before executing
  Thread.sleep(10000);
  driver.findElement(MOUNTAIN).click();
 }


 public LoginPage clickLogout()throws InterruptedException{
//wait for 3secs before executing
Thread.sleep(3000);
driver.findElement(logout).click();
return new LoginPage(driver);
 }

}
