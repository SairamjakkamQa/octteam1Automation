package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_methods {

	public static void main(String[] args) {

		// WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://trytestingthis.netlify.app/");

//	WebElement	Checkbox=driver.findElement(By.id("male"));
//	
//	
//	Checkbox.click();
//	System.out.println(Checkbox.isSelected());

		String text = driver.findElement(By.xpath("//h1[text()='Your Website to practice Automation Testing']")).getText();

		System.out.println(text);

		WebElement button = driver.findElement(By.xpath("//button[text()=' Submit']"));

		System.out.println(button.isEnabled());
	}

}
