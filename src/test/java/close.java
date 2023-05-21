import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class close {
    @Test
    void test2(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']")).click();
        driver.close();
    }
}
