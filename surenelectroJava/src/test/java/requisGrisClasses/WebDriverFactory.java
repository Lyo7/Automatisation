package requisGrisClasses;

import org.openqa.selenium.WebDriver;
import remoteBrowsers.RemoteFireDriver;
import remoteBrowsers.RemoteEdgeDriver;
import remoteBrowsers.RemoteChromeDriver;

public class WebDriverFactory {
    public static WebDriver getDriver (String browser , String nodeUrl) throws Exception{
        switch (browser){
            case "chrome":
                RemoteChromeDriver remoteChrome = new RemoteChromeDriver(nodeUrl);
                return remoteChrome.createChromeWebDriver();

            case "fireFox":
                RemoteFireDriver remoteFireFox = new RemoteFireDriver(nodeUrl);
                return remoteFireFox.createFireWebDriver();
            case "edge":
                RemoteEdgeDriver remoteEdgeDriver = new RemoteEdgeDriver(nodeUrl);
                return remoteEdgeDriver.createEdgeWebdriver();

            default:
                throw new Exception("navigateur"+ browser + " pas pris en compte erreur");
        }
    }

}
