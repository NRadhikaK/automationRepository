package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://laptop-2a0euhhm/login.do");
	WebElement usnTB = driver.findElement(By.name("username"));
	usnTB.sendKeys("admin");
	Thread.sleep(2000);
	WebElement passTB = driver.findElement(By.name("pwd"));
	passTB.sendKeys("manager");
	Thread.sleep(2000);
	
	//clear username TB and passTB
	usnTB.clear();
	passTB.clear();
	}

}
