package Pages;

public class AddNote {
	public static void clickAddNoteButton()
	{
		locaters.Locaters.clickAddNote().click();
	}
	public static void addMessage()
	{
		locaters.Locaters.enterText().sendKeys("Price is too much");
	}
	public static void clickSave()
	{
		locaters.Locaters.clickSave().click();
	}
	
}
