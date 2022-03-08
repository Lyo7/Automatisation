package folderTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testa {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor monEcecutor = (JavascriptExecutor)driver;
        driver.get("https://benensimone.com/");
        //WebElement btnCategory = driver.findElement(By.cssSelector("a.btn.arrow.blue"));
        By btnCategory = By.cssSelector("a.btn.arrow.blue");
        monEcecutor.executeScript("arguments[0].click();", btnCategory);

        driver.close();

    }
}
