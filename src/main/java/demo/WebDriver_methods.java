package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_methods {

	
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		//System.out.println(driver.getPageSource());
		
		String url=driver.getCurrentUrl();
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(url);
		
		driver.findElement(By.xpath("(//a[text()='Home'])[1]")).sendKeys("sairam");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//driver.close();
		
		
		
	}
	
	
	
}
