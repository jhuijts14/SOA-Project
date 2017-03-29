
/**
 * BillingCallbackServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.djbikeshop.www.billingcallbackservice;

import org.djbikeshop.www.commontypes.*;

/**
     *  BillingCallbackServiceSkeleton java skeleton for the axisService
     */
    public class BillingCallbackServiceSkeleton implements BillingCallbackServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param totalCostConfirmation0 
             * @return  
         */
        
                 public void confirmTotalCost
                  (
                  org.djbikeshop.www.billingcallbackservice.TotalCostConfirmation totalCostConfirmation0
                  )
            {
                //TODO : fill this with the necessary business logic
                	//Define local variables for the confirmation message and its associated repair ID;
                     RepairIDType repairID = new RepairIDType();
                     ConfirmationType confirmDelivered = new ConfirmationType();
                               
                      //Retrieve confirmation, repair ID from message;
                      repairID.setRepairIDType(totalCostConfirmation0.getTotalCostConfirmation().getRepairID().getRepairIDType());
                      confirmDelivered.setConfirmationType(totalCostConfirmation0.getTotalCostConfirmation().getConfirmation().getConfirmationType());
                      
                      System.out.println("Total Cost on bill was calculated for repair ID " + repairID.getRepairIDType() + "and the billing process has begun");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param billSentConfirmation1 
             * @return  
         */
        
                 public void confirmBillSent
                  (
                  org.djbikeshop.www.billingcallbackservice.BillSentConfirmation billSentConfirmation1
                  )
            {
                //TODO : fill this with the necessary business logic
                	//Define local variables for the confirmation message and its associated repair ID;
                     RepairIDType repairID = new RepairIDType();
                     ConfirmationType confirmBillSent = new ConfirmationType();
                          
                     //Retrieve confirmation, repair ID from message;
                     repairID.setRepairIDType(billSentConfirmation1.getBillSentConfirmation().getRepairID().getRepairIDType());
                     confirmBillSent.setConfirmationType(billSentConfirmation1.getBillSentConfirmation().getConfirmation().getConfirmationType());
                    
                     System.out.println("Bill was sent to customer with repair ID " + repairID.getRepairIDType() + "!");
                                
        }
     
    }
    