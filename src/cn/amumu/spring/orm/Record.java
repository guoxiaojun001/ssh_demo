package cn.amumu.spring.orm;

public class Record implements java.io.Serializable {

	private static final long serialVersionUID = 34677L;
	private int id_r;
	private String msg;
	private String score;
	
	
	public int getId_r() {
		return id_r;
	}
	public void setId_r(int id_r) {
		this.id_r = id_r;
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
