package inheritanceHomework;

public class Student extends User {
	
	
	private String school;
	
	public Student(int id,String firstname,String lastname,String password,String school) {
		super(id, firstname, lastname, password);
		this.school=school;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
}

