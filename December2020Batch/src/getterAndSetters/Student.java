package getterAndSetters;

public class Student 
{
	private int sno=1;
	private String sname="lella";
	
	public int getSno() {
		return sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public static void main(String[] args) 
	{
		Student s = new Student();
		System.out.println(s.sno);
		System.out.println(s.sname);
	}

}
