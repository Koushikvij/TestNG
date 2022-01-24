package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	@DataProvider
	public Object[][] getCredentials()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		data[1][0]="secondusername";
		data[1][1]="secondtpassword";
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
	}
	
	@Test(dataProvider="getCredentials")
	public void test(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
}
