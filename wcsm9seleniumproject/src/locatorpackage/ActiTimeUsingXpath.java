package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeUsingXpath {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://laptop-2a0euhhm/login.do");
	//identify username by using Xpath
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	Thread.sleep(2000);
	//identify password by using Xpath
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	//select chehbox by using Xpath
	driver.findElement(By.xpath("//input[@name='remember']")).click();
	Thread.sleep(1000);
	//click on login using xpath
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(1000);
	//click on user text using Xpath
	driver.findElement(By.className("")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("")).click();
	}

}
