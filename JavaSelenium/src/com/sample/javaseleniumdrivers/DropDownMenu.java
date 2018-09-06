package com.sample.javaseleniumdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDriversImportant\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		
		WebElement coffee=driver.findElement(By.name("coffee"));
		
		Select CofDD=new Select(coffee);// CoffDD is the object of Select 
		System.out.println("=================================");
		System.out.println("To Check whether the Select Option is multiple or not:"+CofDD.isMultiple());
		System.out.println("=================================");
		List<WebElement> options=CofDD.getOptions();
		
		//Printing of the Options
		
		for(WebElement element:options)
		{
			System.out.println("The element is :"+element.getText());
		}

		CofDD.selectByIndex(2);
		System.out.println("The selection by index:"+CofDD.getFirstSelectedOption().getText());//validation
		
		CofDD.selectByValue("black");
		System.out.println("The selection by value:"+CofDD.getFirstSelectedOption().getText());//validation
		
		CofDD.selectByVisibleText("With sugar");
		System.out.println("The selection by visible text:"+CofDD.getFirstSelectedOption().getText());
		
		
		//Multiple Selection
		
		WebElement Coffee2=driver.findElement(By.name("coffee2"));	
		Select Coffee2DD=new Select(Coffee2);
		System.out.println("=======================");
		System.out.println("Check whether the select option is multiple or not:"+Coffee2DD.isMultiple());
		System.out.println("=======================");
		
		List<WebElement> Coffee2DDOptions=Coffee2DD.getOptions();
		
		for(WebElement element:Coffee2DDOptions)
		{
			System.out.println("The element is:"+element.getText());
		}

		Coffee2DD.selectByIndex(2);
		Coffee2DD.selectByIndex(3);
		
		System.out.println("Validation of Selection of object by index");
		List<WebElement> Coffee2DDSelectedOptions=Coffee2DD.getAllSelectedOptions();
		
		System.out.println("=================================");
		for(WebElement element:Coffee2DDSelectedOptions)
		{
			System.out.println(element.getText());
		}
		
		System.out.println("================================");
		Coffee2DD.deselectAll();
		
		Coffee2DD.selectByValue("skim");
		Coffee2DD.selectByValue("sugar");
		
		List<WebElement> Coffee2DDSelectedOptionsvalue=Coffee2DD.getAllSelectedOptions();
		System.out.println("Validation of Selection of object by index");
		System.out.println("=================================");
		for(WebElement element:Coffee2DDSelectedOptionsvalue)
		{
			System.out.println(element.getText());
		}
		
		
	
		
	}

}
