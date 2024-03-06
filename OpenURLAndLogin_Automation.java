package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class OpenURLAndLogin_Automation {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        //System.setProperty("webdriver.chrome.driver", "E:\\K L\\Epham_Dept\\chromedriver.exe");
        //WebDriver driver=new ChromeDriver();

        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.findElement(By.id("username")).sendKeys("2100030871");
        driver.findElement(By.id("password")).sendKeys("Akki@1234");
        driver.findElement(By.id("password")).submit();
        Thread.sleep(1000);
//        driver.findElement(By.className("usertext")).click();
//        List<WebElement> menubars = driver.findElements(By.xpath("//a/span"));
//        for(WebElement option : menubars) {
//            if(option.getText().equalsIgnoreCase("Log out")){
//                option.click();
//                break;
//            }
//        }
    }
}
