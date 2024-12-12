package com.Switchto;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle() + "  " + driver.getCurrentUrl());

		int framecount = driver.findElements(By.tagName("frame")).size();
		System.out.println("Total number of  iframe on the page are " + framecount);

	//	driver.switchTo().frame("frame-top").switchTo().frame("frame-right");
		driver.switchTo().frame(0).switchTo().frame(2);

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

		driver.switchTo().defaultContent();

		//driver.switchTo().frame("frame-top").switchTo().frame("frame-left");
		
		driver.switchTo().frame(0).switchTo().frame(0);

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());

		driver.switchTo().defaultContent();

		//driver.switchTo().frame("frame-top").switchTo().frame("frame-middle");
		driver.switchTo().frame(0).switchTo().frame(1);

		System.out.println(driver.findElement(By.xpath("/html/body/div")).getText());
				
		driver.switchTo().defaultContent();

		//driver.switchTo().frame("frame-bottom");
		driver.switchTo().frame(1);

		System.out.println(driver.findElement(By.xpath("/html/body")).getText());
		
		driver.close();

	}

}
