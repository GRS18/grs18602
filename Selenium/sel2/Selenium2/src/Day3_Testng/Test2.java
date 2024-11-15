package Day3_Testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test2 {
	@Test(priority = 1)
	public void reg() {
		System.out.println("this is reg class");
	}

	@Test(priority = 2, enabled = false)
	public void login() {
		System.out.println("this is login class");
	}

	@Test
	public void home() {
		System.out.println("this is home class");
	}
	
	@Test
	public void contact() {
		throw new SkipException("Incomplete testcase");
	}
	
	@Test(priority = 3)
	public void logout() {
		System.out.println("this is logout class");
	}
}
