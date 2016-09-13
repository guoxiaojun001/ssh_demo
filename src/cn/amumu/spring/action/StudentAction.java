package cn.amumu.spring.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.amumu.spring.orm.Student;
import cn.amumu.spring.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;

@Controller
public class StudentAction extends ActionSupport {

	private static final long serialVersionUID = 1654432868760393645L;
	
	@Resource
	private StudentService studentService;
	
	private List<Student> students;
	private Student student;

	@Override
	public String execute() throws Exception {//默认调用次方法
		students = studentService.findAll();
		
		System.out.println("======execute========");
		return SUCCESS;
	}
	
	
	public String list() throws Exception {
		students = studentService.findAll();
		System.out.println("======list()========");
		return SUCCESS;
	}
	
	public String addStudent() throws Exception {
		System.out.println("======addStudent========");
		if(null == student ){
			return ERROR;
		}
		
		if(null == student.getName() || "".equals(student.getName())){
			return ERROR;
		}
		
		if(null == student.getAge() || "".equals(student.getAge())){
			return ERROR;
		}
		
		studentService.saveStudent(student);
		return SUCCESS;
	}
	
	public String deleteStudent() throws Exception {
		studentService.delete(student.getId());
		
		System.out.println("======deleteStudent========");
		return SUCCESS;
	}
	
	public String findStudent() throws Exception {
		studentService.getStudent(12L);
		System.out.println("======findStudent========");
		return SUCCESS;
	}

	/*-------------get set method-------不写以下方法的话 在jsp中获取不到值--------------*/
	public List<Student> getStudents() {
		return students;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}
}
