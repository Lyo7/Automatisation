package remoteBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteChromeDriver {
    private String nodeUrl;

    public RemoteChromeDriver (String nodeUrl){
        this.nodeUrl = nodeUrl;
    }

    public WebDriver createChromeWebDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL(nodeUrl), new ChromeOptions());
    }
}
