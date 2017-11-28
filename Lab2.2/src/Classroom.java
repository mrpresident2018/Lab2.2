//Wes Avedisian
public class Classroom
{
	private Student[] students;
	private Teacher teacher;
	
	public Classroom(Student[] students, Teacher teacher)
	{
		this.students = students;
		this.teacher = teacher;
	}
	
	public String getSubject()
	{
		return teacher.getSubject();
	}
	
	public double classAverage()
	{
		double avg = 0;
		for(Student student : this.students)
		{
			avg = avg + student.getGPA();
		}
		avg/=(this.students.length);
		return avg;
	}
}
