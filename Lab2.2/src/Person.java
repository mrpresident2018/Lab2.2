
public abstract class Person 
{
	private String name1;     // Name 1 is First Name
	private String name2;	  //Name 2 is Family Name
	private int age;
	private boolean gender;
	
	public Person (String name1, String name2, int age, boolean gender)
	{
		this.name1 = name1;
		this.name2 = name2;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName1()
	{
		return this.name1;
	}
	public String getName2()
	{
		return this.name2;
	}
	
	public abstract String toString(); 
}
