package Todo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://hatem-hatamleh.github.io/cypress-index-html/");
    Actions action =new Actions(driver);
    WebElement source = driver.findElement(By.className(".source"));
    WebElement destination = driver.findElement(By.className(".dest"));

    action.dragAndDrop(source, destination);
  }
}
