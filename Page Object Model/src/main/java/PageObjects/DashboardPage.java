package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DashboardPage {
    public DashboardPage(WebDriver driver) {

        this.driver = driver;
    }

    private WebDriver driver;
    //Using By to locate dashboard elements
    private By name = By.xpath("/html/body/div/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button");
    private By logoutbutton = By.xpath("/html/body/div/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]");




    public void clickname() {
        //Find the Oluwatosin_Adegoke element and click on the button
        driver.findElement(name).click();
    }

    public SigninPage clickLogout() {
        //Find the logout element and click on the logout button
        driver.findElement(logoutbutton).click();
        return new SigninPage(driver);
    }

}




