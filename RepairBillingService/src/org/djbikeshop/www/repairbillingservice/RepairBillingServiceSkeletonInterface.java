
/**
 * RepairBillingServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.djbikeshop.www.repairbillingservice;

import java.io.IOException;
import java.rmi.RemoteException;

/**
     *  RepairBillingServiceSkeletonInterface java skeleton interface for the axisService
     */
    public interface RepairBillingServiceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param bill
         * @throws IOException 
         */

        
                public void calculateTotalCost
                (
                  org.djbikeshop.www.repairbillingservice.Bill bill
                 ) throws IOException
            ;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param deliveryConfirmation
         * @throws RemoteException 
         */

        
                public void sendBill
                (
                  org.djbikeshop.www.repairbillingservice.DeliveryConfirmation deliveryConfirmation
                 ) throws RemoteException
            ;
        
         }
    