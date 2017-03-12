
/**
 * BillingCallbackServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.billingcallbackservice;
    /**
     *  BillingCallbackServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface BillingCallbackServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param billSentConfirmation
         */

        
                public void confirmBillSent
                (
                  localhost.soaproject.services.billingcallbackservice.BillSentConfirmation billSentConfirmation
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param totalCostConfirmation
         */

        
                public void confirmTotalCost
                (
                  localhost.soaproject.services.billingcallbackservice.TotalCostConfirmation totalCostConfirmation
                 )
            ;
        
         }
    