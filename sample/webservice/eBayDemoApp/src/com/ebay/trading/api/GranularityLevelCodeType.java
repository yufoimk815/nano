// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Specifies a predefined subset of fields to return. The predefined set of fields
 * can vary for different calls. Only applicable to certain calls (see request types
 * that include a GranularityLevel property). For calls that support this filter, see
 * the eBay Web Services guide for a list of the output fields that are returned for
 * each level. Only one level can be specified at a time. For GetSellerList, use
 * DetailLevel or GranularityLevel in a given request, but not both. For
 * GetSellerList, if GranularityLevel is specified, DetailLevel is ignored.
 * 
 */
public enum GranularityLevelCodeType {

    /**
     * 
   * (in) For each record in the response, retrieves less data than Medium.
   * See the eBay Web Services guide for a list of the output fields
   * that are returned when this level is specified.
   * 
     */
    COARSE("Coarse"),
  

    /**
     * 
   * For each record in the response, retrieves more data than Medium.
   * See the eBay Web Services guide for a list of the output fields
   * that are returned when this level is specified.
   * 
     */
    FINE("Fine"),
  

    /**
     * 
   * For each record in the response, retrieves more data than Coarse and less data
   * than Fine. See the eBay Web Services guide for a list of the output fields
   * that are returned when this level is specified.
   * 
     */
    MEDIUM("Medium"),
  

    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    GranularityLevelCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static GranularityLevelCodeType fromValue(String v) {
        if (v != null) {
            for (GranularityLevelCodeType c: GranularityLevelCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}