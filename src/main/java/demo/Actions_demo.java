package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_demo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// WebElement login=driver.findElement(By.xpath("//span[text()='Login']"));

		WebElement photo = driver.findElement(By.id("drag1"));

		WebElement target = driver.findElement(By.id("div1"));
		Actions ac = new Actions(driver);

		ac.contextClick(photo).build().perform();

		// ac.dragAndDrop(photo, target).build().perform();

		// ac.moveToElement(login).build().perform();

	}
}
