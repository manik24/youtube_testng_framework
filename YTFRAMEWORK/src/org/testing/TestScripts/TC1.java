package org.testing.TestScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.assertions.userAssert;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

import Base.base; 

public class TC1 extends base 
{
	
	
	@Test
	public  void testcase1()  throws InterruptedException, IOException
	{
		
		LogsCapture lc= new LogsCapture();
		Login l = new Login(driver,pr);
		l.signin("demo93910@gmail.com", "demo@1234");
		
		userAssert ua = new userAssert();
		
		String current_url=driver.getCurrentUrl();
		
		ua.checkurl(current_url, "www.youtube.com");
		
		Thread.sleep(3000);
		//click on trending in the menu 
	    System.out.println("TEST CASE 1 Started");
		WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending_button")));
		Thread.sleep(3000);
		trending.click();
		System.out.println("clicked on trending");
		
		
		Screenshot s=new Screenshot();
		s.takescreenshot(driver, "E://SELENIUM SCREESHOT/1.png");
 
		lc.takeLogs("Test Case passed for TC1", "TC1");
		Thread.sleep(2000);
		
		Thread.sleep(3000);
	     Logout m = new Logout(driver,pr);
	     m.logout();
	
	}
	
}
