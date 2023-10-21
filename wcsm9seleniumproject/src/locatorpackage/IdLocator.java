package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		//to launch the browser
	WebDriver	 driver=new ChromeDriver();
	
	//maimize the chrome browser
	driver.manage().window().maximize();
	
	//to launch the web application
	driver.get("file:///C:/Users/RADHIKA/OneDrive/Desktop/html%20Code/loginpage.html");
	
	//stop the execution script for 2 sec
	Thread.sleep(2000);
	
	//identify username by using id
	driver.findElement(By.id("11")).sendKeys("admin");
	
	//identify password by using id
	driver.findElement(By.id("12")).sendKeys("manager");
	
	}

}
