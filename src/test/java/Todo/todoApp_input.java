package Todo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class todoApp_input {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:8081");

    driver.findElement(By.cssSelector("[data-testid=\"email\"]")).sendKeys("mohammad@gmail.com");
//     * Xpath Expression
//     * //tagName[@attribute='value']
//     * //*[@attribute='value']
//     *
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456Mah@");
   driver.findElement(By.xpath("//button[@type='button']")).click();
  }
}
