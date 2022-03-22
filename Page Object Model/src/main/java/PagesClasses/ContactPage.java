package PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    //Variables
    private WebDriver driverFire; WebDriver driverEd; WebDriver driverChr;
    private By formSetName = new By.ByCssSelector("#field_qh4icy");
    private By formSetEmail = By.cssSelector("#field_29yf4d");
    private By formSescription = By.cssSelector("#field_9jv0r1");
    private By btnSend = new By.ByCssSelector(".frm_button_submit");
    String url = "https://benensimone.com/contact/";
    private String setName; String setEmail; String setDescription;

    public ContactPage(WebDriver driverFire, WebDriver driverEd, WebDriver driverChr, String setName, String setEmail, String setDescription){
        this.driverEd = driverEd;
        this.driverFire = driverFire;
        this.driverChr = driverChr;
        this.setName = setName;
        this.setEmail = setEmail;
        this.setDescription = setDescription;

        this.driverEd.manage().window().maximize();
        this.driverFire.manage().window().maximize();
        this.driverChr.manage().window().maximize();

        this.driverEd.get(url);
        this.driverFire.get(url);
        this.driverChr.get(url);

    }

    public void remplirForm(){
        driverEd.findElement(formSetName).sendKeys(setName);
        driverFire.findElement(formSetName).sendKeys(setName);
        driverChr.findElement(formSetName).sendKeys(setName);

        driverEd.findElement(formSetEmail).sendKeys(setEmail);
        driverFire.findElement(formSetEmail).sendKeys(setEmail);
        driverChr.findElement(formSetEmail).sendKeys(setEmail);

        driverEd.findElement(formSescription).sendKeys(setDescription);
        driverFire.findElement(formSescription).sendKeys(setDescription);
        driverChr.findElement(formSescription).sendKeys(setDescription);
    }

    public void clickBtnSend(){
        driverEd.findElement(btnSend).click();
        driverFire.findElement(btnSend).click();
        driverChr.findElement(btnSend).click();
    }
}
