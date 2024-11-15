//Click on Radio button
package Day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws Exception {

		WebDriver wd = new ChromeDriver();

		wd.get("https://demo.guru99.com/test/radio.html");
		
		Thread.sleep(3000);
		
		wd.findElement(By.id("vfb-7-1")).click();
		
		Thread.sleep(3000);

		wd.findElement(By.id("vfb-7-2")).click();

	}

}
