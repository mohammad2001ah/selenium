package Waitscourse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waitsCourses {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://hatem-hatamleh.github.io/Selenium-html/wait.html");
//    Thread.sleep(5000);
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, Duration.ofSeconds(10));

    WebElement primaryButton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("primary")));
    primaryButton.click();
    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("cover")));
    WebElement secondaryButton =wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("secondary")));
    secondaryButton.click();

  }
}
