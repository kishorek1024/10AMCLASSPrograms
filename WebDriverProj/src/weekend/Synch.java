package weekend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Synch {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/ServiceLogin?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1#identifier");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Entering Email
		driver.findElement(By.id("Email")).sendKeys("kishore.k1024");
		// Click on Next Button
		driver.findElement(By.id("next")).click();
		
		//Thread.sleep(30000);
		// Enter Password
		driver.findElement(By.id("Passw")).sendKeys("abcdef");

	}

}
