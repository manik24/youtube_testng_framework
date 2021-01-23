package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {

	public void takeLogs(String message,String classname)
	{
		DOMConfigurator.configure("../YTFRAMEWORK/layout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);
	}
}
