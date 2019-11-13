package weekend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaits {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate?lwv=110&ars=royal_blue_bar']")).click();
		WebDriverWait ww=new WebDriverWait(driver, 30);
		ww.until(ExpectedConditions.titleContains("Passwordss"));
		ww.until(ExpectedConditions.numberOfElementsToBe(By.tagName("a"), 20));
		ww.until(ExpectedConditions.elementToBeClickable(By.id("login")));
		driver.findElement(By.id("identify_email")).sendKeys("kishore");
		

	}

}
