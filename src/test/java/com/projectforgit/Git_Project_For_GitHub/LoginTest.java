package com.projectforgit.Git_Project_For_GitHub;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\workspace\\Selenium_Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    System.out.println("Launching Browser");
	}
	
	@Test
	public void doLogin()
	{
		System.out.println("Executing login test");
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.name("email")).sendKeys("rajupawar.ppp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ppprsd@987");
		driver.findElement(By.name("login")).click();
		System.out.println("Login into facebook");
		
	}
	
	@AfterTest
	public void QuiteDriver()
	{
		if(driver!=null)
			driver.close();
	}

}
