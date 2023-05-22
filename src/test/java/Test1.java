import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {

    @Test
    public void test() throws InterruptedException, MalformedURLException {
        System.out.println("Successful test");
         String hub="http://localhost:4444";
        ChromeOptions options=new ChromeOptions();
         String standalone_node="http://selenium__standalone-chrome:4444/wd/hub/";
        WebDriver driver=new RemoteWebDriver(new URL(hub),options);
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.close();
        System.out.println("**********************Doe***********************");
    }
}
