package getterAndSetters;

public class StudentChild 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		//System.out.println(s.sno);
		//System.out.println(s.sname);
		
		s.setSno(1000);
		s.setSname("sai");
		
		System.out.println(s.getSno());
		System.out.println(s.getSname());

	}

}
