package ocjp.executionflow;

public class TestApp1 
{
	static 
	{
		System.out.println("1) Static Block");
	}
	public static void testStatic() 
	{
		System.out.println("3) static method test()");
	}
	{
		System.out.println("4) Instance Block");
	}
	public TestApp1() 
	{
		System.out.println("5) Default Constructor");
	}
	public TestApp1(int no) 
	{
		System.out.println("5) Para Constructor" + no);
	}
	public void testNonStatic() 
	{
		System.out.println("6) NonStatic method testNonStatic()");
	}

	public static void main(String[] args) 
	{
		System.out.println("2) START :: Main method");

		TestApp1.testStatic();
		
		TestApp1 app1 = new TestApp1();
		TestApp1 app2 = new TestApp1();
		TestApp1 app3 = new TestApp1();
		
		app1.testNonStatic();
		
		System.out.println("2) EXIT :: Main method");
	}
}
