package org.testing.TestScripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.base;


public class TC3 extends base {
	

	
	@Test
	public void testcase3()  throws InterruptedException, IOException
	{
		
		LogsCapture lc= new LogsCapture();
		Login l = new Login(driver,pr);
		l.signin("demo93910@gmail.com", "demo@1234");
		
		 /*============================TEST CASE START============================*/
		//click on subscriptions  in the menu 
		 System.out.println("TEST CASE 3 Started");
		Thread.sleep(9000);
		
		WebElement subscription=driver.findElement(By.xpath(pr.getProperty("subscription_button")));
		subscription.click();
		
		Screenshot s=new Screenshot();
		s.takescreenshot(driver, "E://SELENIUM SCREESHOT/3.png");
		
		//img[@alt='Avatar image'][@id='img']
		
		//button[@id='avatar-btn'][@aria-haspopup='true']
		
 /*============================TEST CASE END============================*/
		
		lc.takeLogs("Test Case passed for TC3", "TC3");
		Thread.sleep(2000);
		
	     Logout m = new Logout(driver,pr);
	     m.logout();
	
		System.out.println("clicked on subscriptions");
	}
	
	
	
}
