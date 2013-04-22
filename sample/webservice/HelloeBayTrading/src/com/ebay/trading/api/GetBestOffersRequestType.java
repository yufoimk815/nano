// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves Best Offers.
 * 
 */
@RootElement(name = "GetBestOffersRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetBestOffersRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "BestOfferID")
	@Order(value=1)
	public String bestOfferID;	
	
	@Element(name = "BestOfferStatus")
	@Order(value=2)
	public BestOfferStatusCodeType bestOfferStatus;	
	
	@Element(name = "Pagination")
	@Order(value=3)
	public PaginationType pagination;	
	
    
}