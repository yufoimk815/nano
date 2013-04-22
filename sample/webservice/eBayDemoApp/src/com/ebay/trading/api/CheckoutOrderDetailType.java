// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Details of the order for a checked out cart.
 * 
 */
public class CheckoutOrderDetailType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "TotalCartMerchandiseCost")
	@Order(value=0)
	public AmountType totalCartMerchandiseCost;	
	
	@Element(name = "TotalCartShippingCost")
	@Order(value=1)
	public AmountType totalCartShippingCost;	
	
	@Element(name = "TotalTaxAmount")
	@Order(value=2)
	public AmountType totalTaxAmount;	
	
	@Element(name = "TotalAmount")
	@Order(value=3)
	public AmountType totalAmount;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}