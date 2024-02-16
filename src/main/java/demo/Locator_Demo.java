package demo;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Demo {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");

		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// driver.findElement(By.id("fname")).sendKeys("john smith");

//		List<WebElement> tags = driver.findElements(By.tagName("input"));
//
//		System.out.println(tags.size());
//		
//		
//		List<WebElement> options=driver.findElements(By.xpath("//input[@id='moption']"));
//		
//		
//		for(WebElement boxes:options) {
//			boxes.click();
//			
//		}
		
		
		WebElement alert=driver.findElement(By.xpath("//button[text()='Prompt']"));
		
		WebElement box=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		//Thread.sleep(3000);
		
		//Alert al=driver.switchTo().alert();
		
		//al.accept();  //no such alert exception
		//al.dismiss();
		
		WebElement scroll=driver.findElement(By.xpath("//a[text()='merrymoonmary']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", alert);
		
		js.executeScript("arguments[0].value='hello';", box);
		
		js.executeScript("window.scrollBy(0,500);");
		
		js.executeScript("arguments[0].scrollIntoView(true);",scroll );
	}

}
