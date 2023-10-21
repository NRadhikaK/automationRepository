package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshXpath {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.meesho.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='sc-dEVLtI eEPmTw sc-dkcEsn hYyEwD search-input-elm sc-dkcEsn hYyEwD search-input-elm']")).sendKeys("women kurti");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='sc-iveFHk JAnzY']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[contains(@font-size,'16px')]/ancestor::div[@class='sc-dkrFOg ProductList__GridCol-sc-8lnc8o-0 cokuZA eCJiSA']/descendant::h5[@class='sc-eDvSVe dwCrSh'])[4]")).click();
	
	}

}
