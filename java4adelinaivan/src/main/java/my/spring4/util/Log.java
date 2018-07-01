package my.spring4.util;

import javax.persistence.Entity;


@Entity
public class Log extends BaseEntity {

	private String message;

	public Log(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
