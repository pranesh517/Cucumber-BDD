package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPage {
	WebDriver driver;
	
	@Given("^User is having valid URL$")
	public void luanchBrowser(){
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/SignIn.html");
	}
	
	@When("^User enters Email ID$")
	public void enterEmailID(){
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys("ABC@test.com");
	}
	
	@When("^User enters Password$")
	public void enterPassword(){
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("test");
	}
	
	@When("^User clicks on Login button$")
	public void clickOnLoginButton(){
		driver.findElement(By.id("enterbtn")).click();
	}
	
	@Then("^Login is Successful$")
	public void verifyLogin(){
		String errorMessage = driver.findElement(By.id("errormsg")).getText();
		Assert.assertEquals("Invalid User Name or PassWord", errorMessage.trim());
	}
	
	@When("^User enters multiple userid '(.*?)'$")
	public void enterMultiUserId(String userid){
		driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(userid);
	}
	
	@When("^User enters multiple password '(.*?)'$")
	public void enterMultiPassword(String password){
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	}

}
