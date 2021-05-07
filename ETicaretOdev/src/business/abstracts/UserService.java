package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
	
	boolean login(String eMail, String password);
	void logOut(User user);
	boolean register(User user);
	List<User> getAll();

}
