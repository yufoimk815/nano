// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Retrieves an authentication token for a user.&nbsp;<b>Also for Half.com</b>.
 * 
 */
@RootElement(name = "FetchTokenRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class FetchTokenRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "SecretID")
	@Order(value=0)
	public String secretID;	
	
	@Element(name = "SessionID")
	@Order(value=1)
	public String sessionID;	
	
    
}