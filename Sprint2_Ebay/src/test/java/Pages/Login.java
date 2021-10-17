package Pages;

public class Login {
	public static void clickLogin1()
	{
		locaters.Locaters.clickLogin().click();
		//element1.click();
       // element1.sendKeys("Ebay@#16");
        
        //driver.findElement(By.id("sgnBt")).click();


         
	}
	public static void enterEmail()
	{
		locaters.Locaters.enterValideEmail().sendKeys("akankshapatil5001@gmail.com");
	}
	
	public static void continueButton()
	{
		locaters.Locaters.continueButton().click();
	}
	public static void password()
	{
		locaters.Locaters.enterValidePassword().sendKeys("Ebay@#16");
	}
	public static void signIn1()
	{
		locaters.Locaters.SignIn().click();
	}
	public static void checkLogin()
	{
		locaters.Locaters.Checklogin();
	}
}


