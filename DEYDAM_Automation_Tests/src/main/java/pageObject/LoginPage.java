package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver =driver;
    }
  //Using By as a locator for login elements

  private By username = By.id("username");
    public void enterUsername (String uName){
   //find the username element and enter the username.
        driver.findElement(username).sendKeys(uName);
        }
private By password = By.id("password");
    public void enterUserPassword(String pwd){
//find password field and enter password
      driver.findElement(password).sendKeys(pwd);
    }
    private By loginButton = By.className("btn btn-primary account__btn account__btn--small");
    public DashboardPage clickLoginBtn(){
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        return new DashboardPage(driver);
    }
}
