// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Item Specifics data returned from the Suggested Attributes engine.
 * 
 */
public class AttributeRecommendationsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "AttributeSetArray")
	@Order(value=0)
	public AttributeSetArrayType attributeSetArray;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
    
}