// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Response to a GetSellingManagerSaleRecord call.
 * 
 */
@RootElement(name = "GetSellingManagerSaleRecordResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerSaleRecordResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingManagerSoldOrder")
	@Order(value=0)
	public SellingManagerSoldOrderType sellingManagerSoldOrder;	
	
    
}