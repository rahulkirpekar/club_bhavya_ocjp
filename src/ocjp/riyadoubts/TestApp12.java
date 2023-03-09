package ocjp.riyadoubts;
public class TestApp12 
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
}