
public class Student extends Person
{
	private double gpa;
	private boolean deans;		//On deans list or no
	private int grade;			//Grade level
	
	public Student(String name1, String name2, int age, boolean gender,
			       double gpa, boolean deans, int grade)
	{
		super(name1, name2, age, gender);
		this.gpa = gpa;
		this.deans = deans;
		this.grade = grade;
	}
	
	public double getGPA()
	{
		return this.gpa;
	}
	
	public String toString()
	{
		return this.getName1() + " " + this.getName2();
	}
}
