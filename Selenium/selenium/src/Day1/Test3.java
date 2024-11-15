package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.demoblaze.com/");
		
		wd.findElement(By.id("signin2")).click();	//click on the web
		Thread.sleep(2000);

		wd.findElement(By.id("sign-username")).sendKeys("Girish");	//pass value in username
		
		wd.findElement(By.id("sign-password")).sendKeys("Grs@1234");	//pass value in password
		
	}

}
