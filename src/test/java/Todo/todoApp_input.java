package Todo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class todoApp_input {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://localhost:8081");
//    driver.findElement(By.cssSelector("[data-testid=email]")).sendKeys("mohammad@gmail.com");
//    driver.findElement(By.xpath("//*[@data-testid='password']")).sendKeys("123456Mah@");
//    driver.findElement((By.xpath("//*[@type='button']"))).click();
    //selenium search for the element before the page finishes loading
    // so we use timeout to get selenium time to find element
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//    boolean sel= driver.findElement(By.cssSelector("[data-testid=complete-task]")).isSelected();
//    System.out.println(sel);

//   String s= driver.findElement(By.cssSelector("[data-testid=complete-task]")).getAttribute("name");
//    System.out.println(s);

//    String s1= driver.findElement(By.cssSelector("[data-testid=complete-task]")).getTagName();
//    System.out.println(s1);

//    String s2= driver.findElement(By.cssSelector("[data-testid=todo-item]")).getCssValue("background-color");
//    System.out.println(s2);

//    Point s2= driver.findElement(By.cssSelector("[data-testid=todo-item]")).getLocation();
//    System.out.println(s2.x + " , "+ s2.y);
//    Dimension s2= driver.findElement(By.cssSelector("[data-testid=todo-item]")).getSize();
//    System.out.println(s2);

//    Rectangle s2= driver.findElement(By.cssSelector("[data-testid=todo-item]")).getRect();
//    System.out.println(s2.x);

//    String access =driver.findElement(By.cssSelector("[data-testid=email]")).getAccessibleName();
    String access =driver.findElement(By.cssSelector("[data-testid=email]")).getAriaRole();
    System.out.println(access);



    driver.quit();


  }
}
