package org.thshsh.crypt.cryptocompare;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Weiss {

	@JsonProperty("Rating")
	String rating;
	@JsonProperty("TechnologyAdoptionRating")
	String technologyAdoptionRating;
	@JsonProperty("MarketPerformanceRating")
	String marketPerformanceRating;
	
	
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}



	public String getTechnologyAdoptionRating() {
		return technologyAdoptionRating;
	}

	public void setTechnologyAdoptionRating(String technologyAdoptionRating) {
		this.technologyAdoptionRating = technologyAdoptionRating;
	}



	public String getMarketPerformanceRating() {
		return marketPerformanceRating;
	}

	public void setMarketPerformanceRating(String marketPerformanceRating) {
		this.marketPerformanceRating = marketPerformanceRating;
	}



	public boolean isEmpty() {
		return StringUtils.isAllBlank(rating,technologyAdoptionRating,marketPerformanceRating);
	}

	@Override
	public String toString() {
		return "[rating=" + rating + ", technologyAdoptionRating=" + technologyAdoptionRating
				+ ", marketPerformanceRating=" + marketPerformanceRating + "]";
	}
	
	
}
