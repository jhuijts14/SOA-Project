
/**
 * RepairBillingServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.djbikeshop.www.repairbillingservice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.djbikeshop.www.billingcallbackservice.*;
import org.djbikeshop.www.commontypes.*;

/**
     *  RepairBillingServiceSkeleton java skeleton for the axisService
     */
    public class RepairBillingServiceSkeleton implements RepairBillingServiceSkeletonInterface{
        
        // Variables used by both operations;
    	 Bill bill;
         double totalCost;
    	
    	
        /**
         * Auto generated method signature
         * 
                                     * @param bill0 
             * @return  
         * @throws IOException 
         */
        
                 public void calculateTotalCost
                  (
                  org.djbikeshop.www.repairbillingservice.Bill bill0
                  ) throws IOException
            {
                //TODO : fill this with the necessary business logic
                
                	// Define local variables for the 3 costs;
                     double pickUpCost, repairCost, deliveryCost;
                     
                     // Define local variable for the approval response and the repair ID of the customer;
                     String approvalResp, repairIDs;
                     
                     //Retrieve all the information needed to calculate The Total Cost;
                     pickUpCost   = bill0.getBill().getPickUpCost().getCostType().doubleValue();
                     repairCost   = bill0.getBill().getRepairCost().getCostType().doubleValue();
                     deliveryCost = bill0.getBill().getDeliveryCost().getCostType().doubleValue();
                     
                     
                     // Retrieve the repair ID and approval response;
                     approvalResp = bill0.getBill().getApprovalResponse().getValue();
                     repairIDs = bill0.getBill().getCustomerInformation().getRepairID().getRepairIDType();
                     
                     // Calculate the total cost (only include the repair cost if the repair was approved);
                     totalCost = pickUpCost + deliveryCost;
                     
                     if (approvalResp.equals("Approved")) {
                        totalCost += repairCost;
                     }
                     
                     // Print total cost on system to see if cost is calculated;
                     System.out.println("The total cost of the repair service is: $ " + totalCost + ".");
                     
                     // Retrieve the information needed for the bill to be stored by the billing department;
                     //bill = bill1;
                     
                     // For Simulation: Create a string that stores total cost and repair ID;
                     String content = repairIDs + " " + totalCost;
                     
                     // The name of the file to open.
                     String fileName = repairIDs + ".txt";

                    // System.out.println(System.getProperty("user.dir"));
                     Path filePath;
                     if (System.getProperty("os.name").startsWith("Windows")) {
                    	 filePath = Paths.get(fileName);
                     }
                     else {
                         String tmpDirPath = "/Users/joep/Documents/Twente/SOA/Project/Data";
                    	 filePath = Paths.get(tmpDirPath, fileName);                    	 
                     }
                     Files.write(filePath, content.getBytes(), StandardOpenOption.CREATE);
                    
                     
                     try{
                    	    PrintWriter writer = new PrintWriter(repairIDs + ".txt", "UTF-8");
                    	    writer.println(totalCost);
                    	    writer.close();
                    	} catch (IOException e) {
                    	   // do something
                    	}
                     
                    
                     // Invoke the Confirm Total Cost operation for the Billing services callback service;
                     // Retrieve the appropriate Repair ID;
                     
                     
                     String repairID = bill0.getBill().getCustomerInformation().getRepairID().getRepairIDType();
                     org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.RepairIDType stubRepairID = new org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.RepairIDType();
                     stubRepairID.setRepairIDType(repairID);
                     
                     // Create boolean that confirms total cost has been calculated and billing process is initiated;
                     boolean confirmation = true;
                     org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.ConfirmationType confirmType = new org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.ConfirmationType();
                     confirmType.setConfirmationType(confirmation);
                     
                     
                     // Create Confirm Cost Type message to be sent to the callback service:
                     org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.CostConfirmationType confirmCostType = new org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.CostConfirmationType();
                     confirmCostType.setRepairID(stubRepairID);
                     confirmCostType.setConfirmation(confirmType);
                     
                     // Create the Total Cost Confirmation object to be sent to the callback service;
                     org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.TotalCostConfirmation stubTotCostConfirm = new org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.TotalCostConfirmation();
                     stubTotCostConfirm.setTotalCostConfirmation(confirmCostType);
                     
                     BillingCallbackServiceStub billCallSerStub = new BillingCallbackServiceStub();
                     billCallSerStub.confirmTotalCost(stubTotCostConfirm);
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param deliveryConfirmation1 
             * @return  
         * @throws RemoteException 
         */
        
                 public void sendBill
                  (
                  org.djbikeshop.www.repairbillingservice.DeliveryConfirmation deliveryConfirmation1
                  ) throws RemoteException
            {
                //TODO : fill this with the necessary business logic
                
                	// Retrieve the associated repairID and confirmation;
                     //Define local variables for the confirmation message and its associated repair ID;
                	// Retrieve the appropriate Repair ID;
                     String repairID = deliveryConfirmation1.getDeliveryConfirmation().getRepairID().getRepairIDType();
                     BillingCallbackServiceStub.RepairIDType stubRepairID = new BillingCallbackServiceStub.RepairIDType();
                     stubRepairID.setRepairIDType(repairID);
                     
                     //Retrieve confirmation, repair ID from message;
                     org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.ConfirmationType confirmType = new org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.ConfirmationType();
                     confirmType.setConfirmationType(deliveryConfirmation1.getDeliveryConfirmation().getDeliveryConfirmation().getConfirmationType());
                          
                     // Create Confirm Cost Type message to be sent to the callback service:
                     org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.BillSentConfirmationType confirmSentType = new org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.BillSentConfirmationType();
                     confirmSentType.setRepairID(stubRepairID);
                     confirmSentType.setConfirmation(confirmType);
                     
                     // Create the Total Cost Confirmation object to be sent to the callback service;
                     org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.BillSentConfirmation stubBillSentConfirm = new org.djbikeshop.www.billingcallbackservice.BillingCallbackServiceStub.BillSentConfirmation();
                     stubBillSentConfirm.setBillSentConfirmation(confirmSentType);
                     
                     BillingCallbackServiceStub billCallSerStub = new BillingCallbackServiceStub();
                     billCallSerStub.confirmBillSent(stubBillSentConfirm);

                     String TotalCostReturn = null;
                     String fileName = repairID + ".txt";
                     Path filePath;
                     if (System.getProperty("os.name").startsWith("Windows")) {
                    	 filePath = Paths.get(fileName);
                     }
                     else {
                         String tmpDirPath = "/Users/joep/Documents/Twente/SOA/Project/Data";
                    	 filePath = Paths.get(tmpDirPath, fileName);                    	 
                     }
                     
                     try(BufferedReader br = new BufferedReader(new FileReader(filePath.toString()))) {
                    	    StringBuilder sb = new StringBuilder();
                    	    String line = br.readLine();

                    	    while (line != null) {
                    	        sb.append(line);
                    	        sb.append(System.lineSeparator());
                    	        line = br.readLine();
                    	    }
                    	    String everything = sb.toString();
                    	    TotalCostReturn = everything;
                    	} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                     
                     int totCostIndex = TotalCostReturn.lastIndexOf(repairID);
                     String totCost = TotalCostReturn.substring(totCostIndex + 1, TotalCostReturn.length());
                     
                     	// Simulate sending the bill by printing the following;
                         System.out.println("===============================================================");
                         System.out.println("Repair ID: " + repairID);
                         System.out.println("The total cost of the repair service is: $" + totCost);
                         System.out.println("===============================================================");
 
                
        }
     
    }
    