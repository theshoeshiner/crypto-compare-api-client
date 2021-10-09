package org.thshsh.crypt.cryptocompare;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rating {

	@JsonProperty("Weiss")
	Weiss weiss;
	
	
	
	public Weiss getWeiss() {
		return weiss;
	}

	public void setWeiss(Weiss weiss) {
		this.weiss = weiss;
	}



	public boolean isEmpty() {
		return weiss == null || weiss.isEmpty();
	}

	@Override
	public String toString() {
		return "[weiss=" + weiss + "]";
	}
	
	
}
