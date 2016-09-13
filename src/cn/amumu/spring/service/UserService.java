package cn.amumu.spring.service;

import java.util.List;

import cn.amumu.spring.orm.Student;
import cn.amumu.spring.orm.User;

public interface UserService {
	public User getUser(int userId);
	
	public void saveUser(User user);
	
	public List<User> findAll();
	
	public void delete(int userId);
	
	
	public User findByName(String name);
}
