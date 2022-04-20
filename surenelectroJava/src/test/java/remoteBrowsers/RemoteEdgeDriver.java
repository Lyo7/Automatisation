package remoteBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteEdgeDriver {
    private String url;

    public RemoteEdgeDriver(String url){this.url = url;}

    public WebDriver  createEdgeWebdriver() throws MalformedURLException {
        return new RemoteWebDriver(new URL(url), new EdgeOptions());
    }
}
