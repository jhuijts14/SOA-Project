
/**
 * RepairBillingServicePortSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.repairbillingservice;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub;
import localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.BillSentConfirmation;
import localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.BillSentConfirmationType;
import localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.ConfirmTotalCost;
import localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.CostConfirmationType;
import localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.TotalCostConfirmation;
import localhost.soaproject.services.commontypes.*;

/**
     *  RepairBillingServicePortSkeleton java skeleton for the axisService
     */
    public class RepairBillingServicePortSkeleton implements RepairBillingServicePortSkeletonInterface{
        
         // variable recorded for the billing department;
    	Bill bill;
    	double totalCost;
        /**
         * Auto generated method signature
         * 
                                     * @param deliveryConfirmation0 
             * @return  
         * @throws RemoteException 
         */
        
                 public void sendBill
                  (
                  localhost.soaproject.services.repairbillingservice.DeliveryConfirmation deliveryConfirmation0
                  ) throws RemoteException
            {
                //TODO : fill this with the necessary business logic
                	 
                	 // Retrieve the associated repairID and confirmation;
                     //Define local variables for the confirmation message and its associated repair ID;
                	// Retrieve the appropriate Repair ID;
                     String repairID = deliveryConfirmation0.getDeliveryConfirmation().getRepairID().getRepairIDType();
                     localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.RepairIDType stubRepairID = new localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.RepairIDType();
                     stubRepairID.setRepairIDType(repairID);
                     
                     //Retrieve confirmation, repair ID from message;
                     localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.ConfirmationType confirmType = new localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.ConfirmationType();
                     confirmType.setConfirmationType(deliveryConfirmation0.getDeliveryConfirmation().getDeliveryConfirmation().getConfirmationType());
                          
                     // Create Confirm Cost Type message to be sent to the callback service:
                     localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.BillSentConfirmationType confirmSentType = new BillSentConfirmationType();
                     confirmSentType.setRepairID(stubRepairID);
                     confirmSentType.setConfirmation(confirmType);
                     
                     // Create the Total Cost Confirmation object to be sent to the callback service;
                     BillSentConfirmation stubBillSentConfirm = new BillSentConfirmation();
                     stubBillSentConfirm.setBillSentConfirmation(confirmSentType);
                     
                     BillingCallbackServiceStub billCallSerStub = new BillingCallbackServiceStub();
                     billCallSerStub.confirmBillSent(stubBillSentConfirm);
                     
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
         * @throws RemoteException 
         */
        
                 public void calculateTotalCost
                  (
                  localhost.soaproject.services.repairbillingservice.Bill bill1
                  ) throws RemoteException
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
                     
                     // Print total cost on system to see if cost is calculated;
                     System.out.println("The total cost of the repair service is: " + totalCost + " $");
                     
                     // Retrieve the information needed for the bill to be stored by the billing department;
                     bill = bill1;
                     
                     // Invoke the Confirm Total Cost operation for the Billing services callback service;
                     // Retrieve the appropriate Repair ID;
                     String repairID = bill1.getBill().getCustomerInformation().getRepairID().getRepairIDType();
                     localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.RepairIDType stubRepairID = new localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.RepairIDType();
                     stubRepairID.setRepairIDType(repairID);
                     
                     // Create boolean that confirms total cost has been calculated and billing process is initiated;
                     boolean confirmation = true;
                     localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.ConfirmationType confirmType = new localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.ConfirmationType();
                     confirmType.setConfirmationType(confirmation);
                     
                     
                     // Create Confirm Cost Type message to be sent to the callback service:
                     localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.CostConfirmationType confirmCostType = new CostConfirmationType();
                     confirmCostType.setRepairID(stubRepairID);
                     confirmCostType.setConfirmation(confirmType);
                     
                     // Create the Total Cost Confirmation object to be sent to the callback service;
                     TotalCostConfirmation stubTotCostConfirm = new TotalCostConfirmation();
                     stubTotCostConfirm.setTotalCostConfirmation(confirmCostType);
                     
                     BillingCallbackServiceStub billCallSerStub = new BillingCallbackServiceStub();
                     billCallSerStub.confirmTotalCost(stubTotCostConfirm);
                     
                
        }
     
    }
    