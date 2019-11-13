package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITT {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://transfer.pcloud.com/");
		driver.manage().window().maximize();
		
		//Clicl on Upload Image
		driver.findElement(By.xpath("//img[@src='//pcdn-transfer.pcloud.com/Zfb/img/add_files_ico@2x.png']")).click();
		
		// Calling and Executing AutoIT exe file
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\WD99\\0727.exe");

	}

}
