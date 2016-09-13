package cn.amumu.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.amumu.spring.dao.StudentDao;
import cn.amumu.spring.dao.UserDao;
import cn.amumu.spring.orm.Student;
import cn.amumu.spring.orm.User;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
//	@Cacheable(value = "user", key = "#id")
	public User getUser(int id) {
		return userDao.findById(id);
	}

	@Override
	@Transactional
//	@CacheEvict(value = "user", key = "'findAllUser'")
	public void saveUser(User user) {
		userDao.save(user);
	}

	@Override
//	@Cacheable(value = "user", key = "'findAllUser'")
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
//	@Caching(evict={@CacheEvict(value = "user", key = "'findAllUser'"),@CacheEvict(value = "user", key = "#id")})
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public User findByName(String name) {
		return userDao.findByName(name);
	}

}
