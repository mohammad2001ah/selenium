package Windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class MoveWindows {
  public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
    String parent =driver.getWindowHandle();
    System.out.println(parent);
    WebElement windows =driver.findElement(By.className("windows"));
    windows.click();
    WebElement website =driver.findElement(By.className("website"));
    website.click();
    Set<String> allWindow =driver.getWindowHandles();
    System.out.println(allWindow);

    for (String window :allWindow){
      if(!window.equalsIgnoreCase(parent)){
        driver.switchTo().window(window);
        Thread.sleep(3000);
        driver.close();
      }
    }
    driver.switchTo().window(parent);
    driver.findElement(By.className("youtube")).click();
  }
}
