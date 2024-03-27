package x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("WebDriver.Firefox.Driver","C:\\Users\\kutty\\Downloads\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");

	        // Instantiate the Chrome driver
	        WebDriver driver = new FirefoxDriver();

	        // Launch a website
	        driver.get("https://testsigma.com/");
	        driver.manage().window().maximize();
	        // Identify the element to be hovered
	        WebElement element = driver.findElement(By.xpath("/html/body/header/div/nav/ul[1]/li[4]/a"));

	        // Instantiate the Actions class
	        Actions actions = new Actions(driver);

	        // Perform the mouse hover action
	        actions.moveToElement(element).build().perform();
	        
	        // close the browser
	        
	    }
	
	}


