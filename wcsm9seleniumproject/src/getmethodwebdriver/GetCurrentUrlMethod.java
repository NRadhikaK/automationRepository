package getmethodwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {
	public static void main(String[] args) throws InterruptedException {
		  WebDriver   driver  = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  String UrlOfLoginPage = driver.getCurrentUrl();
		  System.out.println(UrlOfLoginPage);
		  Thread.sleep(2000);

		  driver.close();
	}

}
