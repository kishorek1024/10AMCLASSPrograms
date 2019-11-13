package packone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']")).click();
		
		WebDriverWait ww=new WebDriverWait(driver, 30);
		
		//ww.until(ExpectedConditions.titleContains("Passworddd"));
		ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("img"), 1));
		
		driver.findElement(By.id("identify_email")).sendKeys("Kishore");
		
		/*driver.findElement(By.id("Email")).sendKeys("kishore.k1024");
		
		driver.findElement(By.id("next")).click();
		//Thread.sleep(20000);
		driver.findElement(By.id("Passw")).sendKeys("abcdefgh");
		*/
		

	}

}
