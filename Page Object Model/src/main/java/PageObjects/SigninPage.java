 package PageObjects;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import Setup.setups;

 public class SigninPage extends setups {
     public SigninPage(WebDriver driver) {

         this.driver = driver;
     }

     private WebDriver driver;
     //using By as a locator to identify the login fields
     private By username = By.id("username");
     private By password = By.id("password");
     private By Signin = By.xpath("button");

     public void enterUsername() {
         //Find the username element and enter the username
         driver.findElement(username).sendKeys("Oluwatosin_Adegoke");
     }

     public void enterPasword() {
         //Find the username element and enter the password
         driver.findElement(password).sendKeys("Supersleeper99");

     }

     public DashboardPage clicksigninbutton() {
         //Find the Signinbutton and click
         driver.findElement(Signin).click();
         return new DashboardPage (driver);
     }
 }





