package com.nick.selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class MyFirstTest {
	
	WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void f() {
	  
      driver.get("http://www.google.com");
      System.out.println("Page Title : " + driver.getTitle());
      String search_text = "I'm Feeling Lucky";
      WebElement search_button = driver.findElement(By.name("btnI"));
      String text = search_button.getAttribute("value");
      Assert.assertEquals(text, search_text, "Text not found!");
  }
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
