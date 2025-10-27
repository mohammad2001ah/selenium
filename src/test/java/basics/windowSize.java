package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowSize {
  public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();

    driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
    Dimension iphoneXR= new Dimension(414,896);
    Dimension iPadAir= new Dimension(820,1180);
    driver.manage().window().setSize(iphoneXR);
    driver.manage().window().setSize(iPadAir);


  }
}
