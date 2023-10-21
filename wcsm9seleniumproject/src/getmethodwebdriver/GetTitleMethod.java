package getmethodwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com");
			Thread.sleep(4000);
		System.out.println(driver.getTitle());
	    driver.close();
	}

}
