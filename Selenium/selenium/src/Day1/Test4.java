package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws Exception {

		WebDriver wd = new ChromeDriver();

		wd.get("https://demo.guru99.com/test/newtours/register.php");

		wd.findElement(By.name("firstName")).sendKeys("Girish");

		wd.findElement(By.name("lastName")).sendKeys("Shinde");

		wd.findElement(By.name("phone")).sendKeys("0110010101");

		wd.findElement(By.id("userName")).sendKeys("aaa123@gmail.com");

		wd.findElement(By.name("address1")).sendKeys("plot no. 118/3");

		wd.findElement(By.name("city")).sendKeys("Jalgaon");

		wd.findElement(By.name("state")).sendKeys("Maharashtra");

		wd.findElement(By.name("postalCode")).sendKeys("425001");

		Select sr = new Select(wd.findElement(By.name("country")));
		sr.selectByVisibleText("INDIA");
//		//sr.selectByIndex(12);

		wd.findElement(By.id("email")).sendKeys("aaa123@gmail.com");

		wd.findElement(By.name("password")).sendKeys("grs7809");

		wd.findElement(By.name("confirmPassword")).sendKeys("grs7809");
		Thread.sleep(5000);
		wd.findElement(By.name("submit")).click();
	}

}
