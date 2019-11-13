package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BO {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\WD1010\\Jars\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("http://facebook.com");
		driver1.manage().window().maximize();
		
		driver1.findElement(By.id("email")).sendKeys("Kishore");
		driver1.findElement(By.id("pass")).sendKeys("abcdefgh");
		
		driver1.findElement(By.id("day")).sendKeys("24");
		driver1.findElement(By.id("month")).sendKeys("Apr");
		
		driver1.findElement(By.id("email")).clear();
		
		
		

	}

}
