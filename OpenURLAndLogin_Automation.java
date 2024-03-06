ipackage org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class OpenURLAndLogin_Automation {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.findElement(By.id("username")).sendKeys("2100030529");
        driver.findElement(By.id("password")).sendKeys("S@si20256");
        driver.findElement(By.id("password")).submit();
        Thread.sleep(1000);
    }
}
