//handle alert (click ok btn in aler)
package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		wd.findElement(By.id("alertButton")).click();
		Alert al= wd.switchTo().alert();
		String s = al.getText();
		System.out.println(s);
		
		al.accept();

	}

}
