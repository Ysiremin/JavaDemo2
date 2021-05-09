package homework2;

public class Instructor extends User {
	private String instructorInfo;

	public Instructor(String instructorInfo) {
		super();
		this.instructorInfo = instructorInfo;
	}

	public String getInstructorInfo() {
		return instructorInfo;
	}

	public void setInstructorInfo(String instructorInfo) {
		this.instructorInfo = instructorInfo;
	}
}