package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import the selenium webDriver
    private WebDriver driver;
    @BeforeClass
    //import chromedriver
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //input project URL = facebook URL
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/");
        //wait for 5 seconds
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);
        //locate username field
        driver.findElement(By.id("email")).sendKeys("adegokeolayemi661@gmail.com");
        //Locate password field
        driver.findElement(By.id("pass")).sendKeys("yemyem661");
        //Click on the Login button
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
        Thread.sleep(10000);

        // close the browser after test
        driver.quit();
    }

    //initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setup();

    }

}

