package ocjp.polymorphismtopic.cp;

public class TestApp1 
{
	// int addition -- two 
	public void addFun(int no1,int no2) 
	{
		System.out.println("int---Two -- Addition : " + (no1+no2));
	}
	// float addition -- two 
	public void addFun(float no1,float no2) 
	{
		System.out.println("float---Two -- Addition : " + (no1+no2));
	}
	// addition -- three
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("Thre -- Addition : " + (no1+no2+no3));
	}
	public static void main(String[] args) 
	{
		TestApp1 app = new TestApp1();
		// 50 lines---2 values
		app.addFun(10.50f, 20.5f);
		app.addFun(10, 20, 30);
	}
}
