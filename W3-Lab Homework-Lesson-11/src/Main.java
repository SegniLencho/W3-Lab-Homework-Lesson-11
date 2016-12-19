import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Course> hmap = new HashMap<String, Course>();
		String[] Faculty = { "Renuka", "Joe ", "Lermon", "Paul" };
		String[] Faculty2 = { "Rea", "Jo", "Leon", "Pl", "Abe" };

		String courseName[] = { "FPP", "MPP", "DBMS" };
		String key[] = { "CS390", "CS950", "CS892" };

		Course course[] = new Course[3];
		course[0] = new Course(courseName[0], Faculty);
		course[1] = new Course(courseName[1], Faculty2);
		course[2] = new Course(courseName[0], Faculty);

		for (int i = 0; i < course.length; i++) {
			hmap.put(key[i], course[i]);
		}

		// check if given course_id is found
		if (hmap.containsKey("CS390"))
			System.out.println("Key is Found in Hash Map");
		else
			System.out.println("Key is not found in Hash Map");

		// Retrieve Value using Key
		if (hmap.isEmpty())
			System.out.println("Hash map is Empty");
		else {
			Course courses = hmap.get("CS390");

			System.out.println(courses.toString());

		}
		
	
		System.out.println(hmap.toString());

	}

}
