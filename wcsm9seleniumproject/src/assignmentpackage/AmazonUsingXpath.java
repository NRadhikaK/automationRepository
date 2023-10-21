package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonUsingXpath {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/b?node=1389401031");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("laptop");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@value,'Go')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//i[@aria-label='Eligible for Prime.']/ancestor::div[@data-avar='deal']/descendant::span[@class='a-price-whole'])[3]")).click();
	
	}

}
