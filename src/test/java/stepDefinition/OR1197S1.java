package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class OR1197S1 extends Base{
	
	public static WebDriver driver;
	
	
	@Given("^Surgeon navigates to https://dev.ortelligence.com/$")
	
	public void OpenloginPage() throws Exception {
		
		openApp();
	}
	
	@And("^I log into Ortelligence Application$")
	
	public void verifylogin(String userName, String password) {
		
	String pageTitle=driver.getTitle();	
	System.out.println("Login Page Title is :"+pageTitle);
	assertEquals(pageTitle, "ortelligence");
    driver.findElement(By.id("userName")).sendKeys(userName);
	driver.findElement(By.id("userPassword")).sendKeys(password);
	WebElement btnContinue=driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",btnContinue);	
			
	}
	
	
	@And ("^I access the surgery screen$")
	
	public void surgeryScreen() {
		
	String pageTitle=driver.getTitle();
	System.out.println("Home Page Title is :"+pageTitle);
	assertEquals(pageTitle, "ortelligence");
		
		
	}
	
	@When ("^I see a tray for a procedure&")
	
	public void AllTray() {
		
		String pageTitle=driver.getTitle();
		System.out.println("Home Page Title is :"+pageTitle);
		assertEquals(pageTitle, "ortelligence");
			
	
	}	
	
	@Then ("^I should see checkboxes on the items at the bottom of the screen&")
	
	public void ItemsCheckbox() {
		
		String pageTitle=driver.getTitle();
		System.out.println("Home Page Title is :"+pageTitle);
		assertEquals(pageTitle, "ortelligence");
			
	
	}	
	
	
	
	
}