package dropdownhandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/RADHIKA/OneDrive/Desktop/html%20Code/singleselectdropdown.html");
	//identify dropdown and store it in ref variable
	WebElement menuDropDown = driver.findElement(By.id("idddd"));

//get all the option of menudropdown
Select sel = new Select(menuDropDown);
List<WebElement> allops = sel.getOptions();

//to eliminate duplicates we use hashset
HashSet<String> hs = new HashSet<String>();

//read the list by using for loop and eliminate duplicates
for(int i=0; i<allops.size();i++)
{
	WebElement op = allops.get(i);
	
	//get the text of webelement
	String dropDown = op.getText();
	//add the dropdown option into HashSet and remove duplicates
	hs.add(dropDown);
}
for(String opt:hs) 
{
	Thread.sleep(2000);
	System.out.println(opt);
	
}
	}

}
