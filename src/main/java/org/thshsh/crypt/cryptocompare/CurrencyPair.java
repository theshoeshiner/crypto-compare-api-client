package org.thshsh.crypt.cryptocompare;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrencyPair {
	
	/**
	  "histo_minute_start_ts": 1598918400,
                                "histo_minute_start": "2020-09-01",
                                "histo_minute_end_ts": 1632614400,
                                "histo_minute_end": "2021-09-26"
	 */

	@JsonProperty("histo_minute_start_ts")
	Long startTimestamp;
	
	@JsonProperty("histo_minute_end_ts")
	Long endTimestamp;
}
