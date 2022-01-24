package com.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class logout extends home{
	
	@Test(groups= {"Smoke"},dependsOnMethods= {"WebHome"})
	public void WebLogout()
	{
		System.out.println("inside WebLogout");
	}
	
	@Test(dependsOnMethods= {"MobileHome"})
	public void MobileLogout()
	{
		System.out.println("inside MobileLogout");		
	}
	
	@Test(dependsOnMethods= {"APIHome"})
	public void APILogout()
	{
		System.out.println("inside APILogout");		
	}
	
	@AfterTest
	public void Cleanup()
	{
		System.out.println("inside Cleanup - logout");		
	}
}
