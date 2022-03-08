package PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShopPage {
    //Variables
    private WebDriver driverEd; WebDriver driverFire; WebDriver driverChr;
    private By btnWen = By.cssSelector("a.category:nth-child(1) > figure:nth-child(1) > picture:nth-child(1) > img:nth-child(2)");

    public ShopPage (WebDriver driverFire, WebDriver driverEd, WebDriver driverChr)
    {
        this.driverEd = driverEd;
        this.driverFire = driverFire;
        this.driverChr = driverChr;

        this.driverEd.manage().window().maximize();
        this.driverFire.manage().window().maximize();
        this.driverChr.manage().window().maximize();
    }

    public void clickWen (){
        driverEd.findElement(btnWen).click();
        driverFire.findElement(btnWen).click();
        driverChr.findElement(btnWen).click();

    }


}
