package TrainingSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bv\\eclipse-workspace\\Library\\Drivers\\chromedriver.exe");
		
		WebDriver face = new ChromeDriver();
		
		face.get("https://www.facebook.com");
		
		String check = face.getTitle();
		System.out.println(check);
		
		String check1 = face.getCurrentUrl();
		System.out.println(check1);
		
		WebElement mail = face.findElement(By.id("email"));
		mail.sendKeys("vasudharini.b@gmail.com");
		
		WebElement pwd = face.findElement(By.name("pass"));
		pwd.sendKeys("123456");
		
		

	}

}
