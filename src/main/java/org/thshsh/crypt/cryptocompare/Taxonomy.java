package org.thshsh.crypt.cryptocompare;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Taxonomy {

/**
 "Taxonomy": {
                "Access": "Permissionless",
                "FCA": "Utility",
                "FINMA": "Utility",
                "Industry": "Financial and Insurance Activities",
                "CollateralizedAsset": "No",
                "CollateralizedAssetType": "",
                "CollateralType": "",
                "CollateralInfo": ""
            },
 */

	@JsonProperty("CollateralizedAsset")
	String collateralizedAsset;

	@JsonProperty("CollateralizedAssetType")
	String collateralizedAssetType;

	@JsonProperty("CollateralType")
	String collateralType;

	@JsonProperty("CollateralInfo")
	String collateralInfo;

	@JsonProperty("Access")
	String access;

	public String getCollateralizedAsset() {
		return collateralizedAsset;
	}

	public void setCollateralizedAsset(String collateralizedAsset) {
		this.collateralizedAsset = collateralizedAsset;
	}

	public String getCollateralizedAssetType() {
		return collateralizedAssetType;
	}

	public void setCollateralizedAssetType(String collateralizedAssetType) {
		this.collateralizedAssetType = collateralizedAssetType;
	}

	public String getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(String collateralType) {
		this.collateralType = collateralType;
	}

	public String getCollateralInfo() {
		return collateralInfo;
	}

	public void setCollateralInfo(String collateralInfo) {
		this.collateralInfo = collateralInfo;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}


}
