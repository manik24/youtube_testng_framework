package org.testing.assertions;

public class userAssert {

	public void checkurl(String actual,String expected)
	{
		if (actual.equals(expected))
		{
			System.out.println("User Assertion Passed");
		}
		    System.out.println("User Assertion Failed");
	}
}
