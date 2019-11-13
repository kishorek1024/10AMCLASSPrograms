package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// Import Actions Class
		Actions a=new Actions(driver);
		
		WebElement uid=driver.findElement(By.id("email"));
		a.contextClick(uid).build().perform();
		
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.sendKeys(Keys.ENTER).build().perform();
		
		
		
		/*a.sendKeys(Keys.F5).build().perform();
		a.sendKeys(Keys.CONTROL+"t").build().perform();
		
		WebElement login=driver.findElement(By.id("login"));
		a.doubleClick(login).build().perform();*/
		
		
		
		/*// Creating Webelement for Companies
		WebElement copmpanies=driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/a/div"));
		
		// Moving cursor to companies
		a.moveToElement(copmpanies).build().perform();
		
		// Clicking on About Companies Link
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[3]/div/ul/li[2]/a")).click();*/

	}

}
