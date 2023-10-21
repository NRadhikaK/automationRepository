package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
	WebDriver	driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.airvistara.com/in/en");
	driver.findElement(By.id("cookieModalCloseBtn")).click();
	driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("pune");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("mumbai");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='travel-Dates']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@id='depart-radio']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-date='22']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-date='25']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='passengers']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@value='business']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
	
	
	}

}
