package com.mycompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeDriver {
  public static void main(String[] args){
    WebDriverManager.edgedriver().setup();
    WebDriver driver= new EdgeDriver();

  }
}
