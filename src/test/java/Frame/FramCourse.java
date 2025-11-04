package Frame;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FramCourse {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
    driver.findElement(By.className("frames")).click();
//    String s= driver.getPageSource();
    //System.out.println(s);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.switchTo().frame("menu");
    driver.switchTo().frame("links");
    driver.findElement(By.className("waits")).click();

  }
}
