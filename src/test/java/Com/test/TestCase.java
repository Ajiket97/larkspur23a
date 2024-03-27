package Com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.Locator;

import com.keyword.HomePage;
import com.keyword.Keyword;
import com.keyword.Locators;
import com.keyword.PropUtil;

public class TestCase {
	@Test
	public void verifyLastNameRequriedOrNot() {
		String msg = "Last name is required.";

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		driver.findElement(By.cssSelector("input[id='customer.firstName']")).sendKeys("ajit");
		driver.findElement(By.cssSelector("input[id='customer.address.street']")).sendKeys("telhara");
		driver.findElement(By.cssSelector("input[id='customer.address.city']")).sendKeys("telhara");
		driver.findElement(By.cssSelector("input[id='customer.address.state']")).sendKeys("maf");
		driver.findElement(By.cssSelector("input[id='customer.address.zipCode']")).sendKeys("441088");
		driver.findElement(By.cssSelector("input[id='customer.phoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input[id='customer.ssn']")).sendKeys("585479j");
		driver.findElement(By.cssSelector("input[id='customer.username']")).sendKeys("ajit");
		driver.findElement(By.cssSelector("[id='customer.password']")).sendKeys("Ajit@123");
		driver.findElement(By.cssSelector("input[id='repeatedPassword']")).sendKeys("Ajit@123");
		driver.findElement(By.cssSelector("td>input[type='submit']")).click();
		String errormsg = driver.findElement(By.cssSelector("span[id='customer.lastName.errors']")).getText();
		Assert.assertEquals(msg, errormsg);
	}

	@Test
	public void verifyMobileNumberRequriedOrNot() {
	String msg = "Zip Code is required.";
		Keyword keyword = new Keyword();
		keyword.openBrowser();
		keyword.OpenUrl(Locators.APPURL);
		keyword.click(Locators.LOGIN);
		keyword.sendKeys(Locators.NAME, "ajit");
		keyword.sendKeys(Locators.LASTNAME, "sing");
		keyword.sendKeys(Locators.ADDRESS, "telhara");
		keyword.sendKeys(Locators.CITY, "tel");
		keyword.sendKeys(Locators.STATE, "mah");
		//keyword.sendKeys(Locators.ZIPCODE, "44512");
		keyword.sendKeys(Locators.SSNNO, "546");
		keyword.sendKeys(Locators.USERNAME, "test");
		keyword.sendKeys(Locators.PASSWORD, "Test@123");
		keyword.sendKeys(Locators.CONFIRMPASS, "Test@123");
		keyword.click(Locators.SUBMIT);
		String errormsg = keyword.getText(Locators.MSG);
	
		
		Assert.assertEquals(msg, errormsg);
	}
	@Test
	public void verifyStateRequriedOrNot() {
		String msg = "State is required.";
		

		Keyword keyword = new Keyword();
		keyword.openBrowser();
		keyword.OpenUrl(Locators.APPURL);
		PropUtil prop = new PropUtil();
        String dir = System.getProperty("user.dir");
        String filepath = dir+"\\src\\test\\resources\\Locator.Properties";
        keyword.click( prop.getLocatorValue(filepath, "LOGIN"));
        keyword.sendKeys(prop.getLocatorValue(filepath, "NAME"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "LASTNAME"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "ADDRESS"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "CITY"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "ZIPCODE"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "PHONENUMBER"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "SSNNO"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "USERNAME"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "PASSWORD"), "Ajit");
        keyword.sendKeys(prop.getLocatorValue(filepath, "CONFIRMPASS"), "Ajit");
        keyword.click( prop.getLocatorValue(filepath, "SUBMIT"));
       String errormsg =  keyword.getText(prop.getLocatorValue(filepath, "MSG"));
        System.out.println(errormsg);
		Assert.assertEquals(msg, errormsg);

      
	}
	@Test
	public void verifyFirstPom() {
		Keyword keyword = new Keyword();
		keyword.openBrowser();
		keyword.OpenUrl(Locators.APPURL);
		HomePage home  = PageFactory.initElements(keyword.driver, HomePage.class);
		home.clickRegister();

	}
	
}
