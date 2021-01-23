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


public class TC7 extends base
{
	
	@Test
	public void testcase6()  throws InterruptedException
	{

		LogsCapture lc= new LogsCapture();
		Login l = new Login(driver,pr);
		l.signin("demo93910@gmail.com", "demo@1234");
		
		VideoPlay vp= new VideoPlay(driver, pr);
		vp.play_video();
		
		Thread.sleep(2000);
		
        userAssert ua = new userAssert();
		
		String current_url=driver.getCurrentUrl();
		
		ua.checkurl(current_url, "www.youtube.com");
			
		/*===================== TEST CASE==============================*/
		
		Thread.sleep(5000);
		
		//add to watch later  on  the youtube video 
		
		WebElement save_playlist_button=driver.findElement(By.xpath(pr.getProperty("save_playlist")));
		save_playlist_button.click();
		
		Thread.sleep(2000);
		
		WebElement watch_later_checkbox=driver.findElement(By.xpath(pr.getProperty("watch_later_checkbox_button")));
		watch_later_checkbox.click();
		
		Thread.sleep(3000);
		
		WebElement close_watch_later=driver.findElement(By.xpath(pr.getProperty("close_watch_later_button")));
		close_watch_later.click();
		
		Thread.sleep(4000);
		/*============================TEST CASE END============================*/
		
		lc.takeLogs("Test Case passed for TC7", "TC7");
		Thread.sleep(2000);
		
	     Logout m = new Logout(driver,pr);
	     m.logout();
		
		System.out.println("video added to watch later");
	}
	

}
