// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>SellerShippingProfile</b> container, which is used in an
 * Add/Revise/Relist Trading API call to reference a Business Policies shipping policy profile.
 * Business Policies shipping profiles contain detailed information on domestic and
 * international shipping, including shipping service options, handling time, package
 * handling costs, excluded ship-to locations, and shipping insurance information.
 * <br/><br/>
 * Business Policies shipping profiles are also returned in
 * <b>GetItem</b>, <b>GetMyeBaySelling<b>, and other
 * Trading calls that retrieve Item data.
 * <br/><br/>
 * <span class="tablenote"><b>Note:</b>
 * Business Policies are not yet available for use on the eBay platform.
 * <span/>
 * 
 */
public class SellerShippingProfileType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ShippingProfileID")
	@Order(value=0)
	public Long shippingProfileID;	
	
	@Element(name = "ShippingProfileName")
	@Order(value=1)
	public String shippingProfileName;	
	
	@AnyElement
	@Order(value=2)
	public List<Object> any;	
	
    
}