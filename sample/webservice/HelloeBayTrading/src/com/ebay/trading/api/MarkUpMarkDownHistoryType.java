// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * List of objects representing markup or markdown events for a given application
 * and time period. If no time period is specified in the request, the information
 * for only one day (24 hours before the time the call is made to the time the call
 * is made) is included. The maximum time period is allowed is 3 days (72 hours
 * before the call is made to the time the call is made).
 * 
 */
public class MarkUpMarkDownHistoryType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "MarkUpMarkDownEvent")
	@Order(value=0)
	public List<MarkUpMarkDownEventType> markUpMarkDownEvent;	
	
    
}