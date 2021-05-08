package loginRegisterProject.business.concrete;

import loginRegisterProject.business.abstracts.UserService;
import loginRegisterProject.dataAccess.abstracts.UserDao;
import loginRegisterProject.entities.concrete.User;

public class UserManager implements UserService {
UserDao userdao;
	public UserManager(UserDao userdao) {
	super();
	this.userdao = userdao;
}

	@Override
	public void signUp(User user) {
		
		if (!checkPasswordLength(user)) {
			System.out.println("parola en az 6 karakter olmalı!");
			return;
		}
		if (!checkNameSurnameLength(user)) {
			System.out.println("ad ve soyad en az 2 karakter olmalı");
			return;
		}
		
	}

	@Override
	public void signIn(User user) {
		// TODO Auto-generated method stub
		
	}
	public boolean checkPasswordLength(User user) {
		if (user.getPassword().length()>5) {
			return true;
		}
		return false;
	}
	public boolean checkNameSurnameLength(User user) {
		if (user.getName().length()>1&& user.getSurname().length()>1) {
			return true;
		}
		return false;
	}

}
