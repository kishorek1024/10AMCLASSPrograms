package weekend;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class CallRC {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> imgs=driver.findElements(By.tagName("img"));
		System.out.println(imgs.size());
		
		/*WebElement uid=driver.findElement(By.id("email"));
		System.out.println(uid.getAttribute("class"));
		System.out.println(uid.getTagName());
		System.out.println(uid.getSize());
		System.out.println(uid.getLocation());
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		System.out.println(driver.manage().window().getSize());*/
		//System.out.println(driver.manage().window().fullscreen());
		
		
		/*boolean a=driver.findElement(By.id("pass")).isDisplayed();
		if(a==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		boolean b=driver.findElement(By.id("pass")).isEnabled();
		if(b==true)
			System.out.println("Pass");
		else
			System.out.println("Fail");*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement(By.id("email")).sendKeys("Kishore");
		
		WebDriverBackedSelenium s=new WebDriverBackedSelenium(driver, "http://");
		
		s.type("id=pass", "abcdefgh");
		driver.findElement(By.id("day")).sendKeys("24");
		s.select("id=month", "Apr");
		*/

	}

}
