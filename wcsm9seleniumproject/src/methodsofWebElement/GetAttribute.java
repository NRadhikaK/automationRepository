package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	String attributevalue = usnTB.getAttribute("class");
	System.out.println(attributevalue);
	
	//get the css property of username textbox i.e color
	String cssvalue = usnTB.getAttribute("color");
	System.out.println(cssvalue);
	
	//get the tagname of usertextbox
	String tag = usnTB.getTagName();
	System.out.println(tag);
	
	}

}
