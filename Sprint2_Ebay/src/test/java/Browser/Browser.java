package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser {
	public static WebDriver driver;
	//Browser setup
	public void setDriver1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
			
		String currenttitle = driver.getCurrentUrl();
			

		System.out.println("the currenrt url is:"+currenttitle);
			

	     driver.manage().window().maximize();
	}


}
