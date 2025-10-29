package findElemnentBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByID {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver =new ChromeDriver();

    driver.get("file:D:\\Selenium\\firstClass\\src\\test\\resources\\index.html");
    String s = driver.findElement(By.id("app-header")).getText();
    String  s2 = driver.findElement(By.name("app-description")).getText();
    String s3 =driver.findElement(By.className("list1")).getText();

    //to find multiple classes we use cssSelector(element.name1.name2....)
    String s33 =driver.findElement(By.cssSelector("li.list4.web.mobile")).getText();
    //fid element by tag name
    String s4 =driver.findElement(By.tagName("li")).getText();
    //find element by LinkText
    String s5 =driver.findElement(By.linkText("We will use this website to learn selenium commands")).getText();
    //find element by LinkText
    String s6 =driver.findElement(By.partialLinkText("We will use this website to")).getText();
    //find element by xpath

    /**
     * Xpath Expression
     * //tagName[@attribute='value']
     * //*[@attribute='value']
     * */
    String s7 =driver.findElement(By.xpath("/html/body/ul[1]/li[3]")).getText();
    String s8 =driver.findElement(By.xpath("//ul[@class='course-list']//li[3]")).getText();
    String s9 =driver.findElement(By.xpath("//*[@class='country-list']")).getText();


    System.out.println(s9);



    driver.quit();
  }
}
