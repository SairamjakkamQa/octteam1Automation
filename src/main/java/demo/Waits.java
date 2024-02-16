package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
//
//		// driver.switchTo().alert().accept();
//
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(3000);
//		//al.accept();
//		al.dismiss();
//		al.sendKeys("demo");
		
		
		WebDriverWait wait=new WebDriverWait(driver, 15);
		
		driver.findElement(By.id("alert")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		

	}
}
