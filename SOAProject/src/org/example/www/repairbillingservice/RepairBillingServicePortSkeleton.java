
/**
 * RepairBillingServicePortSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.example.www.repairbillingservice;

import org.example.www.commontypes.ConfirmationType;
import org.example.www.commontypes.RepairIDType;

/**
     *  RepairBillingServicePortSkeleton java skeleton for the axisService
     */
    public class RepairBillingServicePortSkeleton implements RepairBillingServicePortSkeletonInterface{
        
        
    	// Information variables stored for the bill department;
    	double totalCost;
    	Bill bill;
    	
        /**
         * Auto generated method signature
         * 
                                     * @param deliveryConfirmation0 
             * @return  
         */
        
                 public void sendBill
                  (
                  org.example.www.repairbillingservice.DeliveryConfirmation deliveryConfirmation0
                  )
            {
                //TODO : fill this with the necessary business logic
                
                // Retrieve the associated repairID and confirmation;
                //Define local variables for the confirmation message and its associated repair ID;
                RepairIDType repairID = new RepairIDType();
                ConfirmationType confirmDelComplete = new ConfirmationType();
                     
                 //Retrieve confirmation, repair ID from message;
                confirmDelComplete.setConfirmationType(deliveryConfirmation0.getDeliveryConfirmation().getDeliveryConfirmation().getConfirmationType());
                repairID.setRepairIDType(deliveryConfirmation0.getDeliveryConfirmation().getRepairID().getRepairIDType());
                	 
                	 // Simulate sending the bill by printing the following;
                	 System.out.println("===============================================================");
                	 System.out.println("Customer Details:");
                	 System.out.println("Customer Name: " 
                			 + bill.getBill().getCustomerInformation().getCustomerName().getFirstName() + " " 
                			 + bill.getBill().getCustomerInformation().getCustomerName().getLastName());
                	 System.out.println("RepairID: " + bill.getBill().getCustomerInformation().getRepairID().getRepairIDType());
                	 System.out.println("The total cost of the repair service is: " + totalCost + " $");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param bill1 
             * @return  
         */
        
                 public void calculateTotalCost
                  (
                  org.example.www.repairbillingservice.Bill bill1
                  )
            {
                //TODO : fill this with the necessary business logic
                	 
                	 // Define local variables for the 3 costs;
                     double pickUpCost, repairCost, deliveryCost;
                     
                     // Define local variable for the approval response of the customer;
                     String approvalResp;
                     
                     //Retrieve all the information needed to calculate The Total Cost;
                     pickUpCost   = bill1.getBill().getPickUpCost().getCostType().doubleValue();
                     repairCost   = bill1.getBill().getRepairCost().getCostType().doubleValue();
                     deliveryCost = bill1.getBill().getDeliveryCost().getCostType().doubleValue();
                     
                     approvalResp = bill1.getBill().getApprovalResponse().getValue();
                     
                     // Calculate the total cost (only include the repair cost if the repair was approved);
                     totalCost = pickUpCost + deliveryCost;
                     
                     if (approvalResp.equals("Approved")) {
                     	totalCost += repairCost;
                     }
                     
                     // Retrieve the information needed for the bill to be stored by the billing department;
                     bill = bill1;
                     
                     // Invoke the Confirm Total Cost operation for the Billing services callback service;
                     // Retrieve the appropriate Repair ID;
                     RepairIDType repairID = bill1.getBill().getCustomerInformation().getRepairID();
                     // Create boolean that confirms total cost has been calculated and billing process is initiated;
                     boolean confirmation = true;
                
        }
     
    }
    