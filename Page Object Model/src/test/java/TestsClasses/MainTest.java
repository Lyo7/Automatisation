package TestsClasses;

import PagesClasses.HomePage;
import PagesClasses.ShopPage;
import io.github.bonigarcia.wdm.WebDriverManager;
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
    String url = "https://benensimone.com/";
    HomePage click;
    ShopPage shop;

    @Before

    public void setUp(){

        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        driverEd = new EdgeDriver();
        driverFire = new FirefoxDriver();
        driverChr = new ChromeDriver();

        driverEd.get(url);
        driverFire.get(url);
        driverChr.get(url);
        System.out.println("antes de llamar constructor");
        click = new HomePage(driverEd, driverFire, driverChr);
        shop = new ShopPage(driverEd, driverFire, driverChr);


    }


        @Test

        public void test(){
            click.clickBtnWinkel();
            String getBtn = click.getBtnWinkel();
            System.out.println(getBtn);
            click.versHome(url);
            click.clickBtnCategory();
            String getBtnC = click.getBtnCategory();
            System.out.println(getBtnC);
            click.versHome(url);
            click.clickBtnProduct();
            String getBtnP = click.getBtnProduct();
            System.out.println(getBtnP);
            click.versHome(url);
            click.clickBtnMore();
            String getBtnMore = click.getBtnMore();
            System.out.println(getBtnMore);
            click.versHome(url);
            click.btnOntdek();
            String btnOntdek = click.getBtnOntdek();
            System.out.println(btnOntdek);
            click.versHome(url);

            shop.clickWen();

        }

        @After

    public void dowm(){
        driverEd.quit();
        driverFire.quit();
        driverChr.quit();
        }

}
