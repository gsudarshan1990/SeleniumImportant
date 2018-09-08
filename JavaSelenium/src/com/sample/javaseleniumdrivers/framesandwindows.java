package com.sample.javaseleniumdrivers;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesandwindows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriversImportant\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		WebElement framesandwindowsbutton=driver.findElement(By.id("menu-item-148"));
		framesandwindowsbutton.click();
		
		WebElement anchorbutton=driver.findElement(By.id("ui-id-2"));
		anchorbutton.click();
		
		WebElement anchortextlink=driver.findElement(By.linkText("Open New Seprate Window"));
		anchortextlink.click();
		
		String parentwindow=driver.getWindowHandle();

		Set<String> allwindows=driver.getWindowHandles();
		
		for(String name:allwindows)
		{
			if(!name.equals(parentwindow))
			{
				driver.switchTo().window(name);
				TakesScreenshot ts=(TakesScreenshot)driver;
				File file=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(file,new File("C:\\Users\\Sudarshan\\Desktop\\Screenshot\\screenshot1.jpeg"));
				break;
			}
		}
		driver.close();
	}
	

}
