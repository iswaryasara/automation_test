package com.app.stepdefinition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.base.Base;
import com.locator.locator;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class testone extends locator  {

	
	@When("Enter the form input value")
	public void enter_the_form_input_value(DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap();   
	   Base.loadUrl(asMap.get("URL"));
	   Base.inputText(getUsername(),asMap.get("username") );
	   Base.inputText(getPassword(), asMap.get("password"));
	}




}