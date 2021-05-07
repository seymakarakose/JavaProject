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
				System.out.println("Sayýn : "+item.getFirstName()+" "+"Baþarýyla giriþ yaptýnýz.");
				return true;
			}
		}
          return false;
	}

	@Override
	public void logOut(User user) {
		System.out.println(" çýkýþ yaptý: " + user.getFirstName());

	}

	@Override
	public boolean register(User user) {
		if (user.getFirstName().length() <= 2 && user.getLastName().length() <= 2) {
			System.out.println("Ýsim ve Soyisim en az 2 karakterden oluþmalýdýr.");
			return false;
		}
		if (Pattern.matches("@gmail.com.+", user.getEmail())) {
			System.out.println("E Mail adresi kullanýlýyor.");
			return false;
		}
		if (user.getPassword().length() <= 6) {
			System.out.println("Þifre en az 6 karakterden oluþmalýdýr. ");
			return false;
		}
		this.userDao.add(user);
		this.eDevletService.confirmationToSystem("Kullanýcý baþarýyla eklendi. " + user.getFirstName() + " " + user.getLastName());
		return true;
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}
}
