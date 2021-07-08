package org.thshsh.crypt.cryptocompare;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;

public class CacheEntry {
	//String key;
	public BigDecimal average;
	public BigDecimal high;
	public BigDecimal low;
	public BigDecimal open;
	public BigDecimal close;

	public String asset;
	//inclusive
	public BigInteger startTime;
	//exclusive
	public BigInteger endTime;

	public CacheEntry(String currency, BigInteger start, BigInteger end, BigDecimal high, BigDecimal low,BigDecimal open, BigDecimal close) {
		super();
		this.asset = currency;
		this.startTime = start;
		this.endTime = end;
		this.high = high;
		this.low = low;
		this.open = open;
		this.close = close;
		average = low.add(high).add(open).add(close).divide(BigDecimal.valueOf(4));

		StandardDeviation sd = new StandardDeviation();
		sd.increment(low.doubleValue());
		sd.increment(high.doubleValue());
		sd.increment(open.doubleValue());
		sd.increment(close.doubleValue());
		double std = sd.getResult();
		std = std / average.doubleValue();
		CryptoCompare.LOGGER.info("standard deviation of entry {} = {}",this,std);
	}

	public Boolean includesTime(BigInteger time) {
		if (startTime.compareTo(time) <= 0 && endTime.compareTo(time) > 0) {
			return true;
		} else
			return false;
	}


	public CacheEntry(CSVRecord record) {
		this(record.get(0),new BigInteger(record.get(1)),new BigInteger(record.get(2)),new BigDecimal(record.get(3)),new BigDecimal(record.get(4)),new BigDecimal(record.get(5)),new BigDecimal(record.get(6)));
	}

	@Override
	public String toString() {
		return "[asset=" + asset + ", startTime=" + startTime + ", endTime=" + endTime + ", average=" + average
				+ "]";
	}

}