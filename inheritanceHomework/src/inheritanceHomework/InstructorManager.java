package inheritanceHomework;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getId()+" numaralý eðitmen eklendi");
	}
	public void addMultiple(User[] users) {
		for (User user : users) {
			System.out.println(user.getId()+" numaralý eðitmen eklendi");
		}
	}
}
