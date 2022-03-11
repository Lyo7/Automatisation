package TestsClasses;

import PagesClasses.ContactPage;
import PagesClasses.HomePage;
import PagesClasses.OverOns;
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
    //String url = "https://benensimone.com/";
    HomePage click;
    ShopPage shop;
    OverOns over;
    ContactPage contact;

    @Before

    public void setUp(){

        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        WebDriverManager.firefoxdriver().setup();

        driverEd = new EdgeDriver();
        driverFire = new FirefoxDriver();
        driverChr = new ChromeDriver();

        /*driverEd.get(url);
        driverFire.get(url);
        driverChr.get(url);*/
        System.out.println("antes de llamar constructor");
        click = new HomePage(driverEd, driverFire, driverChr);



    }


        @Test

        public void test(){
            click.clickBtnWinkel();
            String getBtn = click.getBtnWinkel();
            System.out.println(getBtn);
            click.versHome();
            click.clickBtnCategory();
            String getBtnC = click.getBtnCategory();
            System.out.println(getBtnC);
            click.versHome();
            click.clickBtnProduct();
            String getBtnP = click.getBtnProduct();
            System.out.println(getBtnP);
            click.versHome();
            click.clickBtnMore();
            String getBtnMore = click.getBtnMore();
            System.out.println(getBtnMore);
            click.versHome();
            click.btnOntdek();
            String btnOntdek = click.getBtnOntdek();
            System.out.println(btnOntdek);
            click.versHome();

            shop = new ShopPage(driverEd, driverFire, driverChr);
            shop.clickWen();
            shop.verShop();
            shop.clickSets();
            shop.verShop();
            shop.clickGift();

            over = new OverOns(driverEd, driverFire, driverChr);
            over.clickTalk();
            over.versOver();
            over.clickOntdek();
            over.versOver();

            contact = new ContactPage(driverEd, driverFire, driverChr);
            contact.remplirForm();
        }

        @After

    public void dowm(){
        driverEd.quit();
        driverFire.quit();
        driverChr.quit();
        }

}
