package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay {

	ChromeDriver driver;
	Properties pr;
	
	public VideoPlay(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;

	}
	

	
	public void play_video() throws InterruptedException
	{
	Thread.sleep(4000);
	
	WebElement trending=driver.findElement(By.xpath(pr.getProperty("trending_button")));
	trending.click();
	
	Thread.sleep(9000);
	
	WebElement video_play=driver.findElement(By.xpath(pr.getProperty("video_play_link")));
	video_play.click();
	
	Thread.sleep(3000);
		
	}
}
