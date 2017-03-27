
/**
 * RepairBillingServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.repairbillingservice;
    
    import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.rmi.RemoteException;

    import org.apache.axis2.AxisFault;

import localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub;
import localhost.soaproject.services.billingcallbackservice.BillingCallbackServiceStub.*;
    import localhost.soaproject.services.commontypes.*;
    /**
     *  RepairBillingServiceSkeleton java skeleton for the axisService
     */

    public class RepairBillingServiceSkeleton implements RepairBillingServiceSkeletonInterface{
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

                     String TotalCostReturn = null;
                     try(BufferedReader br = new BufferedReader(new FileReader(repairID + ".txt"))) {
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
                     
                     	// Simulate sending the bill by printing the following;
                         System.out.println("===============================================================");
                         System.out.println("Repair ID: " + repairID);
                         System.out.println("The total cost of the repair service is: $" + TotalCostReturn);
                         System.out.println("===============================================================");
 
                     
                     
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param bill1 
             * @return  
         * @throws IOException 
         */
        
                 public void calculateTotalCost
                  (
                  localhost.soaproject.services.repairbillingservice.Bill bill1
                  ) throws IOException
            {
                //TODO : fill this with the necessary business logic
                	// Define local variables for the 3 costs;
                     double pickUpCost, repairCost, deliveryCost;
                     
                     // Define local variable for the approval response and the repair ID of the customer;
                     String approvalResp, repairIDs;
                     
                     //Retrieve all the information needed to calculate The Total Cost;
                     pickUpCost   = bill1.getBill().getPickUpCost().getCostType().doubleValue();
                     repairCost   = bill1.getBill().getRepairCost().getCostType().doubleValue();
                     deliveryCost = bill1.getBill().getDeliveryCost().getCostType().doubleValue();
                     
                     
                     // Retrieve the repair ID and approval response;
                     approvalResp = bill1.getBill().getApprovalResponse().getValue();
                     repairIDs = bill1.getBill().getCustomerInformation().getRepairID().getRepairIDType();
                     
                     // Calculate the total cost (only include the repair cost if the repair was approved);
                     totalCost = pickUpCost + deliveryCost;
                     
                     if (approvalResp.equals("Approved")) {
                        totalCost += repairCost;
                     }
                     
                     // Print total cost on system to see if cost is calculated;
                     System.out.println("The total cost of the repair service is: " + totalCost + " $");
                     
                     // Retrieve the information needed for the bill to be stored by the billing department;
                     //bill = bill1;
                     
                     // For Simulation: Create a string that stores total cost and repair ID;
                     String content = repairIDs + " " + totalCost;
                     
                     // The name of the file to open.
                     String fileName = repairIDs + ".txt";

                    // System.out.println(System.getProperty("user.dir"));
                     Files.write(Paths.get(fileName), content.getBytes(), StandardOpenOption.CREATE);
                    
                     
                     try{
                    	    PrintWriter writer = new PrintWriter(repairIDs + ".txt", "UTF-8");
                    	    writer.println(totalCost);
                    	    writer.close();
                    	} catch (IOException e) {
                    	   // do something
                    	}
                     
                    
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
    