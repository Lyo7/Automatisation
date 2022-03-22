package PagesClasses;

//import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.security.Key;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

public class HomePage {
    //variables
    private WebDriver driverFire; WebDriver driverEd; WebDriver driverChr;
    private By btnShop = By.cssSelector("a.btn.arrow");
    private By btnOntdek = By.cssSelector(".favorieten > div:nth-child(1) > div:nth-child(1) > a:nth-child(3)");
    private By btnCookies = By.cssSelector("body > div.cookiePopup > button.btn.small.outline.no");
    private String url = "https://benensimone.com/";

    //private By btnCategory = By.cssSelector("a.btn.arrow.blue");

    public HomePage (){}


    public HomePage(WebDriver driverFire, WebDriver driverEd, WebDriver driverChr){
        System.out.println("constructor");
        this.driverEd = driverEd;
        this.driverFire = driverFire;
        this.driverChr = driverChr;
        this.driverEd.manage().window().maximize();
        this.driverFire.manage().window().maximize();
        this.driverChr.manage().window().maximize();

        this.driverEd.get(url);
        this.driverFire.get(url);
        this.driverChr.get(url);

        driverEd.findElement(btnCookies).click();
        driverFire.findElement(btnCookies).click();
        driverChr.findElement(btnCookies).click();

    }

    public void versHome(){
        driverEd.get(url);
        driverFire.get(url);
        driverChr.get(url);
    }

    public void clickBtnWinkel(){
        driverEd.findElement(btnShop).click();
        driverFire.findElement(btnShop).click();
        driverChr.findElement(btnShop).click();

    }

    public void clickBtnCategory(){

        JavascriptExecutor scrollEd = (JavascriptExecutor)driverEd;
        JavascriptExecutor scrollFire = (JavascriptExecutor)driverFire;
        JavascriptExecutor scrollChr = (JavascriptExecutor)driverChr;
        Actions eventEd = new Actions(driverEd);
        Actions eventFire = new Actions(driverFire);
        Actions eventChr = new Actions(driverChr);

        scrollEd.executeScript("window.scrollBy(0,800)");
        scrollFire.executeScript("window.scroll(0,800)");
        scrollChr.executeScript("window.scroll(0,800)");

        WebElement btnCategoryEd = driverEd.findElement(By.cssSelector("a.btn.arrow.blue"));
        WebElement btnCategoryFire = driverFire.findElement(By.cssSelector("a.btn.arrow.blue"));
        WebElement btnCategoryChr = driverChr.findElement(By.cssSelector("a.btn.arrow.blue"));
        eventEd.moveToElement(btnCategoryEd).perform();
        eventFire.moveToElement(btnCategoryFire).perform();
        eventChr.moveToElement(btnCategoryChr).perform();
        System.out.println("script fait");

       btnCategoryEd.click();
       btnCategoryFire.click();
       btnCategoryChr.click();

    }
    public void clickBtnProduct () {
        JavascriptExecutor productEd = (JavascriptExecutor)driverEd;
        JavascriptExecutor productFire = (JavascriptExecutor)driverFire;
        JavascriptExecutor productChrome = (JavascriptExecutor)driverChr;
        Actions eventEd = new Actions(driverEd);
        Actions eventFire = new Actions(driverFire);
        Actions eventChr = new Actions(driverChr);

        productEd.executeScript("window.scrollBy(0,1000)");
        productFire.executeScript("window.scrollBy(0,1000)");
        productChrome.executeScript("window.scrollBy(0,1000)");

        WebElement btnProductEd = driverEd.findElement(By.cssSelector("a.btn.arrow.orange"));
        WebElement btnProductFire = driverFire.findElement(By.cssSelector("a.btn.arrow.orange"));
        WebElement btnProductChr = driverChr.findElement(By.cssSelector("a.btn.arrow.orange"));

        eventEd.moveToElement(btnProductEd).perform();
        eventFire.moveToElement(btnProductFire).perform();
        eventChr.moveToElement(btnProductChr).perform();

        btnProductEd.click();
        btnProductFire.click();
        btnProductChr.click();

    }
    public void clickBtnMore(){
        JavascriptExecutor moreEd = (JavascriptExecutor)driverEd;
        JavascriptExecutor moreFire = (JavascriptExecutor)driverFire;
        JavascriptExecutor moreChr = (JavascriptExecutor)driverChr;
        Actions eventEd = new Actions(driverEd);
        Actions eventFire = new Actions(driverFire);
        Actions eventChr = new Actions(driverChr);
        WebElement btnMoreEd = driverEd.findElement(By.cssSelector("a.btn.arrow.green"));
        WebElement btnMoreFire = driverFire.findElement(By.cssSelector("a.btn.arrow.green"));
        WebElement btnMoreChr = driverChr.findElement(By.cssSelector("a.btn.arrow.green"));

        moreEd.executeScript("window.scrollBy(0,1400);");
        moreFire.executeScript("window.scrollBy(0,1400);");
        moreChr.executeScript("window.scrollBy(0,1400);");
        eventEd.moveToElement(btnMoreEd).perform();
        eventFire.moveToElement(btnMoreFire).perform();
        eventChr.moveToElement(btnMoreChr).perform();

        btnMoreEd.click();
        btnMoreFire.click();
        btnMoreChr.click();
    }
    public void btnOntdek(){
        JavascriptExecutor btnEd = (JavascriptExecutor)driverEd;
        JavascriptExecutor btnFire = (JavascriptExecutor)driverFire;
        JavascriptExecutor btnChr = (JavascriptExecutor)driverChr;

        btnEd.executeScript("window.scrollBy(0,2000)");
        btnFire.executeScript("window.scrollBy(0,2000)");
        btnChr.executeScript("window.scrollBy(0,2000)");

        driverEd.findElement(btnOntdek).click();
        driverFire.findElement(btnOntdek).click();
        driverChr.findElement(btnOntdek).click();
    }

