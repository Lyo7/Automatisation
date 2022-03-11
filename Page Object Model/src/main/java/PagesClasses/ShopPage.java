package PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.PrintStream;

public class ShopPage {
    //Variables
    private WebDriver driverEd; WebDriver driverFire; WebDriver driverChr;
    private By btnWen = By.xpath("/html/body/main/div/div/div/a[1]/div/h2");
    private By btnSets = By.xpath("/html/body/main/div/div/div/a[2]/div/h2");
    private By btnGift = By.xpath("/html/body/main/div/div/div/a[3]/div/h2");
    private String url = "https://benensimone.com/winkel/";

    public ShopPage (WebDriver driverFire, WebDriver driverEd, WebDriver driverChr)
    {
        this.driverEd = driverEd;
        this.driverFire = driverFire;
        this.driverChr = driverChr;

        this.driverEd.manage().window().maximize();
        this.driverFire.manage().window().maximize();
        this.driverChr.manage().window().maximize();

        this.driverEd.get(url);
        this.driverFire.get(url);
        this.driverChr.get(url);
    }

    public void verShop(){
        driverEd.get(url);
        driverFire.get(url);
        driverChr.get(url);
    }
    public void clickWen (){
        driverEd.findElement(btnWen).click();
        driverFire.findElement(btnWen).click();
        driverChr.findElement(btnWen).click();
        System.out.println("fin du click de la pages shop");

    }

    public void clickSets (){
        driverEd.findElement(btnSets).click();
        driverFire.findElement(btnSets).click();
        driverChr.findElement(btnSets).click();
        System.out.println("fin clickc page shop btn sets");

    }

    public void clickGift(){
        driverEd.findElement(btnGift).click();
        driverFire.findElement(btnGift).click();
        driverChr.findElement(btnGift).click();
        System.out.println("click Gift");
    }


}
