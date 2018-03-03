package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//Piyush//Desktop//Selenium//new driver//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		
		
		driver.close();
		driver.quit();
		
		System.out.println("done");
	}

}
