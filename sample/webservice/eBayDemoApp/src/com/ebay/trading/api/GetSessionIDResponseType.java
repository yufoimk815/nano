// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Contains the generated SessionID, which is a unique identifier for authenticating data entry during the process that creates a user token.
 * 
 */
@RootElement(name = "GetSessionIDResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetSessionIDResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SessionID")
	@Order(value=0)
	public String sessionID;	
	
    
}