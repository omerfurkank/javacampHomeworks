package inheritanceHomework;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getId()+" numaral� ��renci eklendi");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			System.out.println(user.getId()+" numaral� ��renci eklendi");
		}
	}
}
