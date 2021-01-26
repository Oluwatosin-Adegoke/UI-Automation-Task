package Setup;
import PageObjects.SigninPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class setups {
    //Create Login Object
    protected SigninPage signinPage;

    //Create WebDriver Object
    private WebDriver driver;

    @BeforeTest

    public void setUp(){
        //Import ChromeDriver
        System.setProperty("webdriver.chrome.driver","Resources/chromedriver.exe");

        //Instantiate a webDriver object
        driver = new ChromeDriver();

        //Maximize window size
        driver.manage().window().maximize();

        //Launch app URL and wait
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Instantiate login page after launching browser-handle
        signinPage = new SigninPage(driver);
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



