Feature: feature to test ebay test functionality
Scenario: To validate user is bale to login or not
Given Browser should be open
And user should be on ebay home page
And user navigate to login page
When user enters the valid email address
And user enters the valid password
When user clicks on login button
Then login must be successful


Scenario: To validate that the user is able to navigate to purchase history page
Given User should be on ebay homepage
And user is able to see my ebay option
When user should click on purchase history option
Then user should be navigated to purchase history page

Scenario: To validate the search option in purchase history orders is enabled.
Given user should be on purchase history page
And user is able to see search option in orders 
When user enter the product name in search box
And hits the search button
Then user is able to see the search result

Scenario: To validate user is able to navigate to cancel detail page after clicking
on See cancel details
Given User should be on order details
And See cancel details option is visible
When User click on See cancel details option
Then User is redirected to cancel details page


Scenario: To validate user is able to navigate to the seller other items page after
clicking on View seller's other option
Given User Should be on Cancel items
And User is able to see views seller's other item option
When User click on View seller's other item option
Then User is redirected to other item option page


#Scenario: To validate user is able to click on add note option and can able to add note
#Given User should be Cancel product page
#And User should able to see add note button in cancel orders
#When User click on add note option
#And User is able to add text box
#When User click on Svae option
#Then message will be displayed in that cancel orders


