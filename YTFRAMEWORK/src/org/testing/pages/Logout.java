package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {

	ChromeDriver driver;
	Properties pr;
	
	public Logout(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	
	}
	
	public void logout() throws InterruptedException
	{
	
		
		Thread.sleep(9000);

		WebElement user_menu=driver.findElement(By.xpath(pr.getProperty("logged_in_user_menu")));
		user_menu.click();
		
		Thread.sleep(4000);
		
		WebElement logout=driver.findElement(By.xpath(pr.getProperty("logout_button")));
		logout.click();

		
	}

	
	
}
