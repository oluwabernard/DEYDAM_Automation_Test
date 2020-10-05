package testSetUp;

import Setup.SetUps;
import org.testng.annotations.Test;

public class SetUpTests extends SetUps {
    @Test
    public void testGetPageURl() {
        String pageURL = "https://dev.d2rxvhrryr2bkn.amplifyapp.com/login/";
        if (pageURL.equalsIgnoreCase("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login")) {
            System.out.println("The webpage URL is"+ pageURL);
        }else {
            System.out.println("Invalid URL. Actual webPage URL is"+pageURL);
        }
        }
    }