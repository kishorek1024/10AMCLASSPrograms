package weekend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class CallPO {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		/*PageObjects p=new PageObjects();
		driver.findElement(p.uid).sendKeys("Kishore");
		driver.findElement(p.pwd).sendKeys("abcdefgh");*/
		
		PageObjects p=PageFactory.initElements(driver, PageObjects.class);
		p.uid1.sendKeys("Kishore");
		p.pwd1.sendKeys("abcdefgh");
		
		
		

	}

}
