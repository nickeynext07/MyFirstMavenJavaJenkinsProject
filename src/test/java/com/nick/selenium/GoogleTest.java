package com.nick.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GoogleTest {

	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void f() {
	
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Page Title : " + driver.getTitle());
		
		
	}


	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
