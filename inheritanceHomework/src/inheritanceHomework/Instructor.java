package inheritanceHomework;

public class Instructor extends User {
private String course;

public Instructor(int id,String firstname,String lastname,String password,String course) {
	super(id, firstname, lastname, password);
	
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}
}
