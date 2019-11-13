package packone;

import java.util.List;

import mx4j.tools.remote.soap.axis.ser.RoleDeserFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WebTables {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("http://facebook.com");
	driver.manage().window().maximize();
	
	WebElement month=driver.findElement(By.id("month"));
	List<WebElement> values=month.
			findElements(By.tagName("option"));
	System.out.println(values.size());
	
	Select s=new Select(month);
	s.selectByIndex(8);
		
	
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/sectors/bse/bse-cg");
		driver.manage().window().maximize();
		
		System.out.prinDtln(driver.findElement
		(By.xpath("//*[@id='leftcontainer']
		/div[2]/div[2]/table/tbody/tr[2]/td[3]")).getText());
		
		
		List<WebElement> r=driver.findElements(By.tagName("tr"));
		System.out.println(r.size());
		
		WebElement table=driver.findElement
		(By.xpath("//*[@id='leftcontainer']/div[2]/div[2]/table/tbody"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		String xpth1="tr[";
		String xpath2="]/td[1]/a";
		
		int i;
		for(i=1; i<rows.size();i++){
			System.out.println(table.findElement
			(By.xpath("tr[" + i + "]/td[1]/a")).getText());
			System.out.println(table.findElement
			(By.xpath(xpth1+i+xpath2)).getText());
		}
		
		//System.out.println(driver.findElement
		 * (By.xpath("//*[@id='leftcontainer']
		 * /div[2]/div[2]/table/tbody")).findElements(By.tagName("tr")).size());
		 */

	}

}
