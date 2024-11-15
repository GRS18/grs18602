package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd=new ChromeDriver();

		wd.get("https://demo.guru99.com/test/drag_drop.html");

		Actions act=new Actions(wd);

		WebElement drag=wd.findElement(By.id("credit2"));

		WebElement drop=wd.findElement(By.id("bank"));

		act.dragAndDrop(drag, drop).build().perform();

		

		WebElement drag2=wd.findElement(By.id("fourth"));

		WebElement drop2=wd.findElement(By.id("amt7"));
		
		Thread.sleep(2000);

		act.dragAndDrop(drag2, drop2).build().perform();

	}

}
