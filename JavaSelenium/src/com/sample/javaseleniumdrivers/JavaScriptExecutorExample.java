package com.javascriptexecutorselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutorExample {

	public static WebDriver driver;
	
	@BeforeTest
	public void DriverInitialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriversImportant\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
	}
	
	@Test
	public void addition()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement firstnametext=driver.findElement(By.name("firstname"));
		js.executeScript("arguments[0].value='sudarshan';", firstnametext);
		WebElement malebutton=driver.findElement(By.name("sex"));
		js.executeScript("arguments[0].checked='true';", malebutton);
		WebElement lastnametext=driver.findElement(By.name("lastname"));
		WebElement experience=driver.findElement(By.id("exp-3"));
		js.executeScript("arguments[0].value='govindarajan';arguments[1].checked='true';",lastnametext,experience );
		
	}
}
