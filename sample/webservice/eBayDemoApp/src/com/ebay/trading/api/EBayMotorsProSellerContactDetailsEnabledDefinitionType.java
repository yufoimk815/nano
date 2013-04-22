// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Defines the SellerContactDetailsEnabled feature. If this field is present,
 * the category allows retrieval of seller-level contact information. The
 * field is returned as an empty element (e.g., a boolean value is not returned).
 * Added for EbayMotors Pro users.
 * 
 */
public class EBayMotorsProSellerContactDetailsEnabledDefinitionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@AnyElement
	@Order(value=0)
	public List<Object> any;	
	
    
}