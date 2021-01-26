package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInpage {


    public SignInpage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;
    //Using by as a locator for the signin field
    private By Signin = By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div/div[3]/div[2]/a");
    private By username = By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[1]/input");
    private By password = By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[2]/input");
    private By Signinbutton = By.xpath("/html/body/div[1]/div/section/div[4]/section/section/aside/div[2]/div/form/div[3]/button");



    public void Signin(){
        //find the signin button and click
        driver.findElement(Signin).click();
    }
    public void enterusername(String uname){
        //find the username field and sendkeys
        driver.findElement(username).sendKeys("tosinadegoke99@gmail.com");
    }
    public void enterpassword(String pword){
        //find the password field and sendkeys
        driver.findElement(password).sendKeys("Supersleeper99");
    }
    public DashboardPage clickSigninbutton(){
        //find the signinbutton and click
        driver.findElement(Signinbutton).click();
        return new DashboardPage(driver);
    }
}

