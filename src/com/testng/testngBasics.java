package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testngBasics {

	@Test(groups= {"Smoke"},timeOut=4000)
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertEquals(false, true);
	}
	
	@Test(enabled=false)
	public void Bye()
	{
		System.out.println("Bye");
	}
}
