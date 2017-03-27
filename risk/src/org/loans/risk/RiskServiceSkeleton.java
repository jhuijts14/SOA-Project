
/**
 * RiskServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
    package org.loans.risk;

import org.loans.schema.ApprovalResponse;
import org.loans.schema.RiskAssessmentResponse;
    /**
     *  RiskServiceSkeleton java skeleton for the axisService
     */
    public class RiskServiceSkeleton implements RiskServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param creditInformationRequest0 
             * @return riskAssessmentResponse1 
             * @throws ErrorMessage 
         */
        
                 public org.loans.schema.RiskAssessmentResponse check
                  (
                  org.loans.schema.CreditInformationRequest creditInformationRequest0
                  )
            throws ErrorMessage{
                	 
                	 RiskAssessmentResponse result = new RiskAssessmentResponse();
                	 if (Math.random() < 0.7)
                		 result.setAccept("low");
                	 else result.setAccept("high");
                	 return result;
                //TODO : fill this with the necessary business logic
                // throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#check");
        }
     
    }