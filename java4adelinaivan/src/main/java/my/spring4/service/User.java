package my.spring4.service;

public class User {
	private String nume;
	private String blog;
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	@Override
	public String toString() {
		return "User [nume=" + nume + ", blog=" + blog + "]";
	}
	
}
