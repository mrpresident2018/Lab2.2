// Wes Avedisian & Saurabh Bansal
import java.util.Random;
public class Runner {
	
	String[] name1s = {"Jeff", "Stacey", "Pichael", "Abdul", "Monica", "George", "Clara", "Willburt"};
	String[] name2s = {"Anderson", "Williams", "Thompson", "Bansal", "Chan", "Riccardo", "Avedisian", "Wallace"};
	
	
	public static void main(String[] args)	
	{
		Teacher teacher = new Teacher("Nathan", "Levin", 35, true, "AP CompSci Java", "Mr.");
		Classroom[] classs = new Classroom[13];
		for (int x = 0; x < classs.length; x++)
		{
			Student[x] = randomStudent();
		}
		
		public Person[] randomStudents()
		{
			Random r = new Random();
			int x = r.nextInt(8);
			int y = r.nextInt(8);
			int a = r.nextInt(3)+14;
			boolean g = (r.nextInt(1)==1);
			double gPa = r.nextDouble()+3;
			
			Student s = Student(name1s[x], name2s[y], ages[a], g, gPa, )
			
		}
	}
}
