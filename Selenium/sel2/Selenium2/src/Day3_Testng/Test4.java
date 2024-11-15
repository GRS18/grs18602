package Day3_Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Test4 {
	public static WebDriver wd;

	@BeforeTest
	public void beforeTest() {
		wd = new ChromeDriver();

		wd.get("https://practicetestautomation.com/practice-test-login/");
	}

	@Test
	public void process() throws Exception {
		wd.findElement(By.xpath("//input[@name = 'username']")).sendKeys("Girish");
		Thread.sleep(3000);
		wd.findElement(By.xpath("//input[@name = 'password']")).sendKeys("GRS");
		Thread.sleep(3000);
		wd.findElement(By.xpath("//button[@id = 'submit']")).click();
		Thread.sleep(3000);

	}

	@AfterTest
	public void afterTest() {
		wd.close();
	}

}
