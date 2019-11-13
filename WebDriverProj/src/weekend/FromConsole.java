package weekend;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FromConsole {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A");
		int a=s.nextInt();
		System.out.println("Enter B");
		int b=s.nextInt();
		System.out.println(a*b);
		
		WebDriver driver=new FirefoxDriver();
		System.out.println("Enter URL");
		String url=s.next();
		driver.get(url);
		driver.manage().window().maximize();
		

	}

}
