package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipletab_handel {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();

		String aw = wd.getWindowHandle();
		wd.get("https://www.google.com");

		wd.switchTo().newWindow(WindowType.TAB);
		wd.get("https://www.selenium.dev/");
		String bw = wd.getWindowHandle();

		wd.switchTo().newWindow(WindowType.TAB);
		wd.get("https://en.wikipedia.org/wiki/India");
		String cw = wd.getWindowHandle();

		wd.switchTo().newWindow(WindowType.TAB);
		wd.get("https://www.gmail.com");
		String dw = wd.getWindowHandle();

		wd.switchTo().window(dw);
		wd.switchTo().window(cw);
		wd.switchTo().window(bw);
		wd.switchTo().window(aw);
		wd.switchTo().window(dw);

		wd.close();

		 //wd.quit(); //to close browser
	}
}