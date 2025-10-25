package com.app.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Base;

public class BobcatLoc extends Base {
	public static WebElement getAlert() {
		return driver.findElement(By.xpath("//button[contains(text(),'Accept All Cookies')]"));		
	}
	public static WebElement getEquipment() {
		return driver.findElement(By.xpath("(//div[contains(text(),'Equipment')])[4]"));		
	}
	public static WebElement getloader() {
		return driver.findElement(By.xpath("//ul[@aria-label='Loaders']"));		
	}
	public static WebElement getmini() {
		return driver.findElement(By.xpath("//ul[@aria-label='Mini Excavators']"));		
	}
	public static WebElement getfork() {
		return driver.findElement(By.xpath("//ul[@aria-label='Forklifts']"));		
	}
	public static WebElement getportable() {
		return driver.findElement(By.xpath("//ul[@aria-label='Portable Power']"));		
	}
	
}
