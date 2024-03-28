package com.keyword;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(css = "#loginPanel > p:nth-child(3) > a")
	public WebElement Register;
	@FindBy(css = "input[id='customer.firstName']")
	public WebElement name;
	@FindBy(css = " input[id='customer.lastName']")
	public WebElement lastname;

	@FindBy(css = " #customer\\.address\\.street")
	public WebElement address;

	@FindBy(css = "input[id='customer.address.city']")
	public WebElement city;

	@FindBy(css = "input[id='customer.address.state']")
	public WebElement state;

	@FindBy(css = "input[id='customer.address.zipCode']")
	public WebElement zipcode;

	@FindBy(css = " input[id='customer.phoneNumber']")
	public WebElement phonenumber;

	@FindBy(css = "input[id='customer.ssn']")
	public WebElement ssnno;

	@FindBy(css = "input[id='customer.username']")
	public WebElement username;

	@FindBy(css = " [id='customer.password']")
	public WebElement password;

	@FindBy(css = " input[id='repeatedPassword']")
	public WebElement confirmpass;

	@FindBy(css = "td>input[type='submit']")
	public WebElement submit;

	@FindBy(css = "span[id='customer.address.state.errors']")
	public WebElement errormsg;

	public void clickRegister() {
		Register.click();

	}

	public void sendName(String text) {
		name.sendKeys(text);
	}

	public void sendLastname(String string) {
		lastname.sendKeys(string);

	}

	public void sendAddress(String string) {
		address.sendKeys(string);
	}

	public void sendCity(String string) {
		city.sendKeys(string);
	}

	public void sendstate(String string) {
		state.sendKeys(string);
	}

	public void sendZipcode(String string) {
		zipcode.sendKeys(string);
	}

	public void sendPhonenumber(String string) {
		phonenumber.sendKeys(string);
	}

	public void sendSsnno(String string) {
		ssnno.sendKeys(string);
	}

	public void sendUsername(String string) {
		username.sendKeys(string);
	}

	public void sendPassword(String string) {
		password.sendKeys(string);
	}

	public void sendConfirmpass(String string) {
		confirmpass.sendKeys(string);
	}

	public void sendClick() {
		submit.click();
	}

	public String sendErrormsg() {
		return errormsg.getText();
	}
}
