package TrainingSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class XpathTask1 {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
		WebDriver greens = new ChromeDriver();
		
		greens.get("http://www.greenstechnologys.com/");
		
		WebElement con = greens.findElement(By.xpath("//a[@href='contact.php']"));
		con.click();
		
		WebElement name = greens.findElement(By.id("InputName"));
		name.sendKeys("Vasudharini");
		
		WebElement email = greens.findElement(By.id("InputEmail1"));
		email.sendKeys("vasudharini.b@gmail.com");
		
		WebElement mob = greens.findElement(By.id("InputSubject"));
		mob.sendKeys("9003281906");
		
		Actions course = new Actions(greens);
		WebElement cou = greens.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		
		course.moveToElement(cou).perform();
		course.click();
		
		Robot sel = new Robot();
		for(int i=1; i<=7; i++) {
			
			sel.keyPress(KeyEvent.VK_DOWN);
			sel.keyRelease(KeyEvent.VK_PAGE_DOWN);
			
		}
		
		
		
		
		
		
		

	}

}
