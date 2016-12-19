import java.util.Hashtable;

public class TestStudent {

	public static void main(String[] args) {
		// Student student= new Student("2985632","Segni Lencho","Male");
		Hashtable<String, Student> studentHash = new Hashtable<>();
		studentHash.put("985632", new Student("985632", "Segni Lencho", "Male"));
		studentHash.put("985633", new Student("985632", "Zaid", "Female"));

		// display hash Content
		System.out.println(studentHash);

		// check student found by giving key
		if (studentHash.containsKey("985632"))
			System.out.println("Student is found Student is" + studentHash.get("985632"));
		else
			System.out.println("Student is not found");

		// check studen t found by giving value
		Student s1 = new Student("985632", "Segni Lencho", "Male");

		if (studentHash.containsValue(s1))
			
			System.out.println("Student is found Student is" + studentHash.get("985632"));
		else
			System.out.println("student not found");
		
		studentHash.clear();
		System.out.println(studentHash);

	}

}
