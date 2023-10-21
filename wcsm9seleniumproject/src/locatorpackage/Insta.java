package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("radhika_nimbalkar_");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("kiran@1999");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("div[class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("")).click();
	driver.findElement(By.cssSelector("button[class='_a9-- _a9_0']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("span[class='xwmz7sl x1ncwhqj xo1l8bm xyqdw3p x1mpkggp xg8j3zb x1t2a60a']")).click();
	Thread.sleep(1000);
	
	}
	}


