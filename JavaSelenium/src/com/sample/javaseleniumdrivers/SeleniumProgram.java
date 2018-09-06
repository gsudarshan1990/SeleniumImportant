package com.sample.javaseleniumdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumProgram {

	public static void main(String[] args) {
		
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
		
		WebElement locationsDD=driver.findElement(By.name("location"));
		Select locationsselectDD=new Select(locationsDD);
		locationsselectDD.selectByIndex(2);
		
		WebElement hotelsDD=driver.findElement(By.name("hotels"));
		Select hotelsselectDD=new Select(hotelsDD);
		hotelsselectDD.selectByIndex(2);
		
		WebElement roomtypeDD=driver.findElement(By.name("room_type"));
		Select roomtypeselectDD=new Select(roomtypeDD);
		roomtypeselectDD.selectByIndex(2);
		

		WebElement roomnoDD=driver.findElement(By.name("room_nos"));
		Select roomnoselectDD=new Select(roomnoDD);
		roomnoselectDD.selectByIndex(2);
		
		WebElement dateenter=driver.findElement(By.name("datepick_in"));
		dateenter.clear();
		dateenter.sendKeys("06/09/2018");
		
		WebElement dateleave=driver.findElement(By.name("datepick_out"));
		dateleave.clear();
		dateleave.sendKeys("07/09/2018");
		
		WebElement adultperroomDD=driver.findElement(By.name("adult_room"));
		Select adultperroomselectDD=new Select(adultperroomDD);
		adultperroomselectDD.selectByIndex(2);
		
		WebElement childperroomDD=driver.findElement(By.name("child_room"));
		Select childperroomselectDD=new Select(childperroomDD);
		childperroomselectDD.selectByIndex(2);
		
		WebElement searchbutton=driver.findElement(By.id("Submit"));
		searchbutton.click();
		
		String url1=driver.getCurrentUrl();
		
		if(url1.equals("http://www.adactin.com/HotelApp/SelectHotel.php"))
		{	
			System.out.println("You have entered the Select hotel page");
		}
		WebElement radiobuttonselect=driver.findElement(By.id("radiobutton_0"));
		radiobuttonselect.click();
		//validation 
		
		boolean radiobuttonselected=radiobuttonselect.isSelected();
		
		if(radiobuttonselected)
		{
			System.out.println("The hotel has been selected");
			WebElement continuebutton=driver.findElement(By.id("continue"));
			continuebutton.click();
			
		}
		
		String url2=driver.getCurrentUrl();
		
		if(url2.equals("http://www.adactin.com/HotelApp/BookHotel.php"))
		{
			System.out.println("You have entered \"Welcome to AdactIn Group of Hotels\"");
		}
		
		System.out.println("Checking the text box is enabled");
		
		WebElement hotelname=driver.findElement(By.id("hotel_name_dis"));
		boolean hotelnamecheck=hotelname.isEnabled();
		
		System.out.println("The hotel name is:"+hotelnamecheck);
		
		WebElement firstnameenter=driver.findElement(By.id("first_name"));
		firstnameenter.sendKeys("Sudarshan");
		
		WebElement firstnameenterhotelpage=driver.findElement(By.id("first_name"));
		firstnameenterhotelpage.sendKeys("Sudarshan");
		
		WebElement lastnameenterhotelpage=driver.findElement(By.id("last_name"));
		lastnameenterhotelpage.sendKeys("Govindarajan");
		
		WebElement billaddress=driver.findElement(By.id("address"));
		billaddress.sendKeys("Perungulathur");
		
		WebElement creditcardnumber=driver.findElement(By.id("cc_num"));
		creditcardnumber.sendKeys("1111222233334444");
		
		WebElement CreditCardTypeDD=driver.findElement(By.id("cc_type"));
		Select CreditCardTypeselectDD=new Select(CreditCardTypeDD);
		CreditCardTypeselectDD.selectByIndex(2);
		
		WebElement ExpirtyDateMonthDD=driver.findElement(By.id("cc_exp_month"));
		Select ExpirtyDateMonthselectDD=new Select(ExpirtyDateMonthDD);
		ExpirtyDateMonthselectDD.selectByIndex(2);
		
		WebElement ExpirtyDateYearDD=driver.findElement(By.id("cc_exp_year"));
		Select ExpirtyDateYearselectDD=new Select(ExpirtyDateYearDD);
		ExpirtyDateYearselectDD.selectByIndex(10);
	
		WebElement CVVNumber=driver.findElement(By.id("cc_cvv"));
		CVVNumber.sendKeys("111");
		
		WebElement Book=driver.findElement(By.id("book_now"));
		Book.click();
		
		//Order Id
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
		WebElement orderid=driver.findElement(By.id("order_no"));
		System.out.println("==================================");
		System.out.println("The order id is:"+orderid.getAttribute("value"));
		System.out.println("==================================");
		
	}

}
