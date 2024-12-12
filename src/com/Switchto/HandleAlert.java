package com.Switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		

		Alert alert = driver.switchTo().alert(); 

		alert.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();
		
		//alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		
		alert.sendKeys("Hi all, welcome in the team!!!!");
		alert.accept();
		
		//alert.dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());

		driver.findElement(By.linkText("Elemental Selenium")).click();

		Thread.sleep(3000);

		driver.quit();

	}
}
