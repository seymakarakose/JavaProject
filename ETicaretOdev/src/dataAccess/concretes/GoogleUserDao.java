package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class GoogleUserDao implements UserDao {
	List<User> users;

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý Google hesabý ile eklendi. "+ user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Google hesabý ile güncellendi. "+ user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý Google hesabý ile silindi. "+ user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
