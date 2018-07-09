package com.qait.hrisautomation.Hris;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HrisPageAfterLogin {
	WebDriver driver;
	 WebElement timesheettable;
	 WebElement singletaboftimesheettable;
	
	public HrisPageAfterLogin(WebDriver driver) 
	{
		this.driver=driver;
		
	}
	
	public void accessing_Timesheet() throws InterruptedException 
	{
		 timesheettable = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/time-sheet/div/div[2]/div/div/time-sheet-panel/table"));
		String sRow="1";
		String sCol="4";
		Thread.sleep(4000);
		singletaboftimesheettable=timesheettable.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/time-sheet/div/div[2]/div/div/time-sheet-panel/table/tbody/tr[1]/td[4]"));
		Thread.sleep(4000);
		WebElement employeetimesheet=  singletaboftimesheettable.findElement(By.xpath("//*[@id=\"tdId_51_28\"]/employee-timesheet"));
		
		WebElement jun2018tab=employeetimesheet.findElement(By.xpath("//*[@id=\"dv_2018-06-28\"]"));
		
		
		 String date = jun2018tab.findElement(By.xpath("//*[@id=\"dv_2018-06-28\"]/div/div[1]/span")).getText();
		 System.out.println("The date is -> "+date);
		 String totaltime= jun2018tab.findElement(By.xpath("//*[@id=\"dv_2018-06-28\"]/div/div[1]/div/div[2]/p[1]/span")).getText();
		 System.out.println("The time on "+date+" is -> "+totaltime);
		 
		 
		 
	}
	
	

}
