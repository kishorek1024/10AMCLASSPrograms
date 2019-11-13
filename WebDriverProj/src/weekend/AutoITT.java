package weekend;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITT {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// Click on Upload Image
		driver.findElement(By.xpath("//img[@src='//pcdn-transfer.pcloud.com/Zfb/img/add_files_ico@2x.png']")).click();
		
		// Execute AutoIT exe file
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\8AMWD\\0727.exe");
		
		
		
		

	}

}
