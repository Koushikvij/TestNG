package com.testng;

import org.testng.annotations.Test;

public class testngBasics {

	@Test(groups= {"Smoke"},timeOut=4000)
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@Test(enabled=false)
	public void Bye()
	{
		System.out.println("Bye");
	}
}
