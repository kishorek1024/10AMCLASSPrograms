package packone;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Framess {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\Desktop\\WD1010\\1030.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result", 0);
		
				
		WebElement f1=driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		List<WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
		
		int i;
		
		Label l1=new Label(0, 0, "All Links");
		ws.addCell(l1);
		
		for(i=1; i<links.size(); i++){
			String lname=links.get(i).getText();
			Label l=new Label(0, i, lname);
			ws.addCell(l);
		}
		wwb.write();wwb.close();
		
		
		/*WebElement f1=driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		WebElement f2=driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		List<WebElement> links=driver.switchTo().frame(f1).findElements(By.tagName("a"));
		
		int i;
		
		for(i=0; i<links.size(); i++){
			links.get(i).click();
			driver.switchTo().parentFrame();
			Thread.sleep(3000);
			List<WebElement> links1=driver.switchTo().frame(f2).findElements(By.tagName("a"));
			System.out.println(links1.size());
			Thread.sleep(3000);	
			driver.switchTo().parentFrame();
			driver.switchTo().frame(f1);
		}*/
		
		/*List<WebElement> frames=driver.findElements(By.tagName("frame"));
		
		int i; int j;
		
		for(i=0; i<frames.size(); i++){
			List<WebElement> links=driver.switchTo().frame(i).findElements(By.tagName("a"));
			for(j=0; j<links.size(); j++){
				System.out.println(links.get(j).getText());
			}
			System.out.println("---------------------------------------");
			driver.switchTo().parentFrame();
		}*/
		
		//System.out.println(frames.size());
		
		
		
		//driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a"))

		/*// Creating Webelement for Frame1
		WebElement f1=driver.findElement(By.xpath("//frame[@name='packageListFrame']"));
		
		// Click on the link in Frame1
		driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
		
		driver.switchTo().parentFrame();
		
		// Creating Webelement for Frame2
		WebElement f2=driver.findElement(By.xpath("//frame[@name='packageFrame']"));
		
		// Clciking on link in Frame2
		driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[2]/a/span")).click();*/
		
		
		
		
		
		
		
		
		
	}

}
