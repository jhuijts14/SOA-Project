
/**
 * RepairBillingServicePortSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.repairbillingservice;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

/**
     *  RepairBillingServicePortSkeletonInterface java skeleton interface for the axisService
     */
    public interface RepairBillingServicePortSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param deliveryConfirmation
         * @throws AxisFault 
         * @throws RemoteException 
         */

        
                public void sendBill
                (
                  localhost.soaproject.services.repairbillingservice.DeliveryConfirmation deliveryConfirmation
                 ) throws AxisFault, RemoteException
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param bill
         * @throws AxisFault 
         * @throws RemoteException 
         */

        
                public void calculateTotalCost
                (
                  localhost.soaproject.services.repairbillingservice.Bill bill
                 ) throws AxisFault, RemoteException
            ;
        
         }
    