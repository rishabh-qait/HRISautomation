package com.qait.hrisautomation.Hris;
//import org.openqa.selenium.BY;
import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;

public class HrisLogin {
	
	
	WebDriver driver;
	WebElement username_field;
	WebElement password_field;
	
	
	HrisLogin(WebDriver driver){
		this.driver=driver;
		
	}
	public WebElement get_username_field() {
		return driver.findElement(By.id("txtUserName"));
		}
	public WebElement get_password_field() 
	{
return driver.findElement(By.id("txtPassword"));		
	}
	public WebElement get_signin_button()
	{
		return driver.findElement(By.cssSelector("input[type =submit]"));
		
	}	
	public void set_username(String usrname) 
	{
	username_field=get_username_field();
	username_field.sendKeys(usrname);
		
	}
	public void set_password(String pass) 
	{
		password_field=get_password_field();
		password_field.sendKeys(pass);
	}
	

}
