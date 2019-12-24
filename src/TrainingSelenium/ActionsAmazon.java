package TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
		WebDriver amazon = new ChromeDriver();
		
		amazon.get("http://www.amazon.iN");
		
		//Actions power = new Actions(amazon);
		
		WebElement click = amazon.findElement(By.id("searchDropdownBox"));
		click.click();
		
		

	}

}
