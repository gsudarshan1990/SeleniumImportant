package com.sample.javaseleniumdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriversImportant\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Sudarshan1990");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("EO7K36");
		
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		
		String url=driver.getCurrentUrl();
		String Title=driver.getTitle();
		
		WebElement username2=driver.findElement(By.id("username_show"));
		String usernamevalue=username2.getAttribute("value");
		
		
		
		if(url.equals("http://www.adactin.com/HotelApp/SearchHotel.php") && Title.equals("AdactIn.com - Search Hotel") && usernamevalue.equals("Hello Sudarshan1990!") )
		{
			System.out.println("You have logged into the adactin");
		}
		
	}
	
}
