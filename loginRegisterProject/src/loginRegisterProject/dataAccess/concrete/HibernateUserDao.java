package loginRegisterProject.dataAccess.concrete;

import loginRegisterProject.dataAccess.abstracts.UserDao;
import loginRegisterProject.entities.concrete.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void signUp(User user) {
		System.out.println(user.getName()+", kay�t ba�ar�l�!");
		
	}

	@Override
	public void signIn(User user) {
		System.out.println(user.getName()+", giri� ba�ar�l�!");
		
	}

}
