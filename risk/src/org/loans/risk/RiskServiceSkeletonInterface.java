
/**
 * RiskServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.loans.risk;
    /**
     *  RiskServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RiskServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param creditInformationRequest
             * @throws ErrorMessage : 
         */

        
                public org.loans.schema.RiskAssessmentResponse check
                (
                  org.loans.schema.CreditInformationRequest creditInformationRequest
                 )
            throws ErrorMessage;
        
         }
    