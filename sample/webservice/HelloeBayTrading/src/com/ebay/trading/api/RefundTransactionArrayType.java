// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * A container consisting of one or more RefundTransaction containers.
 * 
 */
public class RefundTransactionArrayType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RefundTransaction")
	@Order(value=0)
	public List<RefundTransactionType> refundTransaction;	
	
	@AnyElement
	@Order(value=1)
	public List<Object> any;	
	
    
}