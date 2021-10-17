$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Main.feature");
formatter.feature({
  "name": "feature to test ebay test functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate user is bale to login or not",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser should be open",
  "keyword": "Given "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.browser_should_be_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on ebay home page",
  "keyword": "And "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_should_be_on_ebay_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to login page",
  "keyword": "And "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid email address",
  "keyword": "When "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_enters_the_valid_email_address()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the valid password",
  "keyword": "And "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_enters_the_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login must be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.login_must_be_successful()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate that the user is able to navigate to purchase history page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be on ebay homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_should_be_on_ebay_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see my ebay option",
  "keyword": "And "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_is_able_to_see_my_ebay_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on purchase history option",
  "keyword": "When "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_should_click_on_purchase_history_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be navigated to purchase history page",
  "keyword": "Then "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_should_be_navigated_to_purchase_history_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the search option in purchase history orders is enabled.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user should be on purchase history page",
  "keyword": "Given "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_should_be_on_purchase_history_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see search option in orders",
  "keyword": "And "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_is_able_to_see_search_option_in_orders()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the product name in search box",
  "keyword": "When "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_enter_the_product_name_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hits the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.hits_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see the search result",
  "keyword": "Then "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_is_able_to_see_the_search_result()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate user is able to navigate to cancel detail page after clicking",
  "description": "on See cancel details",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should be on order details",
  "keyword": "Given "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_should_be_on_order_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "See cancel details option is visible",
  "keyword": "And "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.see_cancel_details_option_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on See cancel details option",
  "keyword": "When "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_click_on_see_cancel_details_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is redirected to cancel details page",
  "keyword": "Then "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_is_redirected_to_cancel_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate user is able to navigate to the seller other items page after",
  "description": "clicking on View seller\u0027s other option",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Should be on Cancel items",
  "keyword": "Given "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_should_be_on_cancel_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see views seller\u0027s other item option",
  "keyword": "And "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_is_able_to_see_views_seller_s_other_item_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on View seller\u0027s other item option",
  "keyword": "When "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_click_on_view_seller_s_other_item_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is redirected to other item option page",
  "keyword": "Then "
});
formatter.match({
  "location": "Sprint2_ebay.StepDefination.user_is_redirected_to_other_item_option_page()"
});
formatter.result({
  "status": "passed"
});
});