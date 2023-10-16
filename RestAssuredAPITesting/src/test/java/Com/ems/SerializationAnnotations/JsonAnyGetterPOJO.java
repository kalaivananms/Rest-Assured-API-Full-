package Com.ems.SerializationAnnotations;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class JsonAnyGetterPOJO {
	
	private Map<String, Object> employeeproperties;
	
    // @JsonAnyGetter
	public Map<String, Object> getEmployeeproperties() {
		return employeeproperties;
	}

	public void setEmployeeproperties(Map<String, Object> employeeproperties) {
		this.employeeproperties = employeeproperties;
	}
	

}
