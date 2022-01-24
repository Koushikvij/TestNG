package com.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class home extends login{

	@Test(groups= {"Smoke"}, dependsOnMethods= {"WebLogin"})
	public void WebHome()
	{
		System.out.println("inside WebHome");
	}
	
	@Test(dependsOnMethods= {"MobileLogin"})
	public void MobileHome()
	{
		System.out.println("inside MobileHome");		
	}
	
	@Test(dependsOnMethods= {"APILogin"})
	public void APIHome()
	{
		System.out.println("inside APIHome");		
	}
	
	@AfterTest
	public void Cleanup()
	{
		System.out.println("inside Cleanup - home");		
	}
}