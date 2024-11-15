package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.gmail.com");
		
//		WebDriver wd1 = new ChromeDriver();	
//		wd1.get("https://www.gmail.com");
		
		//wd.navigate().back();	//to click on back btn and going to back(it back the link not tab)
		
		Thread.sleep(5000);		//wait for 5sec and the close
		wd.close();	//close browser
	}

}
