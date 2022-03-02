package TestsClasses;

import PagesClasses.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.Scanner;

public class MainTest {

    //variables
    WebDriver driverFire; WebDriver driverEd; WebDriver driverChr;
    String [] driverEdge = {"C:\\Users\\Linzzeth\\Documents\\Linzzeth\\Stage\\webDrivers\\msedgedriver.exe","webdriver.edge.driver"};
    String [] driverFirefox = {"C:\\Users\\Linzzeth\\Documents\\Linzzeth\\Stage\\webDrivers\\geckodriver.exe", "webdriver.gecko.driver"};
    String [] driverChrome = {"C:\\Users\\Linzzeth\\Documents\\Linzzeth\\Stage\\webDrivers\\chromedriver.exe","webdriver.chrome.driver"};
    String url = "https://benensimone.com/";
    HomePage click;

    @Before

    public void setUp(){


        System.setProperty(driverEdge[1], driverEdge[0]);
        System.out.println("Edge a ete pris en compte comme navigateur");

        System.setProperty(driverFirefox[1], driverFirefox[0]);
        System.out.println("fireFox a ete pris en compte comme navigateur");

        System.setProperty(driverChrome[1], driverChrome[0]);
        System.out.println("Chrome a ete pris en compte comme navigateur");

        driverEd = new EdgeDriver();
        driverFire = new FirefoxDriver();
        driverChr = new ChromeDriver();

        driverEd.get(url);
        driverFire.get(url);
        driverChr.get(url);
        click = new HomePage(driverEd, driverFire, driverChr);


    }


        @Test

        public void test(){
            click.clickBtnWinkel();
            String getBtn = click.getBtnWinkel();
            System.out.println(getBtn);
            click.versHome(url);
            click.clickBtnCategory();
            getBtn = click.getBtnCategory();
            System.out.println(getBtn);

        }

        @After

    public void dowm(){
        driverEd.quit();
        driverFire.quit();
        //driverChr.quit();
        }

}
