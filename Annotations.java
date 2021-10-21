package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	//   sTarting with @Before ----  Pre conditions annotations
	
	@BeforeSuite
	
	public void setup() {
		System.out.println("Set Up system properties");
	}
	
	@BeforeTest // 2	
	
	public void launcher() {
		System.out.println("Launch Chrome Browser");
	}
	
	
	@BeforeClass
	public void login()
	{
		System.out.println("Login on app");
	}
	
	@BeforeMethod
	public void enterURl() {
		System.out.println("Enter URL");	
	}
	

	
	//  Test case @ Test
	@Test
	public void googleTitle()
	{
		System.out.println("Google Title Test");
	}
	
	@Test
	public void seactchTest() {
		System.out.println("Search here");
	}
	
	@Test
	public void googleLogo()
	{
		System.out.println("Google Logo");
	}

	
	
	// @after - --- Post conditions 
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("Logout from Chrome Browser");
	}
	

	@AfterClass
	public void close()
	{
		System.out.println("CLose Chrome Browser");
	}
	
	@AfterTest
	public void delete()
	{
		System.out.println("Dlete all Cookies");
	}
	
	
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Generate Test Report");
	}
	
}
