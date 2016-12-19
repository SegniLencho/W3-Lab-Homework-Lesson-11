import java.util.Date;

public class Registration implements Comparable {
	private String name;
	int regno;
	String coursename;
	String sid;

	public Registration(String name, String id, String coursename, int regno) {
		this.name = name;
		this.sid = id;
		this.coursename = coursename;
		this.regno = regno;

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRegno() {
		return regno;
	}


	public void setRegno(int regno) {
		this.regno = regno;
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}


	public String getSid() {
		return sid;
	}


	public void setSid(String sid) {
		this.sid = sid;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}


//	@Override
//	public int compareTo(Object obj) {
//		Registration student = (Registration) obj;
//
//		if (getRegistrationDate().before(student.getRegistrationDate())) {
//			return 1;
//		} else if (getRegistrationDate().after(student.getRegistrationDate())) {
//			return -1;
//		}
//		return 0;
//	}
}