
public class Teacher extends Person
{
	private String subject;
	private String title;
	
	public Teacher(String name1, String name2, int age, boolean gender, String subject, String title)
	{
		super(name1, name2, age, gender);
		this.subject = subject;
		this.title = title;
	}
	
	public String getSubject()
	{
		return this.subject;
	}
	
	public String toString()
	{
		return this.title + ". " + this.getName2();
	}
}
