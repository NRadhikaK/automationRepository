package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://integrator.actitime.com/auth/at");
	Thread.sleep(3000);
	driver.findElement(By.name("username")).sendKeys("monik");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("1234");
	
	}

}
