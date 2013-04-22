// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Defines the ID-based attribute conversion to custom Item Specifics. If the field is present, the corresponding feature applies to the category. The field is returned as an empty element (e.g., a boolean value is not returned).
 * 
 */
public class AttributeConversionEnabledFeatureDefinitionType implements Serializable {

    private static final long serialVersionUID = -1L;

	@AnyElement
	@Order(value=0)
	public List<Object> any;	
	
    
}