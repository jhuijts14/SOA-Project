
/**
 * RepairBillingServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.repairbillingservice;
    /**
     *  RepairBillingServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RepairBillingServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param deliveryConfirmation
         */

        
                public void sendBill
                (
                  localhost.soaproject.services.repairbillingservice.DeliveryConfirmation deliveryConfirmation
                 )
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param bill
         */

        
                public void calculateTotalCost
                (
                  localhost.soaproject.services.repairbillingservice.Bill bill
                 )
            ;
        
         }
    