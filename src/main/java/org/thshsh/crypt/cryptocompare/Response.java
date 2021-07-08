package org.thshsh.crypt.cryptocompare;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("Response")
	String response;

	@JsonProperty("Message")
	String message;

	@JsonProperty("HasWarning")
	Boolean hasWarning;



}
