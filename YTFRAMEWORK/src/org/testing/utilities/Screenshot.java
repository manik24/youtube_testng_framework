package org.testing.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;


public class Screenshot {
	public  void takescreenshot(ChromeDriver driver,String path) throws IOException
	{
		File f = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(path));
		
	}

}
