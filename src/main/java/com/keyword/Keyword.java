package com.keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Keyword {
	public RemoteWebDriver driver;
	public void openBrowser() {
    driver = new ChromeDriver();
	}
	public void click(String path) {
     driver.findElement(By.cssSelector(path)).click();
	}
	public void sendKeys(String path , String text) {
     driver.findElement(By.cssSelector(path)).sendKeys(text);
	}
	public String getText(String path) {
    return driver.findElement(By.cssSelector(path)).getText();
	}
	public void OpenUrl(String path) {
    driver.get(path);
	}

}
