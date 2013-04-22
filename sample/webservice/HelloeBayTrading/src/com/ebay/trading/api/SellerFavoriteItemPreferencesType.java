// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Contains the data for the seller favorite item preferences, i.e.  the manual or automatic selection criteria to display items for buyer's favourite seller opt in email marketing.
 * 
 */
public class SellerFavoriteItemPreferencesType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SearchKeywords")
	@Order(value=0)
	public String searchKeywords;	
	
	@Element(name = "StoreCategoryID")
	@Order(value=1)
	public Long storeCategoryID;	
	
	@Element(name = "ListingType")
	@Order(value=2)
	public ListingTypeCodeType listingType;	
	
	@Element(name = "SearchSortOrder")
	@Order(value=3)
	public StoreItemListSortOrderCodeType searchSortOrder;	
	
	@Element(name = "MinPrice")
	@Order(value=4)
	public AmountType minPrice;	
	
	@Element(name = "MaxPrice")
	@Order(value=5)
	public AmountType maxPrice;	
	
	@Element(name = "FavoriteItemID")
	@Order(value=6)
	public List<String> favoriteItemID;	
	
	@AnyElement
	@Order(value=7)
	public List<Object> any;	
	
    
}