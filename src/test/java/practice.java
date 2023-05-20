import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class practice {
    @Test
    void login(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.close();
    }
}
