package Todo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Clicks {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://hatem-hatamleh.github.io/cypress-index-html/");

    Actions action =new Actions(driver);
    //double click
//    action.doubleClick(driver.findElement(By.className("double-click"))).perform();
    //right click
//    action.contextClick(driver.findElement(By.className("double-click"))).perform();

    WebElement button = driver.findElement(By.className("trigger-button"));
    action.moveToElement(button).clickAndHold(button).build().perform();
  }
}
