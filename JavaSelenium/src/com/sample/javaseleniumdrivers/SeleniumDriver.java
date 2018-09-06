package com.sample.javaseleniumdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;





public class SeleniumDriver {

	private static WebDriver driver1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriversImportant\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		*/

		System.setProperty("webdriver.gecko.driver","C:\\SeleniumDriversImportant\\geckodriver.exe");
		DesiredCapabilities capabilites=DesiredCapabilities.firefox();
		capabilites.setCapability("marionette", true);
		driver1=new FirefoxDriver();
		//driver1.get("https://www.yahoo.com");
		
		driver1.navigate().to("http://demoqa.com");
		driver1.navigate().back();
		driver1.navigate().forward();
		driver1.navigate().refresh();
		
		String URL=driver1.getCurrentUrl();
		System.out.println(URL);
		String Title=driver1.getTitle();
		System.out.println("The title is :"+Title);
		System.out.println("======================");
		System.out.println(driver1.getPageSource());
		
		driver1.get("http://demoqa.com/registration/");
		
		WebElement firstname=driver1.findElement(By.id("name_3_firstname"));
		firstname.sendKeys("Sudarshan");
		
		WebElement homelink=driver1.findElement(By.linkText("Home"));
		homelink.click();
		driver1.close();
		driver1.quit();
	}

}
