package SelectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://demoapps.qspiders.com/");
	
	//identify dropdown option and click
	driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
	
	//identify phone no dropdown
	WebElement dropdown1 = driver.findElement(By.xpath(""));
	
	Select sel = new Select(dropdown1);
	
	//select the option
	sel.selectByIndex(2);
	
	//identify country dropdown
	WebElement dropdown2 = driver.findElement(By.xpath(""));
	Select sel2 = new Select(dropdown2);
	sel2.selectByValue("india");
	}

}
