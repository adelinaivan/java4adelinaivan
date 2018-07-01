package my.spring4.util;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	private String name;
	private String description;
	private Date startDate;
	@ManyToOne
	private Teacher teacher;
	private String keywords;
	
	public Course () {
		
	}

	public Course(String name, String description, Date startDate) {
		
		this.name = name;
		this.description = description;
		this.startDate = startDate;
	}

}
