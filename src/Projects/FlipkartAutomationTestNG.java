package Projects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FlipkartAutomationTestNG {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver
       
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void testFlipkartAutomation() {
        try {
            // Open Flipkart
            driver.get("https://www.flipkart.com");

            // Close the login pop-up
            try {
                WebElement closePopup = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
                closePopup.click();
            } catch (Exception e) {
                System.out.println("Login pop-up not displayed.");
            }

            // Scroll down the page
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            
            Thread.sleep(3000);

            // Select a product (example: the first product from a section)
            WebElement product = driver.findElement(By.xpath("(//a[@class='_1fQZEK'])[1]"));
            product.click();

            // Switch to the product details tab
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }

            // Add to cart
            WebElement addToCart = driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]"));
            addToCart.click();

            System.out.println("Product added to cart successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
