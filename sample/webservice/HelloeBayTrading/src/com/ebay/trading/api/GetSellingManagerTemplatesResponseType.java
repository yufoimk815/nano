// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the templates requested on input.
 * Each SellingManagerTemplateType object in the response contains the data for one
 * Selling Manager template.
 * 
 */
@RootElement(name = "GetSellingManagerTemplatesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSellingManagerTemplatesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SellingManagerTemplateDetailsArray")
	@Order(value=0)
	public SellingManagerTemplateDetailsArrayType sellingManagerTemplateDetailsArray;	
	
    
}