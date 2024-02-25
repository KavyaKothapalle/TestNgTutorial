package myTest1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	@Test(groups="functional")
	public void mobileTest()
	{
		System.out.println("Mobile Testing");
		
	}
	@Test(groups={"functional","Regression"})
	public void mobileReg()
	{
		System.out.println("Mobile Regression");
	}

	@Parameters({"a","b"})
	@Test(groups="sanity")
	public void AddMe(String a,String b)
	{
		System.out.println("a+b= "+a+b);
		int a1= Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		System.out.println("a1+b1 = "+a1+b1);
		System.out.println("a1+b1+a+b"+(a1+b1+a+b));
		System.out.println("a+b+a1+b1"+(a+b+a1+b1));
	}
	@Parameters({"userName","Password"})
	@Test(groups="sanity")
	public void printMe(String userName,String Password)
	{
		System.out.println("UserName "+userName);
		System.out.println("Password "+Password);
	}
}
