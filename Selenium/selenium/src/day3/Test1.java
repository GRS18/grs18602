package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://demo.guru99.com/test/newtours/register.php");
		
		//input[@name='firstName']
		
		//input[@id='email']
		
		//a[contains(text(),'SUPPORT')]	//this method for link
		
		//a[contains(text(),'CONTACT')]
		
		//input[@name='firstName']//following::input[7]	//next tag input at 7 index
	}

}
