package myTest1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Day2 {
	@Test
	public void apiTest1()
	{
		System.out.println("API Test1");
	}
	@Test
	public void apiTest2()
	{
		System.out.println("API Test2");
	}
	@Test
	public void apiRegression1()
	{
		System.out.println("API Regression 1");
	}
	@Test
	public void apiRegression2()
	{
		System.out.println("API Regression 2");
	}
	@Test(groups="functional")
	public void Login()
	{
		System.out.println("Login");
	}
	@Test(groups="functional")
	public void Logout()
	{
		System.out.println("Logout");
	}
	@Test(groups="Regression")
	public void goodBye()
	{
		System.out.println("****Ending Googbye****");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("I am Before Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("I am After Test");
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I am Before Suite");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("I am Before Class");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("I am after Suite");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("I am after Class");
	}




}
