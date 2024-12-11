package com.select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownWithoutSelectClass {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		
//		List<WebElement> monthDDOptions = driver.findElements(By.xpath("//select[@name='birthday_month']/option"));
//
//		for(WebElement ele: monthDDOptions) {
//			if(ele.getText().equals("Apr")) {
//				ele.click();
//				break;
//			}
//		}
	}
	
	static void handleDropdownWithoutSelectClass(WebDriver driver,String selectOption,String xpath) {
		List<WebElement> list = driver.findElements(By.xpath(xpath));
		for(WebElement ele:list) {
			if(ele.getText().equals(selectOption)) {
				ele.click();
				break;
			}
		}
	}

}
