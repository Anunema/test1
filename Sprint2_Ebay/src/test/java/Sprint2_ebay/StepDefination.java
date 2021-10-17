package Sprint2_ebay;



import Browser.Browser;
import Pages.ReadData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Browser{

@Given("Browser should be open")
public void browser_should_be_open() {
	setDriver1();
	
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@And("user should be on ebay home page")
public void user_should_be_on_ebay_home_page() throws InterruptedException
{
  Thread.sleep(5000);
}

@And("user navigate to login page")
public void user_navigate_to_login_page() {
	//Login.clickLogin();
	Pages.Login.clickLogin1();
	//clickLogin();
  
}

@When("user enters the valid email address")
public void user_enters_the_valid_email_address() throws InterruptedException {
	Pages.Login.enterEmail();
	Pages.Login.continueButton();
	Thread.sleep(5000);
    // Write code here that turns the phrase above into concrete actions
   
}

@And("user enters the valid password")
public void user_enters_the_valid_password() {
	Pages.Login.password();


    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("user clicks on login button")
public void user_clicks_on_login_button()  {
	Pages.Login.signIn1();

}

@Then("login must be successful")
public void login_must_be_successful() throws InterruptedException {
	System.out.println("Login successfull");
	Thread.sleep(30000);

	
//	Pages.Login.checkLogin();

}

//Scenario2

@Given("User should be on ebay homepage")
public void user_should_be_on_ebay_homepage() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
	System.out.println("User is on ebay homepage");
}

@Given("user is able to see my ebay option")
public void user_is_able_to_see_my_ebay_option()
{
	Pages.PurchaseHistory.getPurchaseHistory();
}

@When("user should click on purchase history option")
public void user_should_click_on_purchase_history_option() 
{
	System.out.println("Purchase history option is visible");

    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("user should be navigated to purchase history page")
public void user_should_be_navigated_to_purchase_history_page() throws InterruptedException {
	System.out.println("User navigate to purchase history page");
	Thread.sleep(2000);

    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

//Scenario3

@Given("user should be on purchase history page")
public void user_should_be_on_purchase_history_page() {
	System.out.println("User is in order on purchase history ");
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@And("user is able to see search option in orders")
public void user_is_able_to_see_search_option_in_orders() {
	System.out.println("Search option is visible");
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("user enter the product name in search box")
public void user_enter_the_product_name_in_search_box() {
	System.out.println("Enter the product name");
	//Pages.ReadData.Readdata.sendKeys(ReadData.readExcel(0, 0));
	//Pages.SearchProduct.enter_ProductName();
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	
	locaters.Locaters.enterPro_Name().sendKeys(ReadData.readExcel(0,0));
	
}

@And("hits the search button")
public void hits_the_search_button() throws InterruptedException {
	Pages.SearchProduct.click_Search();
	Thread.sleep(2000);

    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("user is able to see the search result")
public void user_is_able_to_see_the_search_result() throws InterruptedException {
	Thread.sleep(2000);
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

//scenario4

@Given("User should be on order details")
public void user_should_be_on_order_details()
{
	System.out.println("User should be on orders page");
}

@And("See cancel details option is visible")
public void see_cancel_details_option_is_visible() {
	System.out.println("User is able to see cancel details button");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("User click on See cancel details option")
public void user_click_on_see_cancel_details_option() throws InterruptedException {
	Pages.CancelDetails.clickCancel();
	Thread.sleep(4000);
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@Then("User is redirected to cancel details page")
public void user_is_redirected_to_cancel_details_page() {
	System.out.println("User is able to see cancel details page");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

//Scenario 5

@Given("User Should be on Cancel items")
public void user_should_be_on_cancel_items() {
	System.out.println("User is navigate to purchase history page");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Given("User is able to see views seller's other item option")
public void user_is_able_to_see_views_seller_s_other_item_option() {
	System.out.println("View item details button is visble");
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}

@When("User click on View seller's other item option")
public void user_click_on_view_seller_s_other_item_option() throws InterruptedException {
	Pages.ViewOtherItems.click_ViewCancel();
	Thread.sleep(4000);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("User is redirected to other item option page")
public void user_is_redirected_to_other_item_option_page()
{
	System.out.println("User is redirected to item option page");
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
}










}
