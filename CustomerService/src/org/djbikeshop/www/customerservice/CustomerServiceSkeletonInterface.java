
/**
 * CustomerServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.djbikeshop.www.customerservice;
    /**
     *  CustomerServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface CustomerServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param deliveryNotification
         */

        
                public void notifyDelivery
                (
                  org.djbikeshop.www.customerservice.DeliveryNotification deliveryNotification
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param approvalRequest
         */

        
                public org.djbikeshop.www.customerservice.ApprovalResponse getApprovalDeliveryAddress
                (
                  org.djbikeshop.www.customerservice.ApprovalRequest approvalRequest
                 )
            ;
        
         }
    