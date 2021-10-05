package org.thshsh.crypt.cryptocompare;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coin {

	@JsonProperty("Id")
	String id;
	@JsonProperty("CoinName")
	String name;
	@JsonProperty("Symbol")
	String symbol;
	@JsonProperty("ImageUrl")
	String imageUrl;
	@JsonProperty("BuiltOn")
	String builtOn;
	@JsonProperty("PlatformType")
	String platformType;
	@JsonProperty("Taxonomy")
	Taxonomy taxonomy;
	@JsonProperty("CirculatingSupply")
	BigDecimal circulatingSupply;
	@JsonProperty("Rating")
	Rating rating;
	
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
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getBuiltOn() {
		return builtOn;
	}
	public void setBuiltOn(String builtOn) {
		this.builtOn = builtOn;
	}
	public String getPlatformType() {
		return platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}
	public Taxonomy getTaxonomy() {
		return taxonomy;
	}
	public void setTaxonomy(Taxonomy taxonomy) {
		this.taxonomy = taxonomy;
	}
	public BigDecimal getCirculatingSupply() {
		return circulatingSupply;
	}
	public void setCirculatingSupply(BigDecimal circulatingSupply) {
		this.circulatingSupply = circulatingSupply;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	public boolean hasRating() {
		return rating != null && !rating.isEmpty();
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", symbol=" + symbol + "]";
	}
	
	
}
