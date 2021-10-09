package org.thshsh.crypt.cryptocompare;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {

	@JsonProperty("Response")
	String response;

	@JsonProperty("Message")
	String message;

	@JsonProperty("HasWarning")
	Boolean hasWarning;

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getHasWarning() {
		return hasWarning;
	}

	public void setHasWarning(Boolean hasWarning) {
		this.hasWarning = hasWarning;
	}

	

}
