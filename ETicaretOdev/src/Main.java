import business.abstracts.UserService;
import business.concretes.UserManager;
import core.EDevletManagerAdapter;
import dataAccess.concretes.GoogleUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService = new UserManager(new GoogleUserDao(), new EDevletManagerAdapter());
		User user = new User(3, "Þeyma","Karaköse","1234564", "seymabirol35@gmail.com" );
		userService.register(user);

	}

}