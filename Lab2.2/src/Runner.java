// Wes Avedisian & Saurabh Bansal
import java.util.Random;
public class Runner {
	
	String[] name1s = {"Jeff", "Stacey", "Pichael", "Abdul", "Monica", "George", "Clara", "Willburt"};
	String[] name2s = {"Anderson", "Williams", "Thompson", "Bansal", "Chan", "Riccardo", "Avedisian", "Wallace"};
	int[] ages = {14, 15, 16, 17};
	double[] grades = {2.7, 2.8, 2.9, 3, 3.1, 3.2, 3.3, 3.4, 3.5, 3.6, 3.7, 3.8, 3.9, 4};
	
	public static void main(String[] args)	
	{
		Teacher teacher = new Teacher("Nathan", "Levin", 35, true, "AP CompSci Java", "Mr.");
		Student[] classs = new Student[12];
		for (int x = 0; x < classs.length; x++)
		{
			Student[x] = randomStudent();
		}
		
		public static Student randomStudent()
		{
			Random r = new Random();
			int x = r.nextInt(8);
			int y = r.nextInt(8);
			int a = r.nextInt(3);
			boolean g = (r.nextInt(1)==1);
			Student s = Student(name1s[x], name2s[y], ages[a], g, )
			
		}
	}
}
