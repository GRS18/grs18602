//fetch data on console
package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();

		wd.get("https://demo.guru99.com/test/newtours/register.php");

		Thread.sleep(1000);

		WebElement we=wd.findElement(By.name("firstName"));

		we.sendKeys("Girish");

		String w=we.getAttribute("value");

		System.out.println(w);



		WebElement we1=wd.findElement(By.name("lastName"));

		String w1=we.getAttribute("value");

		System.out.println(w1);



	}

}
