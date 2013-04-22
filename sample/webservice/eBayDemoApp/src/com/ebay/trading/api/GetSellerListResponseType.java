// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains a list of the items listed by the seller specified as input. The list of
 * items is returned in an ItemArrayType object, in which are returned zero, one, or
 * multiple ItemType objects. Each ItemType object contains the detail data for one
 * item listing.
 * 
 */
@RootElement(name = "GetSellerListResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellerListResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaginationResult")
	@Order(value=0)
	public PaginationResultType paginationResult;	
	
	@Element(name = "HasMoreItems")
	@Order(value=1)
	public Boolean hasMoreItems;	
	
	@Element(name = "ItemArray")
	@Order(value=2)
	public ItemArrayType itemArray;	
	
	@Element(name = "ItemsPerPage")
	@Order(value=3)
	public Integer itemsPerPage;	
	
	@Element(name = "PageNumber")
	@Order(value=4)
	public Integer pageNumber;	
	
	@Element(name = "ReturnedItemCountActual")
	@Order(value=5)
	public Integer returnedItemCountActual;	
	
	@Element(name = "Seller")
	@Order(value=6)
	public UserType seller;	
	
    
}