package assignmentpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number, username, or email')]")).sendKeys("radhika");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("kiran@19");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	}

}
