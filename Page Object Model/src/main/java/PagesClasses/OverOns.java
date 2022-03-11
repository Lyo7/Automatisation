package PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverOns {
    //variables
    private WebDriver driverFire; WebDriver driverEd; WebDriver driverChr;
    private By btnTalk = new By.ByCssSelector(".wp-block-button__link");
    private By btnOntdek = By.cssSelector("a.btn");
    String url = "https://benensimone.com/over-ons/";

    public OverOns (WebDriver driverFire, WebDriver driverEd, WebDriver driverChr){
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
    public void versOver (){
        driverEd.get(url);
        driverFire.get(url);
        driverChr.get(url);
    }
    public void clickTalk (){
        driverEd.findElement(btnTalk).click();
        driverFire.findElement(btnTalk).click();
        driverChr.findElement(btnTalk).click();
    }
    public void clickOntdek(){
        driverEd.findElement(btnOntdek).click();
        driverFire.findElement(btnOntdek).click();
        driverChr.findElement(btnOntdek).click();
    }


}
