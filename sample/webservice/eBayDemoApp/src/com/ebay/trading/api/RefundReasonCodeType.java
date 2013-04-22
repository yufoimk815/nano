// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Explanation of the reason that the refund is being issued. Applicable to Half.com refunds only.
 * 
 */
public enum RefundReasonCodeType {

    /**
     * 
   * Seller is unable to ship the product to the buyer.
   * 
     */
    CANNOT_SHIP_PRODUCT("CannotShipProduct"),
  

    /**
     * 
   * Seller shipped the wrong item to the buyer.
   * 
     */
    WRONG_ITEM_SHIPPED("WrongItemShipped"),
  

    /**
     * 
   * The buyer returned the item due to its quality.
   * 
     */
    ITEM_BAD_QUALITY("ItemBadQuality"),
  

    /**
     * 
   * The buyer returned the item due to damage.
   * 
     */
    ITEM_DAMAGED("ItemDamaged"),
  

    /**
     * 
   * The buyer decided they did not want the item.
   * 
     */
    BUYER_REMORSE("BuyerRemorse"),
  

    /**
     * 
   * The seller has another reason for issuing a Half.com refund.
   * 
     */
    OTHER("Other"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    RefundReasonCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static RefundReasonCodeType fromValue(String v) {
        if (v != null) {
            for (RefundReasonCodeType c: RefundReasonCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}