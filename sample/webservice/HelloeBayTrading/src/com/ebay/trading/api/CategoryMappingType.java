// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Mapping between an old category ID and an active category ID.
 * 
 */
public class CategoryMappingType implements Serializable {

    private static final long serialVersionUID = -1L;

	@AnyElement
	@Order(value=0)
	public List<Object> any;	
	
	@Attribute  
	@Order(value=1)
	public String oldID;	
	
	@Attribute  
	@Order(value=2)
	public String id;	
	
    
}