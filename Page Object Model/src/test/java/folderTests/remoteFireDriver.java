package folderTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class remoteFireDriver {
    private String url;

    public remoteFireDriver (String url){
        this.url = url;
    }

    public WebDriver createFireWebDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL(url), new FirefoxOptions());
    }
}
