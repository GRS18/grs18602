//Tab handleing
package day2;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandle {

	public static void main(String[] args) {

	WebDriver wd = new ChromeDriver();

		String pw = wd.getWindowHandle();
		wd.get("https://www.google.com");
		
		wd.switchTo().newWindow(WindowType.TAB);
		String cw = wd.getWindowHandle();

		wd.switchTo().window(pw);
	
		
	}

}
