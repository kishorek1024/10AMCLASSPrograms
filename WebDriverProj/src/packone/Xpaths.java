package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpaths {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-CA&.intl=ca&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("login-username")).sendKeys("Kishore");
		//driver.findElement(By.xpath("html/body/div[2]/div/div[2]/a")).click();

		//driver.findElement(By.xpath("//*[@id='js_0']/ul/li[3]/a")).click();
	}

}
