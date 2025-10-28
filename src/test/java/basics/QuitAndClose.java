package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.qacart.com/");
    driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
    driver.get("https://www.facebook.com/");
    driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
    driver.get("https://www.google.com/");
    driver.close();
    driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB);
//    driver.quit();
//    driver.close();
  }
  }
