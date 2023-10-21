package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TelegramLoginPage {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://telegr.am/user_mgt/login");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("radhika");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("12345");
	driver.findElement(By.id("F10378557238S1JLGT")).click();
	
	
	
	}

}
