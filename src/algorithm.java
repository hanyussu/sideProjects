import java.util.*;

// build up the basic algorithm 
public class algorithm {
	
	HashMap<String, String> data = new HashMap<>();
	HashMap<String, Integer> grades = new HashMap<>();
	int amountOfClasses = 0;
	double GPA = 0;
	
	public algorithm() {
		// initalize the grades
		grades.put("A", 4); // excellent 
		grades.put("B", 3); // good
		grades.put("C", 2); // satisfactory 
		grades.put("D", 1); // poor
	}
	
	public void getUserInput () {
		System.out.println("How many classes do you take this semester: ");
		Scanner scanner = new Scanner(System.in);
		amountOfClasses = scanner.nextInt();
		for(int i =0; i < amountOfClasses; i++) {
			System.out.println("Enter the name of the class: ");
			Scanner scanner1 = new Scanner(System.in);  // Reading from System.in
			String s1 = scanner1.next();
			System.out.println("Enter the grade of the class: ");
			Scanner scanner2 = new Scanner(System.in);  // Reading from System.in
			String s2 = scanner2.next();
			data.put(s1,s2);
			}
		calculation();
	}
	
	public void calculation() {
		double totalCredites = 0;
		double maxCredities = amountOfClasses * 4;
		for (String dataKey: data.values()) {
			totalCredites += grades.get(dataKey);
		}
		System.out.println(totalCredites);
		System.out.println(maxCredities);
		double temp = (totalCredites/maxCredities);
		GPA =temp * 4;
	}
	
	public double getGPA() {
		System.out.println(GPA);
		return GPA;
	}
	
}
