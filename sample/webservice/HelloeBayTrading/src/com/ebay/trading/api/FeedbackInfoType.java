// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the Feedback details for an order line item, including the eBay User ID
 * of the user the feedback is intended for, the Feedback rating, and the Feedback comment.
 * 
 */
public class FeedbackInfoType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "CommentText")
	@Order(value=0)
	public String commentText;	
	
	@Element(name = "CommentType")
	@Order(value=1)
	public CommentTypeCodeType commentType;	
	
	@Element(name = "TargetUser")
	@Order(value=2)
	public String targetUser;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}