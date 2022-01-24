package com.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class login {

	@BeforeSuite
	public void InitialSetup()
	{
		System.out.println("inside InitialSetup");
	}

	@BeforeTest
	public void WebPrerequisite()
	{
		System.out.println("inside WebPrerequisite");
	}
	
	@BeforeTest
	public void MobilePrerequisite()
	{
		System.out.println("inside MobilePrerequisite");		
	}
	
	@BeforeTest
	public void APIPrerequisite()
	{
		System.out.println("inside APIPrerequisite");		
	}
	
	@Parameters({"WebURL"})
	@Test(groups= {"Smoke"})
	public void WebLogin(String URLName)
	{
		System.out.println("inside WebLogin");
		System.out.println(URLName);
	}
	
	@Parameters({"MobileURL"})	
	@Test
	public void MobileLogin(String URLName)
	{
		System.out.println("inside MobileLogin");	
		System.out.println(URLName);	
	}

	@Parameters({"APIURL"})	
	@Test
	public void APILogin(String URLName)
	{
		System.out.println("inside APILogin");		
		System.out.println(URLName);
	}
	
	@AfterTest
	public void Cleanup()
	{
		System.out.println("inside Cleanup - login");		
	}

	@AfterSuite
	public void CloseDriver()
	{
		System.out.println("inside CloseDriver");
	}

}
