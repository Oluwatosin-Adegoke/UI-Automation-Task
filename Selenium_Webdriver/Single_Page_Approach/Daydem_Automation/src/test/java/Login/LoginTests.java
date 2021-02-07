package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import the selenium webDriver
    private WebDriver driver;

    //import chromedriver
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        //input project URL = DayDam login URL
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        //wait for 5 seconds
        Thread.sleep(5000);
        //maximize the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //locate username field
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[1]/div/input")).sendKeys("Oluwatosin_Adegoke");
        //Locate password field
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[2]/div[1]/input")).sendKeys("Supersleeper99");
        //Click on the Login button
        driver.findElement(By.xpath("/html/body/div/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click();
        Thread.sleep(10000);

        }

        @Test(priority = 0)
        public void testSuccessfulLogin(){
            if (driver.getCurrentUrl ().contains ("https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/feed"))
                //Pass
                System.out.println ("The Page URL contains /app/feed");
            else
                //Fail
         System.out.println ("The Page URL does not contain /app/feed");
        }

        @Test(priority = 1)
        public void testLogout() throws InterruptedException {
            //click on the profile button
            WebDriver driver = null;
            driver.findElement (By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button")).click ();
            Thread.sleep (2000);
            //click on the logout button
            driver.findElement (By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]/p")).click ();
            //printout response based on status
            if(driver.getCurrentUrl ().contains ("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login\""))
                //Pass
                System.out.println ("The Login page URL contains /login");
            else
                //Fail
                System.out.println ("The Login URL does not contain /login");
        }

        @Test(priority = 1)
        public void testNegativeLogin(){
            By driver = null;
            driver.findElement ((SearchContext) By.id("username")).sendKeys ("Oluwatosin_Adegoke");
            driver.findElement ((SearchContext) By.id("password")).sendKeys ("Supersleeper99");
            driver.findElement ((SearchContext) By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click ();
            String expectedErrorMessage = "Login Failed: Invalid username or password";
            String actualErrorMessage = driver.findElement((SearchContext) By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[4]/div/div/p")).getText();
            Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
        }


    //initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setup();
    }
    @AfterTest
            public void closeBrowser () throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

    };

