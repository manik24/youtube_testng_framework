package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//


public class Login {
	
	
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	public void signin(String User_name,String pass_word) throws InterruptedException
	{
	    

		Thread.sleep(8000);
		
		WebElement sign_in=driver.findElement(By.xpath(pr.getProperty("sign_in_button")));
		sign_in.click();
		
		Thread.sleep(5000);
		
		WebElement acc_button=driver.findElement(By.xpath(pr.getProperty("acc_login_button")));
		acc_button.click();
		acc_button.sendKeys(User_name);
		
		Thread.sleep(6000);
		
		WebElement acc_next_button=driver.findElement(By.xpath(pr.getProperty("acc_login_next_button")));
		acc_next_button.click();
		
		Thread.sleep(6000);
		
		WebElement password=driver.findElement(By.xpath(pr.getProperty("password_field")));
		password.sendKeys(pass_word);
		
		Thread.sleep(6000);
		
		WebElement pass_next_button=driver.findElement(By.xpath(pr.getProperty("password_next_button")));
		pass_next_button.click();
	}

}
