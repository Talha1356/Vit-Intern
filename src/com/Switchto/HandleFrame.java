package com.Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getTitle()+"  "+driver.getCurrentUrl());
		
		int framecount =driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of  iframe on the page are "+framecount);
		
		//driver.switchTo().frame("mce_0_ifr"); // by using name or id switch to the iframe
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Rich Text Area']")));
		
		WebElement paragramTxtArea =driver.findElement(By.xpath("//body[@id='tinymce']/p"));
		
		System.out.println(paragramTxtArea.getText());
		
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
			
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}
}
