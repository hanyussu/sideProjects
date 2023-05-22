import java.util.*;

// build up the basic algorithm 
public class algorithm {
	
	HashMap<String, Integer> data = new HashMap<>();
	HashMap<String, Integer> grades = new HashMap<>();
	
	public algorithm() {
		initializeGrades();
		getUserInput();
	}
	
	public void initializeGrades() {
		grades.put("A", 4); // excellent 
		grades.put("B", 3); // good
		grades.put("C", 2); // satisfactory 
		grades.put("D", 1); // poor
	}
	
	public void getUserInput () {
		System.out.println("Enter the name of the class: ");
		Scanner scanner1 = new Scanner(System.in);  // Reading from System.in
		String s = scanner1.next();
		System.out.println("Enter the crdits of the class: ");
		Scanner scanner2 = new Scanner(System.in);  // Reading from System.in
		int i = scanner2.nextInt();
		data.put(s,i);
		System.out.println(data);
	}
	
}
