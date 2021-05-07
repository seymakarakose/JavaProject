package business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.EDevletService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private EDevletService eDevletService;
	private UserDao userDao;
	List<User> users;

	public UserManager(UserDao userDao, EDevletService eDevletService) {
		this.userDao = userDao;
		this.users = userDao.getAll();
		this.eDevletService = eDevletService;
	}

	@Override
	public boolean login(String eMail, String password) {
		for(User item : userDao.getAll()) {
			if(eMail == item.getEmail() && password == item.getPassword()) {
				System.out.println("Say�n : "+item.getFirstName()+" "+"Ba�ar�yla giri� yapt�n�z.");
				return true;
			}
		}
          return false;
	}

	@Override
	public void logOut(User user) {
		System.out.println(" ��k�� yapt�: " + user.getFirstName());

	}

	@Override
	public boolean register(User user) {
		if (user.getFirstName().length() <= 2 && user.getLastName().length() <= 2) {
			System.out.println("�sim ve Soyisim en az 2 karakterden olu�mal�d�r.");
			return false;
		}
		if (Pattern.matches("@gmail.com.+", user.getEmail())) {
			System.out.println("E Mail adresi kullan�l�yor.");
			return false;
		}
		if (user.getPassword().length() <= 6) {
			System.out.println("�ifre en az 6 karakterden olu�mal�d�r. ");
			return false;
		}
		this.userDao.add(user);
		this.eDevletService.confirmationToSystem("Kullan�c� ba�ar�yla eklendi. " + user.getFirstName() + " " + user.getLastName());
		return true;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}
}
