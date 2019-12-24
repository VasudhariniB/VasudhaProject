package TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysgle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
		WebDriver google = new ChromeDriver();
		
		google.get("https://www.google.com");
		
		String tit = google.getTitle();
		System.out.println(tit);
		
		String tit1 = google.getCurrentUrl();
		System.out.println(tit1);
		
		WebElement find = google.findElement(By.xpath("//input[@id=fakebox-'input']"));
		find.sendKeys("Greens Technology");
		

	}

}
