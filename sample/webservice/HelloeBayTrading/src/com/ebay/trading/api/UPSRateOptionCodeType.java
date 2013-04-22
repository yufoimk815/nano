// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * UPS Rate Options
 * 
 */
public enum UPSRateOptionCodeType {

    /**
     * 
   * UPS Daily Rates
   * 
     */
    UPS_DAILY_RATES("UPSDailyRates"),
  

    /**
     * 
   * UPS On-Demand Rates
   * 
     */
    UPS_ON_DEMAND_RATES("UPSOnDemandRates"),
  

    /**
     * 
   *  Reserved for internal or future use
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    UPSRateOptionCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static UPSRateOptionCodeType fromValue(String v) {
        if (v != null) {
            for (UPSRateOptionCodeType c: UPSRateOptionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}