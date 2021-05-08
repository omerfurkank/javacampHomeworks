package loginRegisterProject.business.abstracts;

import loginRegisterProject.entities.concrete.User;

public interface UserService {
void signUp(User user);
void signIn(User user);
}
