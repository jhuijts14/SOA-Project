
/**
 * ApprovalServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.loans.approval;
    /**
     *  ApprovalServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface ApprovalServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param creditInformationRequest
             * @throws ErrorMessage : 
         */

        
                public org.loans.schema.ApprovalResponse approve
                (
                  org.loans.schema.CreditInformationRequest creditInformationRequest
                 )
            throws ErrorMessage;
        
         }
    