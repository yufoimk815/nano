// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 *  Type defining the <b>VariationSpecificPictureSet</b> container, which is
 *  used to specify the URL(s) where the picture(s) of the variation specific will be
 *  hosted. If the <b>Variations.Pictures</b> container is used, at least one
 *  <b>VariationSpecificPictureSet</b> container is required.
 * 
 */
public class VariationSpecificPictureSetType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "VariationSpecificValue")
	@Order(value=0)
	public String variationSpecificValue;	
	
	@Element(name = "PictureURL")
	@Order(value=1)
	public List<String> pictureURL;	
	
	@Element(name = "GalleryURL")
	@Order(value=2)
	public String galleryURL;	
	
	@Element(name = "ExternalPictureURL")
	@Order(value=3)
	public List<String> externalPictureURL;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}