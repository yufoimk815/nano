// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 *  This type is deprecated as the call is no longer available.
 * 
 * 
 */
public enum DateSpecifierCodeType {

    /**
     * 
   * 
   * (in) The month subcomponent of a date.
   * 
     */
    M("M"),
  

    /**
     * 
   * 
   * (in) The day subcomponent of a date.
   * 
     */
    D("D"),
  

    /**
     * 
   * 
   * (in) The year subcomponent of a date.
   * 
     */
    Y("Y"),
  

    /**
     * 
   * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DateSpecifierCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DateSpecifierCodeType fromValue(String v) {
        if (v != null) {
            for (DateSpecifierCodeType c: DateSpecifierCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}