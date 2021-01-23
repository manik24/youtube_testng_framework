package org.testing.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.assertions.userAssert;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.pages.VideoPlay;
import org.testing.utilities.LogsCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.base;


public class TC8 extends base {
	
	@Test
	public void testcase8()  throws InterruptedException
	{

		LogsCapture lc= new LogsCapture();
		Login l = new Login(driver,pr);
		l.signin("demo93910@gmail.com", "demo@1234");
		
		Thread.sleep(2000);
		
        userAssert ua = new userAssert();
		
		String current_url=driver.getCurrentUrl();
		
		ua.checkurl(current_url, "www.youtube.com");
			
		/*===================== TEST CASE==============================*/
		
		Thread.sleep(5000);
		//click on library  in the menu 
		
		Thread.sleep(4000);
		
		WebElement library=driver.findElement(By.xpath(pr.getProperty("library_button")));
		library.click();
		
		/*============================TEST CASE END============================*/
		
		lc.takeLogs("Test Case passed for TC8", "TC8");
		Thread.sleep(2000);
		
	     Logout m = new Logout(driver,pr);
	     m.logout();
		
	
		System.out.println("clicked on library");
	}

}
