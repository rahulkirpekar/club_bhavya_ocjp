package ocjp;

public class A 
{
	A()
	{
		System.out.println("Default Constructor");
	}
	A(int no1)
	{
		this();
		System.out.println("1_Para Constructor");
	}
	A(int no1,int no2)
	{
		this(no1);
		System.out.println("2_Para Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("START -- Main Method");
		A obj = new A(10,20);	
		System.out.println("EXIT -- Main Method");
	}
}
