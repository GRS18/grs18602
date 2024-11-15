package Day3_Testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Test1 {
	public static WebDriver wd;

	@Test
	public void f() {
		wd.findElement(By.xpath("//input[@name = 'firstName']")).sendKeys("Girish");
	}

	@BeforeTest
	public void beforeTest() {
		wd = new ChromeDriver(); // to open browser

		wd.get("https://demo.guru99.com/test/newtours/register.php");
	}

}
