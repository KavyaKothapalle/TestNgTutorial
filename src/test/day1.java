package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {


		// TODO Auto-generated method stub
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
		
	}
	@Test(invocationCount=5,priority=0)
	public void Demo()
	{
		System.out.println("hello");//automation
		Assert.assertTrue(true);
	}
	@AfterSuite
	
	public void afSyite()
	{
		System.out.println("I am the no 1 from last ");
	}
	@Test(priority=1)
	public void SecondTest()
	{
		System.out.println("bye");
	}



}
