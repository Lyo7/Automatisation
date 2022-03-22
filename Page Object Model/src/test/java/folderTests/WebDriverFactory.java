package folderTests;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public static WebDriver getDriver (String browser , String nodeUrl) throws Exception{
        switch (browser){
            case "chrome":
                remoteChromeDriver remoteChrome = new remoteChromeDriver(nodeUrl);
                return remoteChrome.createChromeWebDriver();

            case "fireFox":
                remoteFireDriver remoteFireFox = new remoteFireDriver(nodeUrl);
                return remoteFireFox.createFireWebDriver();
            default:
                throw new Exception("navigateur"+ browser + " pas pris en compte erreur");
        }
    }
}
