
/**
 * BillingCallbackServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.billingcallbackservice;

import localhost.soaproject.services.commontypes.*;

/**
     *  BillingCallbackServiceSkeleton java skeleton for the axisService
     */
    public class BillingCallbackServiceSkeleton implements BillingCallbackServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param billSentConfirmation0 
             * @return  
         */
        
                 public void confirmBillSent
                  (
                  localhost.soaproject.services.billingcallbackservice.BillSentConfirmation billSentConfirmation0
                  )
            {
                	 //TODO : fill this with the necessary business logic
                     
                	 //Define local variables for the confirmation message and its associated repair ID;
                     RepairIDType repairID = new RepairIDType();
                     ConfirmationType confirmBillSent = new ConfirmationType();
                          
                     //Retrieve confirmation, repair ID from message;
                     repairID.setRepairIDType(billSentConfirmation0.getBillSentConfirmation().getRepairID().getRepairIDType());
                     confirmBillSent.setConfirmationType(billSentConfirmation0.getBillSentConfirmation().getConfirmation().getConfirmationType());
                     
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param totalCostConfirmation1 
             * @return  
         */
        
                 public void confirmTotalCost
                  (
                  localhost.soaproject.services.billingcallbackservice.TotalCostConfirmation totalCostConfirmation1
                  )
            {
                //TODO : fill this with the necessary business logic
                
                	//Define local variables for the confirmation message and its associated repair ID;
                     RepairIDType repairID = new RepairIDType();
                     ConfirmationType confirmDelivered = new ConfirmationType();
                               
                      //Retrieve confirmation, repair ID from message;
                      repairID.setRepairIDType(totalCostConfirmation1.getTotalCostConfirmation().getRepairID().getRepairIDType());
                      confirmDelivered.setConfirmationType(totalCostConfirmation1.getTotalCostConfirmation().getConfirmation().getConfirmationType());
        }
     
    }
    