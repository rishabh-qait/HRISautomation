package com.qait.hrisautomation.Hris;
//import org.openqa.selenium.BY;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HrisAutomationTest {
	
	
	WebDriver driver;
	HrisLogin login;
	
	
	HrisAutomationTest(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rishabh.jain\\"
				+ "eclipse-workspace\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://hris.qainfotech.com/login.php");
	
	
	
	}
	@BeforeClass
	public void createclassobjects() 
	{
		login = new HrisLogin(driver);
	}
	@Test
	public void test2_attempt_login_with_correct_credentials() 
	{
		login.get_username_field();
		login.set_username("rishabh.jain");
		login.get_password_field();
		login.set_password("Rishabh@123");
		login.get_signin_button().submit();
       String actuallink= driver.getCurrentUrl();
	String expectedlink ="https://hris.qainfotech.com:8086/time/timesheet";  
     // WebElement timesheet= driver.findElement(By.cssSelector("span[class='ng-binding']")) ;
       //String text= timesheet.getText();
       
       Assert.assertEquals(actuallink,expectedlink);
	}
/*	@DataProvider(name = "dataforincorrectcredentials")
	
		public void gobacktohomepage() 
		{
		driver.get("https://hris.qainfotech.com/login.php");
		
			
		}*/
		
	@Test //(dataProvider="dataforincorrectcredentials")
	public void test1_attempt_login_with_incorrect_credentials() 
	{
		//driver.get("https://hris.qainfotech.com/login.php");
		login.get_username_field();
		login.set_username("incorrectusername");
		login.get_password_field();
		login.set_password("incorrectpassword");
		login.get_signin_button().submit();
		
		WebElement invalidelement=driver.findElement(By.cssSelector("div[class='loginTxt txtHideDiv alert alert-error']"));
		String text = invalidelement.getText();
		
		 //String actuallink= driver.getCurrentUrl();
		 //String expectedlink ="https://hris.qainfotech.com/login.php";
		Assert.assertEquals("Invalid Login",text);
		
	}
	
	
	

}