    public void event(){


    }

    public String getBtnWinkel(){
        if (driverEd.getCurrentUrl().compareTo("https://benensimone.com/winkel/")==0 && driverFire.getCurrentUrl().compareTo("https://benensimone.com/winkel/")==0 && driverChr.getCurrentUrl().compareTo("https://benensimone.com/winkel/")==0)
        {
            return "bouton winkel fonctionnel";
        }
        else {return "Error bouton Winkel";}
    }

    public String getBtnCategory()
    {
        if (driverEd.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0 && driverFire.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0 && driverChr.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0)
        {return "bouton category fonctionnel";}
        else {return "Bouton category error";}
    }
    public String getBtnProduct()
    {
        if (driverEd.getCurrentUrl().compareTo("https://benensimone.com/product/woorden-set/")==0 && driverFire.getCurrentUrl().compareTo("https://benensimone.com/product/woorden-set/")==0 && driverChr.getCurrentUrl().compareTo("https://benensimone.com/product/woorden-set/")==0)
        {return "bouton Product fonctionnel";}
        else {return "Bouton product error";}
    }
    public String getBtnMore(){
        if (driverEd.getCurrentUrl().compareTo("https://benensimone.com/over-ons/")==0 && driverFire.getCurrentUrl().compareTo("https://benensimone.com/over-ons/")==0 && driverChr.getCurrentUrl().compareTo("https://benensimone.com/over-ons/")==0)
        {return "bouton More fonctionnel";}
        else {return "Bouton more error";}

    }
    public String getBtnOntdek (){
        if (driverEd.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0 && driverFire.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0 && driverChr.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0)
        {return "bouton Ontdek fonctionnel";}
        else {return "Bouton Ontdek error";}

    }


}


//codigo comentado

/* driverEd.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
driverFire.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
driverChr.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);*/
//scrollEd.executeScript("window.scrollBy(0,-2000)");
//scrollFire.executeScript("window.scroll(0,2000)");
//scrollChrome.executeScript("window.scroll(0,2000)");
        /*actionEd.moveToElement(driverEd.findElement(By.cssSelector("div.content a"))).perform();
        actionFire.moveToElement(driverFire.findElement(By.cssSelector("div.content a"))).perform();
        actionChrome.moveToElement(driverChr.findElement(By.cssSelector("div.content a"))).perform()

        productEd.executeScript("arguments[0].click();",btnProductEd);
        productFire.executeScript("arguments[0].click();",btnProductFire);
        productChrome.executeScript("arguments[0].click();",btnProductChr);;*/
