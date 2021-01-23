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


public class TC5 extends base {
	
	
	@Test
	public void testcase5()  throws InterruptedException
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
		Thread.sleep(3000);
		
		Actions ac= new Actions(driver);
		
		ac.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(5000);
		
		//subscribe  the youtube video creator
		
		WebElement video_subscribe=driver.findElement(By.xpath(pr.getProperty("video_subscribe_button")));
		video_subscribe.click();
		
		Thread.sleep(4000);
		
		ac.sendKeys(Keys.PAGE_UP).build().perform();
	
	
		Thread.sleep(10000);
	
       /*============================TEST CASE END============================*/
		
		lc.takeLogs("Test Case passed for TC4", "TC4");
		Thread.sleep(2000);
		
	     Logout m = new Logout(driver,pr);
	     m.logout();

		System.out.println("played the video and subscribed the channel");
	}
	

}
