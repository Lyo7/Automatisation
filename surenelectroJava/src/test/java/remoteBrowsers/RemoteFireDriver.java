package remoteBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteFireDriver {
    private String url;

    public RemoteFireDriver (String url){
        this.url = url;
    }

    public WebDriver createFireWebDriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL(url), new FirefoxOptions());
    }
}
