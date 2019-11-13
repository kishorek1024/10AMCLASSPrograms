package weekend;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framess {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();
		
		List<WebElement> frames=driver.findElements(By.tagName("frame"));
		//System.out.println(frames.size());
		
		int i; int j;
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			System.out.println(links.size());
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText());
				System.out.println("---------------------------");
			}
			
			driver.switchTo().parentFrame();
		}
		
		
		/*//driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();

		// Creating Webelement for Frame1
		WebElement f1=driver.findElement(By.name("packageListFrame"));
		
		// Switch focus from Page to Frame1
		driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
		
		driver.switchTo().parentFrame();
		// Creating Webelement for Frame2
		WebElement f2=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[2]/a/i")).click();*/
	}

}
