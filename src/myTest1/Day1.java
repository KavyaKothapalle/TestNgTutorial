package myTest1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@Test
	public void test()
	{
		System.out.println("Hey i am Test1");
	}
	@Parameters({"a","b"})
	@Test
	public void AddMe(String a,String b)
	{
		System.out.println("a+b= "+(a+b));
		int a1= Integer.parseInt(a);
		int b1=Integer.parseInt(b);
		System.out.println("a1+b1 = "+(a1+b1));
		System.out.println("a1+b1+a+b"+(a1+b1+a+b));
		System.out.println("a+b+a1+b1"+(a+b+a1+b1));
	}
	@Parameters({"userName","Password"})
	@Test
	public void printMe(String userName,String Pwd)
	{
		System.out.println("UserName "+userName);
		System.out.println("Password "+Pwd);
	}

}
