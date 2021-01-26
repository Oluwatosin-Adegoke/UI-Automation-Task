package SetUp;

import org.testng.annotations.Test;

public class SignInpageTest {
    @Test
    public void VerifyURL() {
        String pageURL = "https://www.konga.com/";
        if (pageURL.equalsIgnoreCase("https://www.konga.com/")) {
            System.out.println("The webpage URL is" + pageURL);
        } else {
            System.out.println("Invalid URL.Actual webpage URL is" + pageURL);
        }
    }
    @Test
    public void verifyPageTitle(){
        String pageTitle= "Konga";
        if (pageTitle.equalsIgnoreCase("Konga")) {
            System.out.println("The webpage pageTitle is" + pageTitle);
        } else {
            System.out.println("Invalid pageTitle.Actual webpage Title is" + pageTitle);
        }
    }
}
