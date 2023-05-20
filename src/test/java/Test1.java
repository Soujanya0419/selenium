import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Test1 {

    @Test
    public void test() throws InterruptedException {
        System.out.println("Successful test");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.close();
    }
}
