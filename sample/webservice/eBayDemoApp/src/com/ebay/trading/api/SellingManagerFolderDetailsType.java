// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;
import java.util.Date;

/**
 * 
 * Contains information about a Selling Manager folder.
 * 
 */
public class SellingManagerFolderDetailsType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "FolderID")
	@Order(value=0)
	public Long folderID;	
	
	@Element(name = "ParentFolderID")
	@Order(value=1)
	public Long parentFolderID;	
	
	@Element(name = "FolderLevel")
	@Order(value=2)
	public Long folderLevel;	
	
	@Element(name = "FolderName")
	@Order(value=3)
	public String folderName;	
	
	@Element(name = "FolderComment")
	@Order(value=4)
	public String folderComment;	
	
	@Element(name = "ChildFolder")
	@Order(value=5)
	public List<SellingManagerFolderDetailsType> childFolder;	
	
	@Element(name = "CreationTime")
	@Order(value=6)
	public Date creationTime;	
	
	@AnyElement
	@Order(value=7)
	public List<Object> any;	
	
    
}