package ocjp.inhtopic.backupbhavya;

import java.util.Scanner;

//           ChildClasss      ParentClass
public class Employee extends Person
{
	int id;
	int salary;
	String dsgn;
	String orgName;
	
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter dsgn : ");
		dsgn = sc.nextLine();
		System.out.println("Enter orgName : ");
		orgName = sc.nextLine();
	}
	public void disp() 
	{
		System.out.println(id + " " + name + " "+ salary + " " +dsgn + " " + orgName);
	}
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.scan();
		e.disp();
	}
}
