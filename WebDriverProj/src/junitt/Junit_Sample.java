package junitt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Sample {
	
	@BeforeClass
	public static void BeforeMethod(){
		System.out.println("This is Before Method");	}
	@AfterClass
	public static void AfterMethod(){
		System.out.println("This is After Method");	}
	@Test
	public void klmn(){
		System.out.println("This is Test1");	}
	@Test
	public void xyzz(){
		System.out.println("This is Test2");	}
	@Test
	public void abcd(){
		System.out.println("This is Test3");	}

}
