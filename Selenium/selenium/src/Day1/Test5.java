//clear old data and type new data
package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws Exception {

		WebDriver wd = new ChromeDriver();

		wd.get("https://demo.guru99.com/test/newtours/register.php");

		WebElement we = wd.findElement(By.name("firstName"));

		we.sendKeys("Ram");

		Thread.sleep(3000);
		we.clear();

		we.sendKeys("Girish");

	}

}
