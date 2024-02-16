package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor_demo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement male=driver.findElement(By.id("male"));
		
		WebElement firstname=driver.findElement(By.id("fname"));
		
		WebElement lastname=driver.findElement(By.id("fname"));
		
		WebElement submit=driver.findElement(By.xpath("//button[text()=' Submit']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].value='sairam';", firstname);
		
		js.executeScript("arguments[0].click();", male);
		
		js.executeScript("arguments[0].scrollIntoView(true);", submit);
		

	}
	

}
