package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmant {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.amazon.in/ref=cs_503_link/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple watches");
driver.findElement(By.id("nav-search-submit-button")).click();

}
}
