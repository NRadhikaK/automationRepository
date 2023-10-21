package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/log");
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class,'_acap ')]"));
		
		//verify login Button is disable or enable
		 boolean status = loginButton.isEnabled();
		 
		 //click on button by using click method
		 driver.findElement(By.name("username")).sendKeys("radhika");
		 driver.findElement(By.name("password")).sendKeys("radhi123");
		 
		 //verify login button is disable or not
		 boolean disable=loginButton.isEnabled();
		 System.out.println(disable);
		 loginButton.click();
		
		 

	}

}
