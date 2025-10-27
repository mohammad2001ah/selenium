package visitWebSite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
  public static void main (String []args){
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    //we use get method to open any web page
    driver.get("https://hatem-hatamleh.github.io/Selenium-html/");


  }
}
