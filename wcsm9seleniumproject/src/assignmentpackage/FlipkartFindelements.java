package assignmentpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartFindelements {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[@role='button']")).click();
	driver.findElement(By.name("q")).sendKeys("laptops");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='33 MORE']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Core i7']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Apply Filters']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[text()='Brand']")).click();
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	Thread.sleep(2000);
	
	//identify the name of laptop
	  List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	  //identify the price of laptop
	  List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	  
	  for(int i=0;i<allLaptops.size();i++)
	  {
		String laptop = allLaptops.get(i) .getText();
		Thread.sleep(2000);
		
		for(int j=i;j<=i;j++)
		{
		   String price = allPrice.get(j).getText();
		   Thread.sleep(2000);
		   System.out.println(laptop+" + "+price);
		}
	  }
	}

}
