package findElemnentBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();

    driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
    String s= new String();
//    s= driver.findElement(By.id("welcome")).getText();
    s = driver.findElement(By.name("appium")).getText();

    System.out.println(s);
  }
}
