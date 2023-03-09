package ocjp;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setRno(1);
		s.setName("rahul");
		s.setStd(12);

		System.out.println("Rno - " + s.getRno());
		System.out.println("Name - " + s.getName());
		System.out.println("Std - " + s.getStd());
		
	}
}
