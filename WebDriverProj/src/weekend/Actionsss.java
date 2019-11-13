package weekend;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		// Importing Actions Class
		Actions a=new Actions(driver);
		
		//WebElement uid=driver.findElement(By.id("email"));
		//a.sendKeys(Keys.DOWN).build().perform();
		//a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		
		/*a.contextClick(uid).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.ENTER).build().perform();*/
		
		
		/*WebElement button=driver.findElement(By.id("Login"));
		a.doubleClick(button).build().perform();*/
		
		/*a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();
		*/
		
		/*// Creating Webelement for Companies Link
		WebElement companies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		
		a.moveToElement(companies).build().perform();
		
		// Clicking On About Companies Link
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();*/

	}

}
