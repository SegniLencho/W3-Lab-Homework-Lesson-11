import java.util.Arrays;

public class Course {

	String c_name;
	String[] faculty;

	public Course(String cname, String facult[]) {
		this.c_name = cname;
		this.faculty = facult;

	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String[] getFaculty() {
		return faculty;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Course [Course Name=" + c_name + ", faculty=" + Arrays.toString(faculty) + "]";
	}

}
