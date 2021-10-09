package org.thshsh.crypt.cryptocompare;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonValueInstantiator(Instantiator.class)
//@JsonSerialize(using = DistanceSerializer.class)
public enum Grade {
	
	AA,A,BB,B,C,D,E,F,
	@JsonProperty("-")
	NA
	;

/*	public static class DistanceSerializer extends StdSerializer {
		
		public static final Logger LOGGER = LoggerFactory.getLogger(Grade.Instantiator.class);

	
		  
	    public DistanceSerializer() {
	        super(Grade.class);
	    }

	    public DistanceSerializer(Class t) {
	        super(t);
	    }

	    public void serialize(Grade distance, JsonGenerator generator, SerializerProvider provider) 
	      throws IOException, JsonProcessingException {
	        generator.writeStartObject();
	        generator.writeFieldName("name");
	        generator.writeString(distance.name());
	        generator.writeFieldName("unit");
	        generator.writeString(distance.getUnit());
	        generator.writeFieldName("meters");
	        generator.writeNumber(distance.getMeters());
	        generator.writeEndObject();
	    }*/
		
	
}
