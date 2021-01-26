package setUp;

import PageObject.DashboardPage;
import PageObject.SignInpage;
import PageObject.SignInpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class setUps {
    //Create WebDriver Object
    private WebDriver driver;
    private Object SignInpage;
    public static DashboardPage dashboardPage;
    private Object DashboardPage;

    public setUps(WebDriver driver) {
    }

    @BeforeTest

    public void setUp(){
        //Import ChromeDriver
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");

        //Instantiate a webDriver object
        driver = new ChromeDriver();

        //Maximize window size
        driver.manage().window().maximize();

        //Launch app URL and wait
        driver.get("https://www.konga.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Instantiate Signin page
        SignInpage = new SignInpage(driver);
        DashboardPage = new DashboardPage(driver);


    }
    @AfterTest
    public  void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public void closeBrowser(){
        driver.quit();
    }
}


