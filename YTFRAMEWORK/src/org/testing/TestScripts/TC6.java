  package org.testing.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testing.assertions.userAssert;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.pages.VideoPlay;
import org.testing.utilities.LogsCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.base;


public class TC6 extends base {

	@Test
	public void testcase6()  throws InterruptedException
	{
		
		LogsCapture lc= new LogsCapture();
		Login l = new Login(driver,pr);
		l.signin("demo93910@gmail.com", "demo@1234");
		
		Thread.sleep(6000);
		VideoPlay vp= new VideoPlay(driver, pr);
		vp.play_video();
		
		Thread.sleep(2000);
		
        userAssert ua = new userAssert();
		
		String current_url=driver.getCurrentUrl();
		
		ua.checkurl(current_url, "www.youtube.com");
		
		
	/*===================== TEST CASE==============================*/
		 System.out.println("TEST CASE 6 Started");	
		Actions ac= new Actions(driver);
		
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(5000);
		
		//comment on  the youtube video 
		
		WebElement comment_box=driver.findElement(By.xpath(pr.getProperty("comment_box_button")));
		
		Thread.sleep(2000);
		
		comment_box.click();
		
		Thread.sleep(2000);
		
		WebElement comment_box_text=driver.findElement(By.xpath(pr.getProperty("comment_box_text_button")));
		comment_box_text.clear();

		Thread.sleep(2000);
		
		comment_box_text.sendKeys("Demo Comment");
		
		Thread.sleep(2000);
		
		//submit the comment 
	
		WebElement submit_comment=driver.findElement(By.xpath(pr.getProperty("submit_comment_button")));
		submit_comment.click();
		
		Thread.sleep(4000);
		
		ac.sendKeys(Keys.PAGE_UP).build().perform();
	
		Thread.sleep(9000);
		
   /*============================TEST CASE END============================*/
		
		lc.takeLogs("Test Case passed for TC6", "TC6");
		Thread.sleep(2000);
		
	     Logout m = new Logout(driver,pr);
	     m.logout();
		
		
		System.out.println("comment on the video");
	}
	
}
