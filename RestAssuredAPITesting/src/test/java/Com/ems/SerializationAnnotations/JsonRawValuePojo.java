package Com.ems.SerializationAnnotations;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class JsonRawValuePojo {
	
	private int id;
	private String  firstName;
	private String lastName;
	private String email;
	@JsonRawValue
	//private String skills="java";
	private String skills="{[\"java\",\"seleinum\"]}";
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
 
}
