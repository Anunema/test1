package Pages;

public class Feedback {
	public static void clickTellus()
	{
		locaters.Locaters.clickLink().click();
	}
	public static void selectOption()
	{
		locaters.Locaters.clickRadioBtn().click();
		locaters.Locaters.clickSummary().click();
		locaters.Locaters.clickBuy().click();
		locaters.Locaters.clickSeller().click();
		
		
	}
	public static void addText()
	{
		locaters.Locaters.addFeedback().sendKeys("nothing to improve");
	}
	public static void clickSend()
	{
		locaters.Locaters.send().click();
	}

}
