package Com.ems.Deserialization;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties({"age","email"})
@JsonInclude(Include.NON_NULL)
public class JsonIgnorePojo {

	private int id;
	private String name;
	private String email;
	private Date DateofBrith;
	@JsonIgnore
	private int age;


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
	public Date getDateofBrith() {
		return DateofBrith;
	}
	public void setDateofBrith(Date dateofBrith) {
		DateofBrith = dateofBrith;
	}
	public int getAge() {
		return age;
	}





}
