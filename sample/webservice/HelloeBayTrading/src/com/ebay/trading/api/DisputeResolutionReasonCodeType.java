// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

/**
 * 
 * Defines the reason a dispute was resolved.
 * 
 */
public enum DisputeResolutionReasonCodeType {

    /**
     * 
   * The dispute was not resolved.
   * 
     */
    UNRESOLVED("Unresolved"),
  

    /**
     * 
   * The buyer provided proof of payment in feedback.
   * 
     */
    PROOF_OF_PAYMENT("ProofOfPayment"),
  

    /**
     * 
   * The buyer or seller had a technical problem with a computer.
   * 
     */
    COMPUTER_TECHNICAL_PROBLEM("ComputerTechnicalProblem"),
  

    /**
     * 
   * The buyer and seller have not made contact.
   * 
     */
    NO_CONTACT("NoContact"),
  

    /**
     * 
   * The buyer or seller had a family emergency.
   * 
     */
    FAMILY_EMERGENCY("FamilyEmergency"),
  

    /**
     * 
   * The buyer provided proof of payment in feedback.
   * 
     */
    PROOF_GIVEN_IN_FEEDBACK("ProofGivenInFeedback"),
  

    /**
     * 
   * The dispute was the buyer's first infraction.
   * 
     */
    FIRST_INFRACTION("FirstInfraction"),
  

    /**
     * 
   * The buyer and seller came to agreement.
   * 
     */
    CAME_TO_AGREEMENT("CameToAgreement"),
  

    /**
     * 
   * The buyer returned the item.
   * 
     */
    ITEM_RETURNED("ItemReturned"),
  

    /**
     * 
   *  The buyer reimbursed the seller's auction fees.
   * 
     */
    BUYER_PAID_AUCTION_FEES("BuyerPaidAuctionFees"),
  

    /**
     * 
   * The seller received payment.
   * 
     */
    SELLER_RECEIVED_PAYMENT("SellerReceivedPayment"),
  

    /**
     * 
   * Some other resolution occurred.
   * 
     */
    OTHER_RESOLUTION("OtherResolution"),
  

    /**
     * 
   * After eBay approved payment of the claim, the claim was paid.
   * 
     */
    CLAIM_PAID("ClaimPaid"),
  

    /**
     * 
   * Reserved for future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DisputeResolutionReasonCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DisputeResolutionReasonCodeType fromValue(String v) {
        if (v != null) {
            for (DisputeResolutionReasonCodeType c: DisputeResolutionReasonCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}