package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampletest {

	public static void main(String[] args) {

		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jakkam Sairam\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();  
		
		driver.get("https://www.programsbuzz.com/article/selenium-webdriver-interface-classes-hierarchy");

	}

}
