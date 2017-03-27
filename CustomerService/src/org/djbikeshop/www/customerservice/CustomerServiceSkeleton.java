
/**
 * CustomerServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.djbikeshop.www.customerservice;

import java.math.BigDecimal;
import java.util.Scanner;

import org.djbikeshop.www.commontypes.*;

/**
     *  CustomerServiceSkeleton java skeleton for the axisService
     */
    public class CustomerServiceSkeleton implements CustomerServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param pickUpNotification0 
             * @return  
         */
        
                 public void notifyPickUp
                  (
                  org.djbikeshop.www.customerservice.PickUpNotification pickUpNotification0
                  )
            {
                //TODO : fill this with the necessary business logic
                	 
               // Retrieve the information from the request message;
                	String customerName = pickUpNotification0.getPickUpNotification().getCustomerName().getFirstName() 
                			+ " " + pickUpNotification0.getPickUpNotification().getCustomerName().getLastName();
                	
                	String pickUpAddress = pickUpNotification0.getPickUpNotification().getPickUpAddress().getStreet() 
                			+ " " + pickUpNotification0.getPickUpNotification().getPickUpAddress().getHouseNumber() 
                			+ ", " + pickUpNotification0.getPickUpNotification().getPickUpAddress().getCity() 
                			+ " " + pickUpNotification0.getPickUpNotification().getPickUpAddress().getPostCode();
                	 
                	String pickUpDateTime = pickUpNotification0.getPickUpNotification().getPickUpDateTime().getTransportationTimeType().getTime() + "";
                	
                	
               // Simulate the notification of the pick up date time by printing the following;
                     System.out.println("===============================================================");
                     System.out.println("Hello " + customerName + "!");
                     System.out.println("Your bike will be picked up at " + pickUpDateTime + ".");
                     System.out.println("===============================================================");

                
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param approvalRequest1 
             * @return approvalResponse2 
         */
        
                 public org.djbikeshop.www.customerservice.ApprovalResponse getApprovalDeliveryAddress
                  (
                  org.djbikeshop.www.customerservice.ApprovalRequest approvalRequest1
                  )
            {
                //TODO : fill this with the necessary business logic
                
                	// Retrieve the information from the request message;
                 	String customerName = approvalRequest1.getApprovalRequest().getCustomer().getCustomerName().getFirstName() 
                 			+ " " + approvalRequest1.getApprovalRequest().getCustomer().getCustomerName().getLastName();
                 	
                 	int repairTime = approvalRequest1.getApprovalRequest().getRepairTime().getRepairTimeType();
                 	
                 	double repairCost = approvalRequest1.getApprovalRequest().getRepairCost().getCostType().doubleValue();
                 
                	 
                	// Simulate the notification of the repair time and cost by printing the following;
                     System.out.println("===============================================================");
                     System.out.println("Hello " + customerName + "!");
                     System.out.println("The repair of your bike will take " + repairTime + " minutes!");
                     System.out.println("The repair of your bike will cost € " + repairCost + ".");
                     System.out.println("===============================================================");

                     int selection = 1;
 
                     Scanner scanner = new Scanner(System.in);
                     
                     // Display the approval request;
                     System.out.println("Repair Approval Request");
                     // User Scanner to get the option chosen;
                     System.out.println("There are two option 1 to approve or 2 to cancel!");
                     System.out.println("(This also generates the same delivery address for both options)");
                     System.out.println("Do you want to approve or cancel the repair?");
                     selection = scanner.nextInt();
                     
                     
                     // Create approval response and the address variables;
                     org.djbikeshop.www.commontypes.ApprovalResponseType apprResp = org.djbikeshop.www.commontypes.ApprovalResponseType.Approved;
                     
                     
                     AddressType addressT = new AddressType();
                     
                   //OPTIONS FOR INPUT ARE:
                     //Only one address: Getfertweg 5, 7512BA Enschede
                     // ApprovalResponse either true for 1 or false for 2;
                     
                     if (selection == 1) {
                         
                         // Leave apprResp as "Approved";
                    	 // Generate correct address;
                    	 addressT.setStreet("Getfertweg");
                    	 addressT.setHouseNumber(5);
                    	 addressT.setPostCode("7512BA");
                    	 addressT.setCity("Enschede");
                         
                
                 } else if (selection == 2) {
                         
                	 // change apprResp to "Canceled";
                	 apprResp = org.djbikeshop.www.commontypes.ApprovalResponseType.Cancelled;
                	 
                	 // Generate correct address;
                	 addressT.setStreet("Getfertweg");
                	 addressT.setHouseNumber(5);
                	 addressT.setPostCode("7512BA");
                	 addressT.setCity("Enschede");
                         
                 }
                     
                // Now generate the return message type and everything needed for the return message;
                ApprovalResponseType apprRespT = new ApprovalResponseType();
                     
               // Retrieve the customer's repair ID;
               RepairIDType repID = approvalRequest1.getApprovalRequest().getCustomer().getRepairID();
               
               apprRespT.setApprovalResponse(apprResp);
               apprRespT.setDeliveryAddress(addressT);
               apprRespT.setRepairID(repID);
               
               // Generate the return message and set the type;
               ApprovalResponse approvalResponse2 = new ApprovalResponse();
               approvalResponse2.setApprovalResponse(apprRespT);
               
               return approvalResponse2;
               
               
        }
     
    }
    