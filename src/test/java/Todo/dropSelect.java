package Todo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropSelect {


  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://hatem-hatamleh.github.io/qacart-locators/");
    Select drop =new Select(driver.findElement(By.id("courses")));
//    drop.selectByValue("selenium");
//    drop.selectByIndex(2);
    drop.selectByVisibleText("selenium");
  }
}
