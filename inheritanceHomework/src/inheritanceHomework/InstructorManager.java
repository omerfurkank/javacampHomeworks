package inheritanceHomework;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getId()+" numaral� e�itmen eklendi");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			System.out.println(user.getId()+" numaral� e�itmen eklendi");
		}
	}
}
