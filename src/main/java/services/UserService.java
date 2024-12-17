package services;

import hotelVal.CurrentUser;

import org.springframework.security.core.userdetails.UserDetailsService;

import entity.User;

//Service Pattern for User
public interface UserService extends UserDetailsService {

	public User findUserByEmail(String email);

	public void saveUser(CurrentUser currentUser);

	public int getLoggedUserId();
}
