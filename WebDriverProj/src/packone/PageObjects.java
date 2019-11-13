package packone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	/*public By uid=By.id("email");
	public By pwd=By.id("pass");*/
	
	@FindBy(id="email") WebElement uid;
	@FindBy(xpath="//*[@id='pass']") WebElement pwd;
	
	

}
