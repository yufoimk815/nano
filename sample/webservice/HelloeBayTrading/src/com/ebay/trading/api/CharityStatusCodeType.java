// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 *     CharityStatusCodeType - Type declaration to be used by other schema.
 *     Indicates the nonprofit status of the nonprofit charity organization registered with the dedicated eBay Giving Works provider.
 * 
 */
public enum CharityStatusCodeType {

    /**
     * 
   *   (out)The specified nonprofit charity organization is a valid nonprofit charity organization according to the requirements of the dedicated eBay Giving Works provider.
   * 
     */
    VALID("Valid"),
  

    /**
     * 
   *   (out)The specified nonprofit charity organization is no longer a valid nonprofit charity organization according to the requirements of the dedicated eBay Giving Works provider.
   * 
     */
    NO_LONGER_VALID("NoLongerValid"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    CharityStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static CharityStatusCodeType fromValue(String v) {
        if (v != null) {
            for (CharityStatusCodeType c: CharityStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}