package Com.ems.Deserialization;

import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonSetterPojo {

	private int id;
	private String name;
	private String email;


	public int getId() {
		return id;
	}
	@JsonSetter(value="employeeID")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



}
