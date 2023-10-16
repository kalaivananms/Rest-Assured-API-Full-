package Com.ems.SerializationAnnotations;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class CustomSerializer extends StdSerializer<JsonSerializerPojo>{

	public CustomSerializer(Class<JsonSerializerPojo> t) {
		super(t);
	}

	public CustomSerializer() {
		this(null);
	}

	@Override
	public void serialize(JsonSerializerPojo value,
			JsonGenerator generator,
			SerializerProvider provider) throws IOException {

		generator.writeStartObject();
		generator.writeStringField("first_Name", value.getFirstname());
		generator.writeStringField("last_Name", value.getLastname());
		generator.writeStringField("email_", value.getEmail());
		generator.writeEndObject();

	}







}
