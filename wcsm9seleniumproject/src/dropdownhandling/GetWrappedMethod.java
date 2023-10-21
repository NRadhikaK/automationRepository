package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/RADHIKA/OneDrive/Desktop/html%20Code/multiselctdropdowm");
	WebElement dropdown = driver.findElement(By.id("iddd"));
	
	//handle the dropdown
	Select sel = new Select(dropdown);
	
	//get the option from by using getwrappedelement
	WebElement all = sel.getWrappedElement();
	
	//by the address of menu(id-idddd)
	System.out.println(all);
	//all the list of menu
	System.out.println(all.getText());
	
	//get all the options from dropdown by using getoption
	List<WebElement> options = sel.getOptions();
	for(WebElement opt:options)
	{
		Thread.sleep(2000);
	    System.out.println(opt.getText());
	}
	}

}
