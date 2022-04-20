package pagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class HomePage {
    //variables
    WebDriver driver;
    String siteUrl;

    public HomePage(WebDriver driver, String siteUrl){
        this.driver = driver;
        this.siteUrl = siteUrl;
        driver.manage().window().maximize();
        this.driver.get(siteUrl);
        System.out.println("site charge correctement");
    }

    public void versHome (){
        driver.get(siteUrl);
    }

    public void clickBtnOfferte(){
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        Actions event = new Actions(driver);

        scroll.executeScript("window.scrollBy(0,200)");
        WebElement btn = driver.findElement(By.cssSelector("a.u-border-none:nth-child(3)"));
        event.moveToElement(btn).perform();
        btn.click();
    }
    public void blockKenmerken (){
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,800)");

        WebElement object = driver.findElement(By.cssSelector("h5.u-text-8"));
        if (object.getText() == "Zorgvuldig"){System.out.println("blockKenmerken present");}
        else {System.out.println("blockKenmerken pas fonctionnel");}
    }

    public void recentProject (){
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,800)");

        WebElement image = driver.findElement(By.cssSelector("div.u-layout-cell-3:nth-child(1) > div:nth-child(2)"));
        System.out.println("image attribus est "+image.getAttribute("class"));
    }

    public void socialMedia (){
        By elem = By.cssSelector(".u-social-instagram > img:nth-child(1)");
        WebElement instagram = driver.findElement(By.cssSelector(".u-social-instagram > img:nth-child(1)"));
        String windowA = driver.getWindowHandle();
        instagram.click();
        /*WebElement cookies = driver.findElement(By.cssSelector("body > div.RnEpo.Yx5HN._4Yzd2 > div > div > button.aOOlW.bIiDR"));
        WebElement elemA = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(cookies));
        cookies.click();*/
        Set<String> windows = driver.getWindowHandles();//ce code cest pour switcher entre les onlgets
        for (String windowB : windows){driver.switchTo().window(windowB);}
        if (driver.getCurrentUrl().compareTo("https://www.instagram.com/accounts/login/?next=/surenelektrotechniek/")==0){System.out.println("instsgram fonctionne");}
        else {System.out.println("Instagram pas fonctionnel "+driver.getCurrentUrl());}
        //driver.get(siteUrl);
        driver.close();
        driver.switchTo().window(windowA);

        versHome();

        /*WebElement facebook = driver.findElement(By.cssSelector("#svg-de44 > circle:nth-child(1)"));
        facebook.click();
        if (driver.getCurrentUrl() == "") {System.out.println("Facebook Fonctionnel");}
        else {System.out.println("facebook pas fonctionnel");}*/
    }

    public void footer(){
        WebElement logo = driver.findElement(By.cssSelector("a.u-align-center-xs > img:nth-child(1)"));
        logo.click();
        if (driver.getCurrentUrl().compareTo("https://surenelectro.be/") == 00){System.out.println("logo footer fonctionne");}
        else {System.out.println("logo footer pas fonctionnel");}
    }
}