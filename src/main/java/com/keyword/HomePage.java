package com.keyword;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(css ="#loginPanel > p:nth-child(3) > a" )
    public WebElement Register;
	
	
	
	public void clickRegister() {
		Register.click();

	}
}
