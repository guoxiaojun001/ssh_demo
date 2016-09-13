package cn.amumu.spring.action;

import javax.annotation.Resource;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import cn.amumu.spring.orm.PersonRecord;
import cn.amumu.spring.service.PersonRecordService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class PersonRecordsAction extends ActionSupport {
	private static final long serialVersionUID = 1654432868760393645L;
	
	@Resource
	private PersonRecordService personRecordService;
	
	private PersonRecord personRecord;
	
	private String key;
	
	public String findPersonRecord() throws Exception {
		System.out.println("======findPersonRecord========");
		System.out.println("key == " + key);
		personRecord = personRecordService.findByFKey( Integer.parseInt(key));
		System.out.println("getMsg == " + personRecord.getMsg());
		System.out.println("getName == " + personRecord.getName());
		
		//往jsp中传值。 通ServletActionContext 把值放进去 ，或者通过set get方法
		ActionContext.getContext().put("xmqq",123456);
		ServletActionContext.getRequest().setAttribute("hello","Jack");
		
		//ActionContext.getContext().put("personRecord",personRecord);
		
		return SUCCESS;
	}

	public PersonRecord getPersonRecord() {
		return personRecord;
	}

	public void setPersonRecord(PersonRecord personRecord) {
		this.personRecord = personRecord;
	}
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
