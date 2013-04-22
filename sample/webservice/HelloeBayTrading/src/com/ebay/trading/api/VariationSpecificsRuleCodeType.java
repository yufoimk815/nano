// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Defines option for whether an Item Specific can be used as a variation specific.
 * 
 */
public enum VariationSpecificsRuleCodeType {

    /**
     * 
   * The recommended name (and values, if any) can be used
   * either in the Item Specifics or VariationSpecifics context
   * in listing calls.
   * This is the default for variation-enabled categories.
   * 
     */
    ENABLED("Enabled"),
  

    /**
     * 
   * The recommended name/values can't be used in VariationSpecifics
   * (but they can be used in ItemSpecifics). Typically, this occurs
   * when the category doesn't support variations, or if the category
   * requires the name to be the same for all variations
   * in the listing.
   * 
     */
    DISABLED("Disabled"),
  

    /**
     * 
   * Reserved for future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    VariationSpecificsRuleCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static VariationSpecificsRuleCodeType fromValue(String v) {
        if (v != null) {
            for (VariationSpecificsRuleCodeType c: VariationSpecificsRuleCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}