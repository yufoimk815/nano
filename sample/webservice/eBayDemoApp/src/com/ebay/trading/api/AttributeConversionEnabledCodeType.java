// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Used to indicate whether ID-based attributes have been converted
 * to custom Item Specifics.
 * 
 */
public enum AttributeConversionEnabledCodeType {

    /**
     * 
   * Please note that we no longer recommend passing both ID-based
   * attributes and custom Item specifics in the same request.<br>
   * <br>
   * eBay has not converted the category from ID-based attributes to
   * only support custom Item Specifics. AddItem and related calls
   * may support passing both formats in the same request (if the
   * category supports both formats.)
   * 
     */
    NOT_APPLICABLE("NotApplicable"),
  

    /**
     * 
   * As previously announced in 2011 and early 2012, most categories no
   * longer perform this conversion, so very few categories return this value.<br>
   * <br>
   * eBay has converted the category from ID-based attributes to
   * only support custom Item Specifics. With this setting:<br>
   * <br>
   * You can pass one format or the other in the same AddItem request,
   * but you can't pass both formats together. If you pass in ID-based
   * attributes in the AddItem family of calls, eBay will convert them to
   * custom Item Specifics on your behalf.
   * 
     */
    ENABLED("Enabled"),
  

    /**
     * 
   * eBay has converted the category from ID-based attributes to
   * only support custom Item Specifics. ID-based attributes are
   * no longer supported. AddItem and related calls
   * will fail if you pass ID-based attributes in the request.
   * 
     */
    DISABLED("Disabled"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    AttributeConversionEnabledCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static AttributeConversionEnabledCodeType fromValue(String v) {
        if (v != null) {
            for (AttributeConversionEnabledCodeType c: AttributeConversionEnabledCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}