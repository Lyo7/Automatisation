package folderTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class remoteChromeDriver {
    private String nodeUrl;

    public remoteChromeDriver (String nodeUrl){
        this.nodeUrl = nodeUrl;
    }

    public WebDriver createChromeWebDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL(nodeUrl), new ChromeOptions());
    }
}
