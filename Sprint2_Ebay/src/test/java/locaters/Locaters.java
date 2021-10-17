package locaters;


	import Browser.Browser;


//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Locaters extends Browser {
		
		
		public static WebElement clickLogin() {
			WebElement click_Login=driver.findElement(By.xpath("//a[@href='https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2F']"));
			return click_Login;
		}
		
		public static WebElement enterValideEmail() {
			// checking for valid user user name.
			WebElement email=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/form[1]/div[1]/div/div/input"));
			return email;
		}
		
		public static WebElement continueButton()
		{
	        WebElement continue_butn=driver.findElement(By.name("signin-continue-btn"));
	        return continue_butn;
		}
		
		
		public static WebElement enterValidePassword()
		{
			// checking for valid pswd.
			WebDriverWait wait1 = new WebDriverWait(driver, 10);
	        WebElement password = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pass']")));
	        return password;
		}
		
		
		public static WebElement SignIn() {
			// click on signin button.
			WebElement signIn_button=driver.findElement(By.id("sgnBt"));
			return signIn_button;
		
		}
		
		public static void Checklogin()
		{
			// click on signin button.
			String expected_title = "Electronics, Cars, Fashion, Collectibles & More | eBay";
			String actual_title = driver.getTitle();
			if (expected_title.equals(actual_title)) {
				System.out.println("Login Successfull");
				}
				else {
					System.out.println("Login failed");
					}
			
			}
		public static void myEbay()
		{
		    Actions act = new Actions(driver);
		    act.moveToElement(driver.findElement(By.xpath("/html/body/header/div/ul[2]/li[4]/div/a[1]"))).build().perform();
		    driver.findElement(By.xpath("/html/body/header/div/ul[2]/li[4]/div/div/ul/li[5]/a")).click();

		}
		public static WebElement enterPro_Name()
		{
			WebElement search_Order  = driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div[2]/div[2]/div[2]/div[1]/section/div[1]/div[1]/div[2]/div/span/span/input"));
			return search_Order;
		}
		public static WebElement clickSearch()
		{
			WebElement search = driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div[2]/div[2]/div[2]/div[1]/section/div[1]/div[1]/div[2]/div/button"));
			return search;
		}
		public static WebElement seeCancelDetails()
		{
			WebElement seecancel_button= driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div[2]/div[2]/div[2]/div[2]/section/div[2]/div[3]/div/div/div[1]/div[2]/div[4]/div[1]/div/a"));
			return seecancel_button;
		}
		public static WebElement clickViewItem()
		{	driver.get("https://www.ebay.com/mye/myebay/purchase");
			WebElement cancel_ViewSellerButton= driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div[2]/div[2]/div[2]/div[2]/section/div[2]/div[3]/div/div/div[1]/div[2]/div[4]/div[2]/div/a"));
			return cancel_ViewSellerButton;
		}
		public static WebElement clickAddNote()
		{
			driver.get("https://www.ebay.com/mye/myebay/purchase");
			WebElement cancel_AddNote= driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div[2]/div[2]/div[2]/div[2]/section/div[2]/div[3]/div/div/div[1]/div[2]/div[4]/div[4]/div/span/div/button"));
			return cancel_AddNote;
			
		}
		public static WebElement enterText()
		{
			WebElement addText= driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div[2]/div[2]/div[2]/div[2]/section/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div[6]/div/div[1]/div[1]/textarea"));
			return addText;
		}
		public static WebElement clickSave()
		{
			WebElement cancel_Saveoption= driver.findElement(By.xpath("/html/body/div[5]/div[6]/div/div[2]/div[2]/div[2]/div[2]/section/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div[6]/div/div[2]/div[2]/button[3]"));
			return cancel_Saveoption;
		}
		public static WebElement clickLink()
		{
			driver.get("https://www.ebay.com/mye/myebay/purchase");

			WebElement tellus_link= driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div/div[1]/a"));
			return tellus_link;

		}
		public static WebElement clickRadioBtn()
		{
			WebElement radio_btn=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[1]/div[1]/div/div/fieldset/table/tbody/tr[3]/td[5]/div"));
			return radio_btn;
		}
		public static WebElement clickSummary()
		{
			WebElement purchaseHistory_btn=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[1]/div[2]/div/div[3]/fieldset/div[4]/div/span/input"));
			return purchaseHistory_btn;
		}
		public static WebElement clickBuy()
		{
			WebElement buy_btn=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[1]/div[2]/div/div[3]/fieldset/div[3]/div/span/input"));
			return buy_btn;
		}
		public static WebElement clickSeller()
		{
			WebElement seller_Option=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[1]/div[4]/div/div[3]/fieldset/div[8]/div/span/input"));
			return seller_Option;
		}
		public static WebElement addFeedback()
		{
			WebElement text_area=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[1]/div[6]/div/div[3]/textarea"));
			return text_area;
		}
		public static WebElement send()
		{
			WebElement send_btn=driver.findElement(By.xpath("/html/body/div/div[3]/form/div[1]/button[2]"));
			return send_btn;
		}
	}