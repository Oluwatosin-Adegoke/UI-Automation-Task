package Setup;
import org.testng.annotations.Test;

public class SigninPageTest {
    @Test
    public void VerifysuccessfulSignin(){
        String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/feed";
        if(pageURL.equalsIgnoreCase("https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/feed")){
            System.out.println("Successful login");
        }else {
            System.out.println("Login was not successful");
        }
    }
}


