package Com.ems.SerializationAnnotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic=true)
//@JsonPropertyOrder({"name","email","id"})
public class JsonpropertyOrderPojo {

	private int id;
	private String name;
	private String email;

	@JsonGetter(value="employeeId")
	public int getId() {
		return id;
	}
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
