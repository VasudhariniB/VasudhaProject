package TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe" );
		
		WebDriver demo = new ChromeDriver();
		
		demo.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions account = new Actions(demo);
		
		WebElement source1 = demo.findElement(By.id("credit2"));
		WebElement desti1 = demo.findElement(By.id("bank"));
		
		account.dragAndDrop(source1, desti1).perform();
		
		WebElement source2 = demo.findElement(By.id("fourth"));
		WebElement desti2 = demo.findElement(By.id("amt7"));
		
		account.dragAndDrop(source2, desti2).perform();
		
		
		WebElement source3 = demo.findElement(By.id("credit1"));
		WebElement desti3 = demo.findElement(By.id("loan"));
		
		account.dragAndDrop(source3, desti3).perform();
		
		WebElement source4 = demo.findElement(By.id("fourth"));
		WebElement desti4 = demo.findElement(By.id("amt8"));
		
		account.dragAndDrop(source4, desti4).perform();

	}

}
