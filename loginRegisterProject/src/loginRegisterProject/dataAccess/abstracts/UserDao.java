package loginRegisterProject.dataAccess.abstracts;

import loginRegisterProject.entities.concrete.User;

public interface UserDao {
	void signUp(User user);
	void signIn(User user);
}
