// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the current list of options for Store configurations.
 * 
 */
@RootElement(name = "GetStoreOptionsResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetStoreOptionsResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "BasicThemeArray")
	@Order(value=0)
	public StoreThemeArrayType basicThemeArray;	
	
	@Element(name = "AdvancedThemeArray")
	@Order(value=1)
	public StoreThemeArrayType advancedThemeArray;	
	
	@Element(name = "LogoArray")
	@Order(value=2)
	public StoreLogoArrayType logoArray;	
	
	@Element(name = "SubscriptionArray")
	@Order(value=3)
	public StoreSubscriptionArrayType subscriptionArray;	
	
	@Element(name = "MaxCategories")
	@Order(value=4)
	public Integer maxCategories;	
	
	@Element(name = "MaxCategoryLevels")
	@Order(value=5)
	public Integer maxCategoryLevels;	
	
    
}