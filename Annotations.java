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
	
	@BeforeSuite
	
	public void setup() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest	
	
	public void launcher() {
		System.out.println("@BeforeTest");
	}
	
	
	@BeforeClass
	public void login()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void enterURl() {
		System.out.println("@BeforeMethod");	
	}
	

	@Test
	public void googleTitle()
	{
		System.out.println("@Test1");
	}
	
	@Test
	public void seactchTest() {
		System.out.println("@Test2");
	}
	
	@Test
	public void googleLogo()
	{
		System.out.println("@Test3");
	}

	
	@AfterMethod
	public void logOut()
	{
		System.out.println("@AfterMethod");
	}
	

	@AfterClass
	public void close()
	{
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void delete()
	{
		System.out.println("@AfterTest");
	}
	
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("@AfterSuite");
	}
	
}
