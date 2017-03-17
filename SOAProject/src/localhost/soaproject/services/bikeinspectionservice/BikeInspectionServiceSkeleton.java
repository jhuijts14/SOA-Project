
/**
 * BikeInspectionServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.bikeinspectionservice;

import java.math.BigDecimal;
import java.util.Scanner;

import localhost.soaproject.services.commontypes.*;

/**
     *  BikeInspectionServiceSkeleton java skeleton for the axisService
     */
    public class BikeInspectionServiceSkeleton implements BikeInspectionServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param inspectBike0 
             * @return inspectBikeResponse1 
         */
        
                 public localhost.soaproject.services.bikeinspectionservice.InspectBikeResponse inspectBike
                  (
                  localhost.soaproject.services.bikeinspectionservice.InspectBike inspectBike0
                  )
            {
                //TODO : fill this with the necessary business logic
                	 // Retrieve repair ID from request message;
                     RepairIDType repairID = inspectBike0.getInspectBikeRequest().getRepairID();
                     
                     // Define local variables;
                     int repairTime, numberOfParts;
                     RepairTimeType repairTimeType = new RepairTimeType();
                     
                     Scanner scanner = new Scanner(System.in);
                     
                     // Display repair ID of bike being inspected;
                     System.out.print("Hello, you are inspecting this bike: " + repairID.getRepairIDType());
                     // User Scanner to get Repair time and number of parts;
                     System.out.print("How much time is needed for the repair? ");
                     repairTime = scanner.nextInt();
                     repairTimeType.setRepairTimeType(repairTime);
                     System.out.println("How many bike parts are needed? (either 0, 1 or 3) ");
                     numberOfParts = scanner.nextInt();
                     
                     // Simulate the bike parts to be added depending the number of parts;
                     BikePartType[] bikePartTypes = new BikePartType [numberOfParts];
                     
                     // If numberOfParts = 0, there are no bike parts to add;
                     
                     if (numberOfParts == 1) {
                             
                             // Create a bike part called a wheel;
                             BikePartType bikePart = new BikePartType();
                             bikePart.setName("Wheel");
                             PriceType wheelPrice = new PriceType();
                             wheelPrice.setPriceType(new BigDecimal(15));
                             bikePart.setPrice(wheelPrice);
                             
                             // Add the part to the array of bike parts;
                             bikePartTypes[0] = bikePart;
                    
                     } else if (numberOfParts == 3) {
                             
                             // Create a bike part called a wheel;
                             BikePartType bikePart1 = new BikePartType();
                             bikePart1.setName("Wheel");
                             PriceType wheelPrice = new PriceType();
                             wheelPrice.setPriceType(new BigDecimal(15));
                             bikePart1.setPrice(wheelPrice);
                             
                             // Create a bike part called a seat;
                             BikePartType bikePart2 = new BikePartType();
                             bikePart2.setName("Seat");
                             PriceType seatPrice = new PriceType();
                             seatPrice.setPriceType(new BigDecimal(25));
                             bikePart2.setPrice(seatPrice);
                             
                             // Create a bike part called a chain;
                             BikePartType bikePart3 = new BikePartType();
                             bikePart3.setName("Chain");
                             PriceType chainPrice = new PriceType();
                             chainPrice.setPriceType(new BigDecimal(10));
                             bikePart3.setPrice(chainPrice);
                             
                             // Add the parts to the array of bike parts;
                             bikePartTypes[0] = bikePart1;
                             bikePartTypes[1] = bikePart2;
                             bikePartTypes[2] = bikePart3;
                     }
                     
                     /*
                     repairTime = 2;
                     RepairTimeType repairTimeType = new RepairTimeType();
                     repairTimeType.setRepairTimeType(repairTime);
                     
                     numberOfParts = 0;
                     */
                     
                     // Create the inspection results type object;
                     InspectionResultsType inspectResultsType = new InspectionResultsType();
                     inspectResultsType.setRepairID(repairID);
                     inspectResultsType.setRepairTime(repairTimeType);
                     inspectResultsType.setNumberOfParts(numberOfParts);
                     inspectResultsType.setBikePart(bikePartTypes);
                     
                     // Create and return the inspection response message;
                     InspectBikeResponse inspectBikeResponse1 = new InspectBikeResponse();
                     inspectBikeResponse1.setInspectBikeResponse(inspectResultsType);
                     
                     return inspectBikeResponse1;
        }
     
    }
    