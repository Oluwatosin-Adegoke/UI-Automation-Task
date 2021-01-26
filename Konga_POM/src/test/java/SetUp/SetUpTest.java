package SetUp;

import org.testng.annotations.Test;

public class SetUpTest {

    @Test
    public void testSignInPage() {
        String pageURL = "https://www.konga.com/";
        if (pageURL.equalsIgnoreCase("https://www.konga.com/")) {
            System.out.println("The webpage URL is" + pageURL);
        } else {
            System.out.println("Invalid URL.Actual webpage URL is" + pageURL);
        }
    }
}
