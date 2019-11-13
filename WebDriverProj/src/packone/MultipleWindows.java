package packone;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Clicking On Data Policy Link
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.id("cookie-use-link")).click();
		
		Set<String> a=driver.getWindowHandles();
		ArrayList windows=new ArrayList(a);
		
		int i;
		for(i=0; i<windows.size(); i++){
			String title=driver.switchTo().window((String)windows.get(i)).getTitle();
			System.out.println(title);
			List<WebElement> links=driver.switchTo().window((String)windows.get(i)).findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.switchTo().window((String)windows.get(i)).close();
			
		}
		
		

	}

}
