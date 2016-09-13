package cn.amumu.spring.orm;

public class Person implements java.io.Serializable {

	private static final long serialVersionUID = 459822L;
	private int id;
	private String age;
	private String name;
	private int id_foreign;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	
}
