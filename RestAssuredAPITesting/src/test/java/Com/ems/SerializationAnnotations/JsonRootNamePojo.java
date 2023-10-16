package Com.ems.SerializationAnnotations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value="employees")
public class JsonRootNamePojo {

	private String  firstName;
	private String lastName;
	private String email;
	private List<String> skills;


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
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}


}
