package Day3_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

	public static WebDriver wd;

	@BeforeTest
	public void beforeTest() {
		wd = new ChromeDriver();

		wd.get("https://practicetestautomation.com/practice-test-login/");
	}

	@Test
	@Parameters({ "un", "pw" })
	public void process(String un, String pw) throws Exception {
		wd.findElement(By.xpath("//input[@name = 'username']")).sendKeys(un);
		Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@name = 'password']")).sendKeys(pw);
		Thread.sleep(3000);
		wd.findElement(By.xpath("//button[@id = 'submit']")).click();
		Thread.sleep(3000);

	}

	@AfterTest
	public void afterTest() {
		wd.close();
	}
}
