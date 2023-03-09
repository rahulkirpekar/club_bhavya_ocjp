package ocjp.statictopic;

import java.util.Scanner;

public class Student 
{
	private int rno;
	private String name;
	private int std;
	private static String sname;
	static Scanner sc = new Scanner(System.in);
//	public static void setSchoolName() 
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter SchoolName : ");
//		sname = sc.nextLine();
//	}
	public void scan() 
	{
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " "+name + " "+ std+ " "+ sname);
	}
	public static void main(String[] args) 
	{
//		Student.setSchoolName();
		System.out.println("Enter SchoolName : ");
		Student.sname = sc.nextLine();//DPS

		Student s[] = new Student[5];
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scan();
		}
		System.out.println("Enter SchoolName : ");
		Student.sname = sc.nextLine();// ABC
		for (int i = 0; i < s.length; i++) 
		{
			s[i].disp();
		}
	}
}