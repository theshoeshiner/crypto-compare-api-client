package org.thshsh.crypt.cryptocompare;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Exchange {

	

	@JsonProperty("Id")
	String id;
	@JsonProperty("Name")
	String name;
	@JsonProperty("InternalName")
	String internalName;
	@JsonProperty("Url")
	String url;
	@JsonProperty("LogoUrl")
	String logoUrl;
	@JsonProperty("Grade")
	
	Grade grade;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInternalName() {
		return internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	
	

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Exchange [id=" + id + ", name=" + name + ", internalName=" + internalName + "]";
	}




}
