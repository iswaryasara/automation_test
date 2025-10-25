package com.app.stepdefinition;

import com.app.pageexe.BobcatExe;
import com.base.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BobcatStep extends BobcatExe{
	@Given("Load The browser {string}")
	public void load_the_browser(String string) {
		launchBrowser(string);   
	
	}

	@Given("Load The Url {string}")
	public void load_the_url(String string) {
		 Base.loadURL(string);
	}

	@Given("Click The acceptAllCookies")
	public void click_the_accept_all_cookies() {
		Alert();
	}

	@Given("Click The Eqiupment")
	public void click_the_eqiupment() {
		Equipment();
	}

	@Given("GetText In Loaders")
	public void get_text_in_loaders() {
		Loaders();
		
	}

	@Given("GetText In Mini Excavators")
	public void get_text_in_mini_excavators() {
		miniE();
		}

	@Given("GetText In Forklifts")
	public void get_text_in_forklifts() {
		Fork();
	}

	@Given("GetText In Portable Power")
	public void get_text_in_portable_power() {
		portable();
	}
}
