package Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;
public class LoginTests {

        //import the selenium webDriver
        private WebDriver driver;


        @BeforeClass
        public void setup() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://monosnap.com/");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[4]")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]")).click();
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[1]/input[1]")).sendKeys("tosinadegoke99@gmail.com");
            driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[1]/input[2]")).sendKeys("Supersleeper99");
            driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
            Thread.sleep(10000);

            // close the browser after test
            driver.quit();}

        public static void main(String args[])throws InterruptedException{
            LoginTests tests =new LoginTests();
            tests.setup();

        }

}
