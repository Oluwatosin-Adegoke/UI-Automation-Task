package Setup;
import org.testng.annotations.Test;

public class DashboardPageTest {
    @Test
    public void testsuccessfullogout(){
        String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/login";
        if(pageURL.equalsIgnoreCase("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login")){
            System.out.println("Successful logout");
        }else {
            System.out.println("Logout out not successful");
        }
    }
}


