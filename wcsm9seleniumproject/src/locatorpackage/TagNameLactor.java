package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLactor {
	public static void main(String[] args) throws InterruptedException {
		//to launch the chrome browser
	WebDriver	driver=new ChromeDriver();
	
	//maximize the chrome browser
	driver.manage().window().maximize();
	
	//to launch the web page
	driver.get("file:///C:/Users/RADHIKA/OneDrive/Desktop/html%20Code/loginpage.html");
	
	//stop execution of script for 2sec
	Thread.sleep(2000);
	
	//identify username by using id
	driver.findElement(By.tagName("input")).sendKeys("admin");
	
	//identify password by using id
	driver.findElement(By.tagName("input")).sendKeys("manager");
	}

}
