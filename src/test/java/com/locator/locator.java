package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class locator extends Base {

		public static WebElement getUsername() {
			return driver.findElement(By.id("username"));		
		}	
		public static WebElement getPassword() {
			return driver.findElement(By.id("password"));		
		}
		public static  WebElement getlogin() {
			return driver.findElement(By.id("login"));
		}
			public static WebElement getlocation() {
				return driver.findElement(By.id("location"));
			}
			public static WebElement gethotels () {
				return driver.findElement(By.id("hotels"));
			}
			public static WebElement getroomType() {
				return driver.findElement(By.id("room_type"));
			}
			public static WebElement getnoOfRooms() {
				return driver.findElement(By.id("room_nos"));
			}
			public static WebElement getcheckInDate() {
				return driver.findElement(By.id("datepick_in"));
			}
			public static WebElement getcheckOutDate() {
				return driver.findElement(By.id("datepick_out"));
			}
			public static WebElement getadultRooms() {
				return driver.findElement(By.id("adult_room"));
			}
			public static WebElement getchildRooms() {
				return driver.findElement(By.id("child_room"));
			}
			public static WebElement getsearch() {
				return driver.findElement(By.id("Submit"));
			}	
			public static WebElement radioButton() {
				return driver.findElement(By.id("radiobutton_0"));	
			}
			public static WebElement getcontinue() {
				return driver.findElement(By.id("continue"));	
			}
			public static WebElement getfirstName() {
				return driver.findElement(By.id("first_name"));
				
			}
			public static WebElement getlastName() {
				return driver.findElement(By.id("last_name"));
				
			}
			public static WebElement getaddress() {
				return driver.findElement(By.id("address"));
				
			}
			public static WebElement getcreditCardNo() {
				return driver.findElement(By.id("cc_num"));
				
			}
			public static WebElement getcreditCardType() {
				return driver.findElement(By.id("cc_type"));
				
			}
			public static WebElement getexpiryMonth() {
				return driver.findElement(By.id("cc_exp_month"));
				
			}
			public static WebElement getexpiryYear() {
				return driver.findElement(By.id("cc_exp_year"));
				
			}
			public static WebElement getccv() {
				return driver.findElement(By.id("cc_cvv"));
				
			}

			public static WebElement getBookNow() {
				return driver.findElement(By.id("book_now"));
				
			}
			public static WebElement orderNo() {
				return driver.findElement(By.id("order_no"));
				
			}
		}
	

