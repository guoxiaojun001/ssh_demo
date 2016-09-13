package cn.amumu.spring.dao;

import java.util.List;

import cn.amumu.spring.orm.Student;
import cn.amumu.spring.orm.User;

public interface UserDao {
	
	public User findById(int id);
	
	public void save(User user);
	
	public List<User> findAll();

	public void delete(long userId);
	
	
	public User findByName(String name);
}
