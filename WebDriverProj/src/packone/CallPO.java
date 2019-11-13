package packone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		PageObjects po=PageFactory.initElements(driver, PageObjects.class);
		po.uid.sendKeys("Kishore");
		po.pwd.sendKeys("abcdefgh");
		
		PageObjects1 p1=PageFactory.initElements(driver, PageObjects1.class);
		p1.email1.sendKeys("zdhgfsdjk");
		
		
		
		
		
		/*PageObjects p=new PageObjects();
		driver.findElement(p.uid).sendKeys("Kishore");
		driver.findElement(p.pwd).sendKeys("abcdefgh");
		*/
		

	}

}
