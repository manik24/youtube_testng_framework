package org.testing.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.base;


public class TC2 extends base {
	
	
	
	
	
	@Test
	public void testcase2()  throws InterruptedException
	{


		LogsCapture lc= new LogsCapture();
		Login l = new Login(driver,pr);
		l.signin("demo93910@gmail.com", "demo@1234");
		
		 /*============================TEST CASE START============================*/
		
		Thread.sleep(4000);
		
		WebElement history=driver.findElement(By.xpath(pr.getProperty("history_button")));
		history.click();
		
		//img[@alt='Avatar image'][@id='img']
		
		//button[@id='avatar-btn'][@aria-haspopup='true']
		

		Thread.sleep(9000);
	
 /*============================TEST CASE END============================*/
		
		lc.takeLogs("Test Case passed for TC2", "TC2");
		Thread.sleep(2000);
		
	     Logout m = new Logout(driver,pr);
	     m.logout();
		
		
	
	}
	
	
}
