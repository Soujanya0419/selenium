import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launch {
    @Test
    void test(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.close();

    }
}
