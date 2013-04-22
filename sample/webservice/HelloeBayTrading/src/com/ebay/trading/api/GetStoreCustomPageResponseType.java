// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the custom page or pages for the user's Store.
 * 
 */
@RootElement(name = "GetStoreCustomPageResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreCustomPageResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CustomPageArray")
	@Order(value=0)
	public StoreCustomPageArrayType customPageArray;	
	
    
}