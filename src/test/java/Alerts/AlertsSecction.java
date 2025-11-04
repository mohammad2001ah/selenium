package Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsSecction {
  public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://hatem-hatamleh.github.io/Selenium-html/alert.html");
//    driver.findElement(By.className("alert")).click();
//    Thread.sleep(2000);
//    String s=driver.switchTo().alert().getText();
//    System.out.println(s);
//    driver.switchTo().alert().accept();

//    Thread.sleep(2000);
//    driver.switchTo().alert().sendKeys("omiodmidmdim");
//    driver.switchTo().alert().accept();

    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.findElement(By.className("prompt")).click();


    Alert promptAlert =wait.until(ExpectedConditions.alertIsPresent());
    Thread.sleep(5000);
    promptAlert.sendKeys("nvfinvfjnvfj");
    promptAlert.accept();
  }
}
