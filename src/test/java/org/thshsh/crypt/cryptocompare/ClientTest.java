package org.thshsh.crypt.cryptocompare;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

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
@ContextConfiguration(classes = CryptoCompare.class)
public class ClientTest {

	public static final Logger LOGGER = LoggerFactory.getLogger(ClientTest.class);

	@Value("${apikey}")
	String apiKey;

	@Test
	public void testExchanges() {
		CryptoCompare cc = new CryptoCompare(apiKey,null);
		cc.getExchanges();
	}

	@Test
	public void testCoins() {
		CryptoCompare cc = new CryptoCompare(apiKey,null);
		Collection<Coin> coins = cc.getCoins();
		Set<String> platforms = new HashSet<>();
		Set<String> builton = new HashSet<>();
		Set<String> cas = new HashSet<>();
		Set<String> ct = new HashSet<>();
		coins.forEach(coin -> {
			platforms.add(coin.getPlatformType());
			builton.add(coin.getBuiltOn());
			cas.add(coin.getTaxonomy().getCollateralizedAssetType());

		});
		LOGGER.info("platformtypes: {}",platforms);
		LOGGER.info("builton: {}",builton);

	}

}
