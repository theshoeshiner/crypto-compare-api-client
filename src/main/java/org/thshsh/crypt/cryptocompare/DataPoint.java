package org.thshsh.crypt.cryptocompare;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.JsonNode;

public class DataPoint {
	//time represents the start of the data point
	//long time;
	LocalDateTime timeFrom;
	LocalDateTime timeTo;
	BigDecimal low;
	BigDecimal high;
	BigDecimal open;
	BigDecimal close;
	BigDecimal avg;

	public DataPoint(JsonNode lastPoint) {
		timeFrom = LocalDateTime.ofEpochSecond(lastPoint.get("time").asLong(), 0, null);
		timeTo = timeFrom.plusHours(1);
		//time = ;
		low = new BigDecimal(lastPoint.get("low").toString());
		high = new BigDecimal(lastPoint.get("high").toString());
		open = new BigDecimal(lastPoint.get("open").toString());
		close = new BigDecimal(lastPoint.get("close").toString());
		avg = low.add(high).add(open).add(close).divide(BigDecimal.valueOf(4));
	}
}