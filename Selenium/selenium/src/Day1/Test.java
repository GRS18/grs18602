package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();	//to open browser
	
	wd.get("https://www.gmail.com");	//tO Open Link
			//OR
	wd.navigate().to("https://www.google.com");	//alternate method to open link
	
		//Thread.sleep(4000);	//becoz gmail come after 4sec of priviouse window
		//wd.get("https://www.gmail.com");	//first open google after that gmail open
		
		WebDriver wd1 = new ChromeDriver();	
		
		wd1.get("https://www.gmail.com");	//open two diiferent browsers (use two objects)
		
		//wd1.manage().window().maximize();	// maximize window
		
		
		//String s = wd1.getTitle();		//get title of website and print using string
		//System.out.println(s);
				//OR
		//System.out.println(wd1.getTitle());
		
		//System.out.println(wd1.getCurrentUrl());	//to print URL on console
		
//Q.COMPARE TWO URL IF TRUE THEN OP IS PASS
		
		
		
		
	}
}
