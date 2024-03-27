package com.keyword;

import org.openqa.selenium.By;

public interface Locators {
	String APPURL = "https://parabank.parasoft.com/parabank/index.htm";
	String LOGIN = "#loginPanel > p:nth-child(3) > a";
	String NAME = "input[id='customer.firstName']";
	String LASTNAME = "input[id='customer.lastName']";
	String ADDRESS = "#customer\\.address\\.street";
	String CITY = "input[id='customer.address.city']";
    String STATE = "input[id='customer.address.state']";
    //String ZIPCODE = "input[id='customer.address.zipCode']";
    String PHONENUMBER = "input[id='customer.phoneNumber']";
    String SSNNO = "input[id='customer.ssn']";
    String USERNAME = "input[id='customer.username']";
    String PASSWORD = "[id='customer.password']";
    String CONFIRMPASS = "input[id='repeatedPassword']";
    String SUBMIT = "td>input[type='submit']";
    String MSG = "[id='customer.address.zipCode.errors']";
  

}
