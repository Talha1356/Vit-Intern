package com.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectDropdownUtility {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD = driver.findElement(By.name("birthday_day"));
		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		WebElement yearDD = driver.findElement(By.name("birthday_year"));
	
		
//		selectValueFromDropdownOptions(dayDD,"21");
//		selectValueFromDropdownOptions(monthDD,"Apr");
//		selectValueFromDropdownOptions(yearDD,"2000");
		
		
//		handleSelectDropdownByUsingIndex(dayDD,20);
//		handleSelectDropdownByUsingIndex(monthDD,3);
//		handleSelectDropdownByUsingIndex(yearDD,24);
		
//		handleSelectDropdownByUsingValue(dayDD,"21");
//		handleSelectDropdownByUsingValue(monthDD,"4");
//		handleSelectDropdownByUsingValue(yearDD,"2000");
		
		
		handleSelectDropdownByUsingVisibleText(dayDD,"21");
		handleSelectDropdownByUsingVisibleText(monthDD,"Apr");
		handleSelectDropdownByUsingVisibleText(yearDD,"2000");
		
		
		
	}
	
	static void selectValueFromDropdownOptions(WebElement dropdown, String option) {
		
		List<WebElement> dropdownOptions = new Select(dropdown).getOptions();
	    for(WebElement ele: dropdownOptions) {
	    	if(ele.getText().equals(option)) {
	    		ele.click();
	    		break;
	    	}
	    }
	}
	
	static void handleSelectDropdownByUsingIndex(WebElement dropdown, int index) {
		new Select(dropdown).selectByIndex(index);
	}
	
	static void handleSelectDropdownByUsingValue(WebElement dropdown, String value) {
		new Select(dropdown).selectByValue(value);
	}
	
	static void handleSelectDropdownByUsingVisibleText(WebElement dropdown, String visibleText) {
	 new Select(dropdown).selectByVisibleText(visibleText);
	}
	

}
