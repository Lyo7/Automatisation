package testClasses;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pagesClasses.HomePage;
import requisGrisClasses.WebDriverFactory;

public class mainTest {
    //variables
    String siteUrl, nodeUrl;
    WebDriver driver;
    HomePage home;
    String browser = "chrome";

    @Before
public void setUp() throws Exception{
        siteUrl = "https://surenelectro.be/";
        nodeUrl = "http://192.168.1.38:4444";
        driver = WebDriverFactory.getDriver(browser, nodeUrl);
    }

    @Test
    public void test (){
        home = new HomePage(driver, siteUrl);
        home.clickBtnOfferte();
        home.versHome();
        home.blockKenmerken();
        home.recentProject();
        home.socialMedia();
        home.footer();
    }

    @After
    public void finTest(){

    }

}
