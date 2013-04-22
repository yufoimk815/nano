// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Type defining the <b>ReportedItem</b> container which is returned in the
 * <b>GetVeROReportStatus</b> response. The <b>ReportedItem</b>
 * container consists of the <b>ItemID</b> of the item that has infringed
 * upon the seller's copyright, trademark, or intellectual property rights, as well as the
 * submission status of the VeRO Report.
 * 
 */
public class VeROReportedItemType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "ItemID")
	@Order(value=0)
	public String itemID;	
	
	@Element(name = "ItemStatus")
	@Order(value=1)
	public VeROItemStatusCodeType itemStatus;	
	
	@Element(name = "ItemReasonForFailure")
	@Order(value=2)
	public String itemReasonForFailure;	
	
	@AnyElement
	@Order(value=3)
	public List<Object> any;	
	
    
}