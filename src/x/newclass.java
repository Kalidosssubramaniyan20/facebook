package x;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\kutty\\Downloads\\chromedriver-win64\\chromedriver-win64\\Chromedriver.exe");

	        // Instantiate the Chrome driver
	        WebDriver driver = new ChromeDriver();

	        // Launch a website
	        driver.get("https://testsigma.com/");
	        driver.manage().window().maximize();
	        // Identify the element to be hovered
	        WebElement element = driver.findElement(By.xpath("//a[text()=’Resources’]"));

	        // Instantiate the Actions class
	        Actions actions = new Actions(driver);

	        // Perform the mouse hover action
	        actions.moveToElement(element).build().perform();
	        
	        // close the browser
	        driver.close();
	    }
	
	}

