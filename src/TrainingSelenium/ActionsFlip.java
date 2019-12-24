package TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsFlip {

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
		WebDriver flip = new ChromeDriver();
		
		flip.get("http://www.flipkart.com");
		
		WebElement click = flip.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		click.click();
	
		
		Actions kart = new Actions(flip);
		
		WebElement mou1 = flip.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[6]"));
		kart.moveToElement(mou1).perform();
		
		WebElement cli = flip.findElement(By.xpath("//a[@title='Chairs']"));
		cli.click();
		
		WebElement sel = flip.findElement(By.xpath("//img[@alt='Kuber Industries Bathroom Stool']"));
		kart.moveToElement(sel).perform();
		sel.click();
		
		WebElement cart = flip.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		kart.moveToElement(cart).perform();
		cart.click();
		

	}

}



