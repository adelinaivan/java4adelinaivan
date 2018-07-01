package my.spring4.util;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	private String name;
	
	@OneToMany(mappedBy = "teacher")
	private List<Course> courses=new ArrayList<Course>();
	
	public Teacher() {
		
	}
	public Teacher(String name) {
		
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	


}
