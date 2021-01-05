package org.testing.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TC7 {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "../selenium/chromedriver.exe");
		driver=new ChromeDriver();
		String weburl="https://www.youtube.com/";
		driver.get(weburl);
		driver.manage().window().maximize();
		System.out.println("browser launched");
	}

	
	@Test
	public void testcase6()  throws InterruptedException
	{
		
		Thread.sleep(4000);
		
		WebElement sign_in=driver.findElement(By.xpath("//paper-button[@aria-label='Sign in'][@class='style-scope ytd-button-renderer style-suggestive size-default']"));
		sign_in.click();
		
		Thread.sleep(4000);
		
		WebElement acc_button=driver.findElement(By.xpath("//input[@type='email'][@aria-label='Email or phone']"));
		acc_button.click();
		acc_button.sendKeys("demo93910@gmail.com");
		
		Thread.sleep(4000);
		
		WebElement acc_next_button=driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']"));
		acc_next_button.click();
		
		Thread.sleep(4000);
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password'][@name='password']"));
		password.sendKeys("demo@1234");
		
		Thread.sleep(4000);
		
		WebElement pass_next_button=driver.findElement(By.xpath("//div[@id='passwordNext'][@jsname='Njthtb']"));
		pass_next_button.click();
		
		
		//click on trending in the menu 
		
		Thread.sleep(4000);
		
		WebElement trending=driver.findElement(By.xpath("//a[@title='Trending'][@id='endpoint']"));
		trending.click();
		
		Thread.sleep(9000);
		
		//play the youtube video
		
		WebElement video_play=driver.findElement(By.xpath("//a[@id='video-title'][@title='WEDDING DURING LOCKDOWN || Rachit Rojha']"));
		video_play.click();
		
		Thread.sleep(7000);
		
		
		
		Thread.sleep(5000);
		
		//add to watch later  on  the youtube video 
		
		WebElement save_playlist_button=driver.findElement(By.xpath("//button[@aria-label='Save to playlist'][@id='button']"));
		save_playlist_button.click();
		
		Thread.sleep(2000);
		
		WebElement watch_later_checkbox=driver.findElement(By.xpath("//yt-formatted-string[text()='Watch later'][@title='Watch later']"));
		watch_later_checkbox.click();
		
		Thread.sleep(3000);
		
		WebElement close_watch_later=driver.findElement(By.xpath("//yt-icon[@icon='close']"));
		close_watch_later.click();
		
		Thread.sleep(4000);
		
	
	
	
		Thread.sleep(9000);
	
		WebElement user_menu=driver.findElement(By.xpath("//button[@id='avatar-btn'][@aria-haspopup='true']"));
		user_menu.click();
		
		Thread.sleep(4000);
		
		WebElement logout=driver.findElement(By.xpath("//a[@href='/logout'][@id='endpoint']"));
		logout.click();
	
		System.out.println("video added to watch later");
	}
	
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		Thread.sleep(9000);
		driver.close();
		System.out.println("Test Case 7 completed");
		System.out.println(" ");
		System.out.println("====================================================================");
	}
}
