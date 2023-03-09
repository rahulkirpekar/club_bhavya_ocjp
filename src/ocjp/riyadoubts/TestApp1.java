package ocjp.riyadoubts;

import java.util.Scanner;

class Employee 
{
//	some data members 
//	instance variables---Per Object Instance Variable Memory allocation
	private int id;
	private String name;
	private int salary;
	private String dsgn;
	
//	static
	private static String orgName;//---Per Class static Variable Memory allocation

	public static void setOrgName() 	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter OrgName : ");
		orgName = sc.nextLine();
	}
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
		System.out.println("Enter Dsgn : ");
		dsgn = sc.nextLine();
	}
	public void disp() 
	{
		System.out.println(id + " " +name + " " +salary + " " +dsgn + " " +orgName);
	}
}
public class TestApp1 
{
	public static void main(String[] args) 
	{
		Employee.setOrgName();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();
		
		e1.scan();
		e2.scan();
		e3.scan();
		e4.scan();
		e5.scan();
		
		e1.disp();
		e2.disp();
		e3.disp();
		e4.disp();
		e5.disp();
	}
