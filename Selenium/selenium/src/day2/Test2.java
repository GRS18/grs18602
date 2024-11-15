//send values to alert
package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws Exception {
	WebDriver wd = new ChromeDriver();
	
	wd.get("https://demoqa.com/alerts");
	Thread.sleep(2000);
	wd.findElement(By.id("")).click();
	Alert al= wd.switchTo().alert();
	al.sendKeys("grs");
//	String s = al.getText();
//	System.out.println(s);
	
	al.accept();
	}
}
