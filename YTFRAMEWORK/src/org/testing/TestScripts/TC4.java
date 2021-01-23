package org.testing.TestScripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testing.assertions.userAssert;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.pages.VideoPlay;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshot;
import org.testng.annotations.Test;

import Base.base;


public class TC4 extends base {
	
	

	
	@Test
	public void testcase4()  throws InterruptedException, IOException
	{
		
		LogsCapture lc= new LogsCapture();
		Login l = new Login(driver,pr);
		l.signin("demo93910@gmail.com", "demo@1234");
		
		Thread.sleep(4000);
		VideoPlay vp= new VideoPlay(driver, pr);
		vp.play_video();
		
		Thread.sleep(2000);
		
        userAssert ua = new userAssert();
		
		String current_url=driver.getCurrentUrl();
		
		ua.checkurl(current_url, "www.youtube.com");
		
	/*===================== TEST CASE==============================*/
		 System.out.println("TEST CASE 4 Started");
		Thread.sleep(5000);
		
		WebElement video_like=driver.findElement(By.xpath(pr.getProperty("video_like_button")));
		video_like.click();
		
		Screenshot s=new Screenshot();
		s.takescreenshot(driver, "E://SELENIUM SCREESHOT/4.png");
		
/*============================TEST CASE END============================*/
		
		lc.takeLogs("Test Case passed for TC4", "TC4");
		Thread.sleep(2000);
		
	     Logout m = new Logout(driver,pr);
	     m.logout();

	
		System.out.println("video played and like");
	}
	

	
}
