package folderTests;

import PagesClasses.HomePage;
import com.sun.source.tree.TryTree;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;


public class grid {
    WebDriver driver;
    String siteUrl , nodeUrl;
    String browser = "chrome";
    private By btnCookies = new By.ByCssSelector("body > div.cookiePopup > button.btn.small.outline.no");
   // private WebDriverWait elem;

    @Before
    public void setUp () throws Exception {
        siteUrl = "https://benensimone.com/";
        nodeUrl = "http://192.168.1.38:4444";
        /*DesiredCapabilities compatibles = DesiredCapabilities.chrome();
        compatibles.setBrowserName("chrome");
        compatibles.setPlatform(Platform.WIN10);*/

        //driver = new RemoteWebDriver(new URL(nodeUrl), new ChromeOptions());

        driver = WebDriverFactory.getDriver(browser, nodeUrl);
        driver.manage().window().maximize();

    }

    @Test
    public void test(){

        driver.get(siteUrl);
        WebElement elem = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(btnCookies));
        driver.findElement(btnCookies).click();

    }

    //@After
    //public void finTest (){
        //driver.quit();
    //}

}
