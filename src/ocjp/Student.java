package ocjp;
// Strong  Encapsulation
public class Student 
{
	// 1) Data Members---private
	private int rno;
	private String name;
	private int std;
	
	// 2) Mf's----public
	public void setRno(int rno) 
	{
		this.rno=rno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setStd(int std) 
	{
		this.std=std;
	}
	
	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
//	public Student() 
//	{
//		System.out.println("Start Default Constructor");
//		rno=1;
//		name="abc";
//		std=12;
//		System.out.println("EXIT Default Constructor");
//	}
//	public Student(int r,String n) 
//	{
//		this();
//		System.out.println("START---Tw- Para Const");
//		rno=r;
//		name=n;
//		System.out.println("EXIT---Tw- Para Const");
//	}
//	public Student(int r,String n,int s) 
//	{
//		this(r,n);
//		System.out.println("START Three Constructor");
//		std=s;
//		System.out.println("EXIT Three Constructor");
//	}
	public void disp() 
	{
		System.out.println(rno + " "+name + " "+ std);
	}
//	public static void main(String[] args) 
//	{
		// rno name std
//		Student s1 = new Student(1, "abc",12);
//		s1.disp();
		
//		int no1,no2;
//		System.out.println(no1 + no2);
		
//	}
}