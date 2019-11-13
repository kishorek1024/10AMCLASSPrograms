package weekend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjects {
	
	/*// First Way
	By uid=By.id("email");
	By pwd=By.id("pass");*/
	
	
	// SecondWay
	@FindBy(id="email") WebElement uid1;
	@FindBy(id="pass") WebElement pwd1;
	

}
