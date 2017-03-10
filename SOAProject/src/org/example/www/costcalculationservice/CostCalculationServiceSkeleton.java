
/**
 * CostCalculationServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.example.www.costcalculationservice;

import java.math.BigDecimal;

import org.example.www.commontypes.BikePartType;
import org.example.www.commontypes.CostType;
import org.example.www.commontypes.Price;

/**
     *  CostCalculationServiceSkeleton java skeleton for the axisService
     */
    public class CostCalculationServiceSkeleton implements CostCalculationServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param calculateRepairCost0 
             * @return calculateRepairCostResponse1 
         */
        
                 public org.example.www.costcalculationservice.CalculateRepairCostResponse calculateRepairCost
                  (
                  org.example.www.costcalculationservice.CalculateRepairCost calculateRepairCost0
                  )
            {
                //TODO : fill this with the necessary business logic
                	 // Make local variables for the Repair Time and array for the prices of the bike parts;
                     int repairTime;
                     int numberOfParts = calculateRepairCost0.getCalculateRepairCostRequest().getNumberOfParts();
                     Price[] priceOfParts = new Price[numberOfParts];
                     
                     // The repairCost that will be calculated.
                     double repairCost;
                     
                     // The labour rate of the repair shop.
                     double labourRate = 15; //$ per labour hour;
                     
                     // Retrieve the repair time;
                     repairTime = calculateRepairCost0.getCalculateRepairCostRequest().getRepairTime().getRepairTimeType();
                    
                    // Retrieve the bike part prices from the request message;
                     
                     while (numberOfParts > 0) {
                     	
                    	 BikePartType[] bikePartArray = calculateRepairCost0.getCalculateRepairCostRequest().localBikePart;
                    	 priceOfParts[numberOfParts - 1] = bikePartArray[numberOfParts - 1].getPrice();
                    	 numberOfParts--;
                     }
                     
                     // Calculate the repair costs;
                     repairCost = repairTime * labourRate;
                     
                     // If there are bike parts in the inspections add them to the repair cost;
                     // Since inspection results are simulated we know there are either 0, 1 or 3;
                     if (priceOfParts.length == 1) {
                    	 repairCost += priceOfParts[0].getPrice().doubleValue();
                     } else if (priceOfParts.length == 3) {
                    	 repairCost += priceOfParts[0].getPrice().doubleValue() 
                    			 + priceOfParts[1].getPrice().doubleValue() 
                    			 + priceOfParts[2].getPrice().doubleValue();
                     }
                     
                     // Create a BigDecimal object to store the repair cost.
                     CostType BigDecRepCost = new CostType();
                     BigDecRepCost.setCostType(new BigDecimal(repairCost));
                     
                     // Create the repair cost response to be sent back;
                     RepairCostResponseType repCostResponse = new RepairCostResponseType();
                     repCostResponse.setRepairID(calculateRepairCost0.getCalculateRepairCostRequest().getRepairID());
                     repCostResponse.setRepairCost(BigDecRepCost);
                     
                     // Set the response to the cost and ID you created.
                     CalculateRepairCostResponse calculateRepairCostResponse1 = new CalculateRepairCostResponse();
                     calculateRepairCostResponse1.setCalculateRepairCostResponse(repCostResponse);
                     
                     // Return the response;
                     return calculateRepairCostResponse1;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param calculateTransportCost2 
             * @return calculateTransportCostResponse3 
         */
        
                 public org.example.www.costcalculationservice.CalculateTransportCostResponse calculateTransportCost
                  (
                  org.example.www.costcalculationservice.CalculateTransportCost calculateTransportCost2
                  )
            {
                //TODO : fill this with the necessary business logic
               
                 	 
                     // Define local variables for the transportation distance and rate;
                     BigDecimal distance = calculateTransportCost2.getCalculateTransportCostRequest().getTransportationDistance().getTransportationDistanceType();
                     BigDecimal transRate = new BigDecimal(0.45); //$ per km
                     		
                     // Local variable for the calculated transportation costs;
                     BigDecimal transCost = distance.multiply(transRate);
                     
                     // Make that BigDecimal a CostType object;
                     CostType transCostType = new CostType();
                     transCostType.setCostType(transCost);
                     
                     // Create the transportation cost response type to be sent;
                     TransportationCostResponseType transCostRespType = new TransportationCostResponseType();
                     transCostRespType.setRepairID(calculateTransportCost2.getCalculateTransportCostRequest().getRepairID());
                     transCostRespType.setTransportationCost(transCostType);
                     
                     // Create a response message to be sent back;
                     CalculateTransportCostResponse calculateTransportCostResponse3 = new CalculateTransportCostResponse();
                     calculateTransportCostResponse3.setCalculateTransportCostResponse(transCostRespType);
                     
                     // return the response.
                     return calculateTransportCostResponse3;
        }
     
    }
    