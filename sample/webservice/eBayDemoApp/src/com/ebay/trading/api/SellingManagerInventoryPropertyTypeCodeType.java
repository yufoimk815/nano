// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Indicates the filters for Selling manager inventory listings.
 * 
 */
public enum SellingManagerInventoryPropertyTypeCodeType {

    /**
     * 
   * Products which are out of stock.
   * 
     */
    PRODUCTS_OUT_OF_STOCK("ProductsOutOfStock"),
  

    /**
     * 
   * Products that are active.
   * 
     */
    ACTIVE("Active"),
  

    /**
     * 
   * Products that are inactive.
   * 
     */
    IN_ACTIVE("InActive"),
  

    /**
     * 
   * Products in low stock.
   * 
     */
    LOW_STOCK("LowStock"),
  

    /**
     * 
   * Products with listings.
   * 
     */
    WITH_LISTINGS("WithListings"),
  

    /**
     * 
   * Products without listings.
   * 
     */
    WITHOUT_LISTINGS("WithoutListings"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SellingManagerInventoryPropertyTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SellingManagerInventoryPropertyTypeCodeType fromValue(String v) {
        if (v != null) {
            for (SellingManagerInventoryPropertyTypeCodeType c: SellingManagerInventoryPropertyTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}