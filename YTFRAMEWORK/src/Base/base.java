package Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {

  public    ChromeDriver driver;
  public    Properties pr;
  
	@BeforeMethod
	public void launch_base() throws IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "../YTFRAMEWORK/chromedriver.exe");
		driver = new ChromeDriver();
		String weburl="https://www.youtube.com/";
		driver.get(weburl);
		driver.manage().window().maximize();
		System.out.println("browser launched");
		
		// Loading the properties file from the location mentioned
		
		File f = new File("../YTFRAMEWORK/object.properties");
		FileReader fr= new FileReader(f);
	    pr = new Properties();
		pr.load(fr);
		
	}

	
	@AfterMethod
	public void close_base() throws InterruptedException
	{
		Thread.sleep(9000);
		driver.close();
		System.out.println("Test Case completed");
		System.out.println(" ");
		System.out.println("====================================================================");
	}
	
}
