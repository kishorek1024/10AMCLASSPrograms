package weekend;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		// Clicking on Datapolicy and Cookie policy links
		driver.findElement(By.id("privacy-link")).click();
		driver.findElement(By.id("cookie-use-link")).click();
		
		Set<String> a=driver.getWindowHandles();
		ArrayList windows=new ArrayList(a);
		
		int i;
		
		for(i=0; i<windows.size(); i++){
			System.out.println(driver.switchTo().window((String)windows.get(i)).getTitle());
			List<WebElement> links=driver.switchTo().window((String)windows.get(i)).findElements(By.tagName("a"));
			System.out.println(links.size());
			driver.switchTo().window((String)windows.get(i)).close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();

	}

}
