package inheritanceHomework;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getId()+" numaralý öðrenci eklendi");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			System.out.println(user.getId()+" numaralý öðrenci eklendi");
		}
	}
}
