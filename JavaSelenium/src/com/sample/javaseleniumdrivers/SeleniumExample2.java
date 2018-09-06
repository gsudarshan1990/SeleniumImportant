package com.sample.javaseleniumdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriversImportant\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/");
		
		//Selecting the anchor tab and obtaining the innertext
		
		WebElement anchortag=driver.findElement(By.id("ui-id-4"));
		String tagname=anchortag.getText(); //Inner text
		System.out.println(tagname);
		
		//Obtaining the attribute value
		
		String attributetext=anchortag.getAttribute("role");
		System.out.println(attributetext);
		
		driver.get("https://demoqa.com/registration/");
		
		WebElement firstname=driver.findElement(By.id("name_3_firstname"));
		firstname.sendKeys("Sudarshan");
		
		WebElement lastname=driver.findElement(By.id("name_3_lastname"));
		
		String enteredvalue=firstname.getAttribute("value");
		
		System.out.println(enteredvalue);	
		firstname.clear();
		firstname.sendKeys("Govindarajan");
		
		enteredvalue=firstname.getAttribute("value");
		System.out.println(enteredvalue);
		
		
		//Validation of textbox
		
		boolean firstnamevalue=firstname.isDisplayed();
		System.out.println("FirstName is Displayed:"+firstnamevalue);
		boolean lastnamevalue=lastname.isDisplayed();
		System.out.println("Last name is displayed:"+lastnamevalue);//Throws Exception when there is no webelement
		
		boolean firstnameenabled=firstname.isEnabled();
		System.out.println("First name is enabled :"+firstnameenabled);
		
		WebElement radiobutton=driver.findElement(By.name("radio_4[]"));
		radiobutton.click();
		
		//Validation of radio button
		
		boolean radiobuttonvalidation=radiobutton.isSelected();
		
		System.out.println("Radio is selected:"+radiobuttonvalidation);
	
		
		
		
		
		
	}

}
