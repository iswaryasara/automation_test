package com.app.stepdefinition;

import com.base.Base;
import com.locator.locator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps extends locator {
@Given("Load the browser {string}")
public void load_the_browser(String string) {
 Base.launchBrowser(string);   
}

@Given("Load the URL {string}")
public void load_the_url(String string) {
    Base.loadURL(string);
}

@When("Enter the userName {string}")
public void enter_the_username(String string) {
    Base.Input(getUsername(), string);
}
@When("Enter the password {string}")
public void enter_the_password(String string) {
    Base.Input(getPassword(), string);
}
@When("Click the login button")
public void click_the_login_button() {
    Base.clickElement(getlogin());
}
@When("Enter the location {string}")
public void enter_the_location(String string) {
   Base.dropVisibleText(getlocation(), string);
}

@When("Enter the hotel {string}")
public void enter_the_hotel(String string) {
	Base.dropVisibleText(gethotels(), string);
}

@When("Enter the RoomType {string}")
public void enter_the_room_type(String string) {
    Base.dropVisibleText(getroomType(), string);
}

@When("Enter the no of rooms {string}")
public void enter_the_no_of_rooms(String string) {
    Base.dropVisibleText(getnoOfRooms(), string);
}

@When("Enter the checkInDate {string}")
public void enter_the_check_in_date(String string) {
	Base.Input(getcheckInDate(), string);

}

@When("Enter the checkoutDate {string}")
public void enter_the_checkout_date(String string) {
   Base.Input(getcheckOutDate(), string);
}

@When("Enter the Adult {string}")
public void enter_the_adult(String string) {
    Base.dropVisibleText(getadultRooms(), string);
}

@When("Enter the Child {string}")
public void enter_the_child(String string) {
   Base.dropVisibleText(getchildRooms(), string);
}

@When("Click the Search button")
public void click_the_search_button() {
   Base.clickElement(getsearch());
}

@When("hen Select the Radio botton")
public void hen_select_the_radio_botton() {
   Base.clickElement(radioButton());
}

@When("Click the continue button")
public void click_the_continue_button() {
    Base.clickElement(getcontinue());
}

@When("Enter the firstname {string}")
public void enter_the_firstname(String string) {
   Base.Input(getfirstName(), string);
}

@When("Enter the lastname {string}")
public void enter_the_lastname(String string) {
   Base.Input(getlastName(), string);
}

@When("Enter the address {string}")
public void enter_the_address(String string) {
    Base.Input(getaddress(), string);
}

@When("Enter the creditCardNo {string}")
public void enter_the_credit_card_no(String string) {
   Base.Input(getcreditCardNo(), string);
}

@When("Enter the CardType {string}")
public void enter_the_card_type(String string) {
   Base.dropVisibleText(getcreditCardType(), string);
}
@When("Enter the expirymonth {string}")
public void enter_the_expirymonth(String string) {
    Base.dropVisibleText(getexpiryMonth(), string);
}


@When("Enter the ecpiryYear {string}")
public void enter_the_ecpiry_year(String string) {
    Base.dropVisibleText(getexpiryYear(), string);
}

@When("Enter the CcvNo {string}")
public void enter_the_ccv_no(String string) {
Base.Input(getccv(), string);
}
@When("Click the BookNow bottonbutton")
public void click_the_book_now_bottonbutton() {
   Base.clickElement(getBookNow());
}

@When("Get the orderNo")
public void get_the_order_no() {
System.out.println("Get the orderNo");    
}
}



