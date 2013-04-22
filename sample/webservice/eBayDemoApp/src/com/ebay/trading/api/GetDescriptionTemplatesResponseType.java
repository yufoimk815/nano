// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Returned after calling GetDescriptionTemplatesRequest.
 * 
 */
@RootElement(name = "GetDescriptionTemplatesResponse", namespace = "urn:ebay:apis:eBLBaseComponents")
public class GetDescriptionTemplatesResponseType extends AbstractResponseType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "DescriptionTemplate")
	@Order(value=0)
	public List<DescriptionTemplateType> descriptionTemplate;	
	
	@Element(name = "LayoutTotal")
	@Order(value=1)
	public Integer layoutTotal;	
	
	@Element(name = "ObsoleteLayoutID")
	@Order(value=2)
	public List<Integer> obsoleteLayoutID;	
	
	@Element(name = "ObsoleteThemeID")
	@Order(value=3)
	public List<Integer> obsoleteThemeID;	
	
	@Element(name = "ThemeGroup")
	@Order(value=4)
	public List<ThemeGroupType> themeGroup;	
	
	@Element(name = "ThemeTotal")
	@Order(value=5)
	public Integer themeTotal;	
	
    
}