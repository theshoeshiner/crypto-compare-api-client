package org.thshsh.crypt.cryptocompare;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@TestPropertySource
@TestInstance(Lifecycle.PER_CLASS)
@ContextConfiguration(classes = ClientTest.class)
public class ClientTest {

	public static final Logger LOGGER = LoggerFactory.getLogger(ClientTest.class);

	@Value("${cc.apikey}")
	String apiKey;

	CryptoCompare cryptoCompare;

	@BeforeAll
	public void beforeAll() {
		LOGGER.info("beforeAll");
		cryptoCompare = new CryptoCompare(apiKey);
	} 

	@Test
	public void testExchanges() {
		Collection<Exchange> ex = cryptoCompare.getExchanges();
		Assertions.assertTrue(ex.size()>0);
	}
	
	@Test
	public void testExchangesCurrencyPairs() {
		ExchangesCurrencyPairs pairs = cryptoCompare.getExchangeCurrencyPairs(true);
		LOGGER.info("exchanges: {}",pairs.getExchangeNamePairsMap().size());
		Assertions.assertTrue(pairs.getExchangeNamePairsMap().size()>0);
		Set<String> currencies = new HashSet<String>();
		pairs.getExchangeNamePairsMap().forEach((key,eps) -> {
			LOGGER.info("Exchange: {} = {}",key,eps.getPairsMap().size());
			eps.getPairsMap().keySet().forEach(k -> {
				currencies.add(k.toLowerCase());
			});
		});
		LOGGER.info("currencies: {}",currencies.size());
		LOGGER.info("currencies: {}",StringUtils.join(currencies, ","));
	}

	@Test
	public void testCurrentPriceError() {
		Assertions.assertThrows(CryptoCompareException.class, () -> {
			cryptoCompare.getCurrentPrice("USD","VCK");
		});
	}
	
	@Test
	public void testCurrentPrice() {
		CurrentPricesResponse res = cryptoCompare.getCurrentPrice("USD","BTC");
		LOGGER.info("price: {}",res.getPrice("BTC"));
		Assertions.assertNotNull(res.getPrice("BTC"));
	}
	
	@Test
	public void testCoins() {
		Collection<Coin> coins = cryptoCompare.getCoins();
		Set<String> platforms = new HashSet<>();
		Set<String> builton = new HashSet<>();
		Set<String> cas = new HashSet<>();
		Set<String> ct = new HashSet<>();
		Set<String> rats = new HashSet<>();
		Set<BigDecimal> supplies = new HashSet<>();
		coins.forEach(coin -> {
			platforms.add(coin.getPlatformType());
			builton.add(coin.getBuiltOn());
			cas.add(coin.getTaxonomy().getCollateralizedAssetType());
			if(coin.hasRating()) {
				rats.add(coin.getRating().getWeiss().getRating());
			}
			supplies.add(coin.getCirculatingSupply());
			/*if(coin.getCirculatingSupply().compareTo(BigDecimal.ZERO) > 0 || coin.hasRating()) {
				
			}
			else {
				
			}*/
		});
		LOGGER.info("platformtypes: {}",platforms);
		LOGGER.info("builton: {}",builton);
		LOGGER.info("getCollateralizedAssetType: {}",builton);
		LOGGER.info("ratings: {}",rats);
		LOGGER.info("supplies: {}",supplies.size());

	}

}
