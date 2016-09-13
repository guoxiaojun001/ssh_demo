package cn.amumu.spring.orm;

public class PersonRecord implements java.io.Serializable {

	private static final long serialVersionUID = -3167419971198974542L;
	private String age;
	private String name;
	private int id_foreign;
	
	private String msg;
	private String score;
	
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId_foreign() {
		return id_foreign;
	}
	public void setId_foreign(int id_foreign) {
		this.id_foreign = id_foreign;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
}
