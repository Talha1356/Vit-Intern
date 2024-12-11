package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GmailSignUp {

    @DataProvider(name = "GmailSignUpData")
    public Object[][] getData() {
        return new Object[][] { { "Talha", "Tai", "April", "10", "1990", "Male" }
        };
    }

    @Test(dataProvider = "GmailSignUpData")
    public void testGmailSignUp(String firstName, String lastName, String month, String day, String year,
            String gender) {
        

        WebDriver driver = new ChromeDriver();

        try {
            
            driver.get("https://accounts.google.com/signup");

            // Fill out the form
            driver.findElement(By.id("firstName")).sendKeys(firstName);
            driver.findElement(By.id("lastName")).sendKeys(lastName);

            driver.findElement(By.xpath("//*[@id=\"collectNameNext\"]/div/button/span")).click();

           
            Thread.sleep(4000);

           
            new Select(driver.findElement(By.id("month"))).selectByVisibleText(month);
            driver.findElement(By.id("day")).sendKeys(day);
            driver.findElement(By.id("year")).sendKeys(year);

            WebElement genderDropdown = driver.findElement(By.id("gender"));
            Select genderSelect = new Select(genderDropdown);
            genderSelect.selectByVisibleText(gender);

            // Click Next
            driver.findElement(By.xpath("//span[text()='Next']")).click();

            
            
            
            Thread.sleep(4000);

//            driver.findElement(By.xpath("(//div[@class='zJKIV lezCeb kAVONc i9xfbb N2RpBe' and @jsname='ornU0b' and @role='radio' and @data-value='custom'])[1]")).click();
//            Thread.sleep(4000);
//                   
//            driver.findElement(By.xpath("//input[@type='text' and @name='Username' and @aria-label='Create a Gmail address']\r\n"
//                		+ "")).sendKeys("Talha542355645");
//          Thread.sleep(4000);

          
          
            driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("talha6434834u890");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();

            Thread.sleep(4000);

            driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Talha@5432190");
            driver.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("Talha@5432190");
            driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
            

            Thread.sleep(4000);
            
            WebElement afghanistanOption = driver.findElement(By.xpath("//div[@class='TcuCfd NQ5OL nnGvjf']//li[3]"));
            afghanistanOption.click();

            driver.findElement(By.xpath("//input[@id='phoneNumberId']")).sendKeys("9511474987");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }
}
