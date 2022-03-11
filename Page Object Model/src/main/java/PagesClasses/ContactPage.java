package PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    //Variables
    private WebDriver driverFire; WebDriver driverEd; WebDriver driverChr;
    private By setName = new By.ByCssSelector("#field_qh4icy");
    private By setEmail = By.cssSelector("#field_29yf4d");
    private By setDescription = By.cssSelector("#field_9jv0r1");
    private By btnSend = new By.ByCssSelector(".frm_button_submit");
    String url = "https://benensimone.com/contact/";

    public ContactPage(WebDriver driverFire, WebDriver driverEd, WebDriver driverChr){
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

    public void remplirForm(){
        driverEd.findElement(setName).sendKeys("Test");
        driverFire.findElement(setName).sendKeys("Test");
        driverChr.findElement(setName).sendKeys("Test");

        driverEd.findElement(setEmail).sendKeys("test@gmail.com");
        driverFire.findElement(setEmail).sendKeys("test@gmail.com");
        driverChr.findElement(setEmail).sendKeys("test@gmail.com");

        driverEd.findElement(setDescription).sendKeys("Ceci est la description du formulaire de Test");
        driverFire.findElement(setDescription).sendKeys("Ceci est la description du formulaire de Test");
        driverChr.findElement(setDescription).sendKeys("Ceci est la description du formulaire de Test");
    }

    public void clickBtnSend(){
        driverEd.findElement(btnSend).click();
        driverFire.findElement(btnSend).click();
        driverChr.findElement(btnSend).click();
    }
}
