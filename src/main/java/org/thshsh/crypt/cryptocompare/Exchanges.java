package org.thshsh.crypt.cryptocompare;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Exchanges extends Response {

	@JsonProperty("Data")
	Map<Integer,Exchange> data;



}
