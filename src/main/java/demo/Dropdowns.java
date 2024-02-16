package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (6)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

//		WebElement dropdown=driver.findElement(By.id("country"));
//		Select sel=new Select(dropdown);
//		//sel.selectByIndex(9);
//		sel.selectByVisibleText("China");

		driver.findElement(By.id("APjFqb")).sendKeys("selenium");

		List<WebElement> autosuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']//b"));

		System.out.println(autosuggestions.size());

		for (WebElement options : autosuggestions) {

			System.out.println(options.getText());

			if (options.getText().contains("download")) {
				options.click();
			
			}

		}
	}

}
