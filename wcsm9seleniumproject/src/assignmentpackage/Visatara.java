package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Visatara {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");	
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		driver.findElement(By.name("flightSearchFrom")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.name("flightSearchTo")).sendKeys("mumbai");
		Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='departCalendar']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[data-date='22']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[data-date='25']")).click();
	Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='passengers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[value='business']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class^='col-xs-12 done_btn ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='book-flight-widget']")).click();
		Thread.sleep(2000);
		}
}