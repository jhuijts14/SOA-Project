/**
 * ApprovalServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
    package org.loans.approval;

import org.loans.schema.ApprovalResponse;
    /**
     *  ApprovalServiceSkeleton java skeleton for the axisService
     */
    public class ApprovalServiceSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param creditInformationRequest 
             * @return approvalResponse 
             * @throws ErrorMessage 
         */
        
                 public org.loans.schema.ApprovalResponse approve
                  (
                  org.loans.schema.CreditInformationRequest creditInformationRequest
                  )
            throws ErrorMessage{
                	 ApprovalResponse result = new ApprovalResponse();
                	 if (Math.random() < 0.6)
                		 result.setAccept("yes");
                	 else result.setAccept("no");
                	 return result;
                	 
                //TODO : fill this with the necessary business logic
                // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#approve");
        }
     
    }