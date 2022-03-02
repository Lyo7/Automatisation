package PagesClasses;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    //variables
    private WebDriver driverFire; WebDriver driverEd; WebDriver driverChr;
    private By btnShop = By.cssSelector("a[class='btn arrow']");
    private By btnCategory = By.cssSelector("a[class='btn arrow blue']");
    private JavascriptExecutor scrollEd = (JavascriptExecutor) driverEd;
    private JavascriptExecutor scrollFire = (JavascriptExecutor) driverFire;
    private JavascriptExecutor scrollChrome = (JavascriptExecutor) driverChr;



    public HomePage(WebDriver driverFire, WebDriver driverEd, WebDriver driverChr){
        this.driverEd = driverEd;
        this.driverFire = driverFire;
        this.driverChr = driverChr;
        this.driverEd.manage().window().maximize();
        this.driverFire.manage().window().maximize();
        this.driverChr.manage().window().maximize();

    }

    public void versHome(String url){
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
        scrollEd.executeScript("window.scrollBy(0,2000)","");
        scrollFire.executeScript("window.scrollBy(0,2000)","");
        scrollChrome.executeScript("window.scrollBy(0,2000)","");
        driverEd.findElement(btnCategory).click();
        driverFire.findElement(btnCategory).click();
        driverChr.findElement(btnCategory).click();
    }

    public String getBtnWinkel(){
        if (driverEd.getCurrentUrl().compareTo("https://benensimone.com/winkel/")==0 && driverFire.getCurrentUrl().compareTo("https://benensimone.com/winkel/")==0 && driverChr.getCurrentUrl().compareTo("https://benensimone.com/winkel/")==0)
        {
            return "bouton winkel fonctionnel";
        }
        else {return "Error bouton";}
    }

    public String getBtnCategory()
    {
        if (driverEd.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0 && driverFire.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0 && driverChr.getCurrentUrl().compareTo("https://benensimone.com/categorie/wenskaarten/")==0)
        {return "bouton category fonctionnel";}
        else {return "Bouton category error";}
    }
}
