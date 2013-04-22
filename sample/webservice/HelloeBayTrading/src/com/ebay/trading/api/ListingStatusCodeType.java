// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Specifies an active or ended listing's status in eBay's processing
 * workflow. If a listing ends with a sale (or sales), eBay needs to
 * update the sale details (e.g., total price and buyer/high bidder)
 * and the final value fee. This processing can take several minutes.
 * If you retrieve a sold item and no details about the buyer/high
 * bidder are returned or no final value fee is available, use this
 * listing status information to determine whether eBay has finished
 * processing the listing.
 * 
 */
public enum ListingStatusCodeType {

    /**
     * 
   * The listing is still active or the listing has ended with
   * a sale but eBay has not completed processing the sale details
   * (e.g., total price and high bidder). A multi-item listing is
   * considered active until all items have winning bids or
   * purchases or the listing ends with at least one winning bid or
   * purchase. If the listing has ended with a sale but this Active
   * status is returned, please allow several minutes for eBay to
   * finish processing the listing.
   * 
     */
    ACTIVE("Active"),
  

    /**
     * 
   * The listing has ended. If the listing ended with a sale,
   * eBay has completed processing of the sale. All sale information
   * returned from eBay (e.g., total price and high bidder) should be
   * considered accurate and complete. However, the final value fee is
   * not yet available.
   * 
     */
    ENDED("Ended"),
  

    /**
     * 
   * The listing has closed and eBay has completed processing the sale. All
   * sale information returned from eBay (e.g., total price and high bidder) should
   * be considered accurate and complete. Although the Final Value Fee (FVF) for
   * FixedPriceItem and StoresFixedPrice items is returned by GetSellerTransactions
   * and GetItemTransactions, all other listing types (excluding Buy It Now
   * purchases) require the listing status to be Completed before the Final Value
   * Fee is returned.
   * 
     */
    COMPLETED("Completed"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM("Custom");
  
  
    private final String value;
  
    ListingStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ListingStatusCodeType fromValue(String v) {
        if (v != null) {
            for (ListingStatusCodeType c: ListingStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}