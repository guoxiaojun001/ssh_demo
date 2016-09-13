package cn.amumu.spring.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.amumu.spring.orm.Student;
import cn.amumu.spring.orm.User;
import cn.amumu.spring.service.StudentService;
import cn.amumu.spring.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1654432868760393645L;
	
	@Resource
	private UserService userService;
	
	private List<User> users;
	private User user;
	
	
	public String doLogin() throws Exception {
		
		System.out.println("======用户输入的信息========");
		System.out.println("======login========" + user.getName());
		System.out.println("======login========" + user.getPwd());
		
		User u = userService.findByName(user.getName());
		
		if(null ==u){
			return ERROR;
		}else{
			if(user.getPwd().equals(u.getPwd())){
				return SUCCESS;
			}
		}
		
		return SUCCESS;
	}
	
	
	

	@Override
	public String execute() throws Exception {
		users = userService.findAll();
		
		System.out.println("======execute========");
		return SUCCESS;
	}
	
	public String addUser() throws Exception {
		System.out.println("======addUser========");
		userService.saveUser(user);
		return SUCCESS;
	}
	
	public String deleteUser() throws Exception {
		userService.delete(user.getId());
		
		System.out.println("======deleteUser========");
		return SUCCESS;
	}
	
	public String findUser() throws Exception {
		userService.getUser(user.getId());
		System.out.println("======findUser========");
		return SUCCESS;
	}

	/*-------------get set method---------------------*/
	public List<User> getUsers() {
		return users;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
}
