package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd=new ChromeDriver();

		String pw=wd.getWindowHandle();//save google as parent window

		wd.get("https://www.gmail.com");

		Actions act=new Actions(wd);

		WebElement w=wd.findElement(By.id("identifierId"));

		w.sendKeys("Girish");
		
		Thread.sleep(3000);
	
		act.doubleClick(w).build().perform();

	}

}
