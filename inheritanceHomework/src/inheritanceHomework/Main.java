package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(1, "ömer", "kılıç", "123", "saü");
		StudentManager manager= new StudentManager();
		manager.add(s1);
		

	}

}
