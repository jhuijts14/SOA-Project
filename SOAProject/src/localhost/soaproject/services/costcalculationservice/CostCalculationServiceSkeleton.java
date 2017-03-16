
/**
 * CostCalculationServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.costcalculationservice;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import localhost.soaproject.services.commontypes.*;

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
        
                 public localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse calculateRepairCost
                  (
                  localhost.soaproject.services.costcalculationservice.CalculateRepairCost calculateRepairCost0
                  )
            {
                //TODO : fill this with the necessary business logic
                	 {
                         //TODO : fill this with the necessary business logic
                              // Make local variables for the Repair Time and array for the prices of the bike parts;
                              int repairTime;
                              int numberOfParts = calculateRepairCost0.getCalculateRepairCostRequest().getNumberOfParts();
                              PriceType[] priceOfParts = new PriceType[numberOfParts];
                              
                              // The repairCost that will be calculated.
                              double repairCost;
                              
                              // The labour rate of the repair shop.
                              double labourRate = 15; //€ per labour hour;
                              
                              // Retrieve the repair time;
                              repairTime = calculateRepairCost0.getCalculateRepairCostRequest().getRepairTime().getRepairTimeType();
                             
                             // Retrieve the bike part prices from the request message;
                              
                              while (numberOfParts > 0) {
                                 
                                  BikePartType[] bikePartArray = calculateRepairCost0.getCalculateRepairCostRequest().localBikePart;
                                  priceOfParts[numberOfParts - 1] = bikePartArray[numberOfParts - 1].getPrice();
                                  numberOfParts--;
                              }
                              
                              // Calculate the repair costs (repair time in minutes so need the labour rate per minute);
                              repairCost = repairTime * labourRate/60;
                              
                              for (int i = 0; i < priceOfParts.length; i++) {
                            	  repairCost += priceOfParts[i].getPriceType().doubleValue();
                              }
                              
                              /*
                              // If there are bike parts in the inspections add them to the repair cost;
                              // Since inspection results are simulated we know there are either 0, 1 or 3;
                              if (priceOfParts.length == 1) {
                                  repairCost += priceOfParts[0].getPriceType().doubleValue();
                              } else if (priceOfParts.length == 3) {
                                  repairCost += priceOfParts[0].getPriceType().doubleValue() 
                                          + priceOfParts[1].getPriceType().doubleValue() 
                                          + priceOfParts[2].getPriceType().doubleValue();
                              }
                              */
                              // Create a BigDecimal object to store the repair cost.
                              CostType BigDecRepCost = new CostType();
                              BigDecRepCost.setCostType((new BigDecimal(repairCost)).setScale(2, RoundingMode.HALF_EVEN));
                              
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
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param calculateTransportCost2 
             * @return calculateTransportCostResponse3 
         */
        
                 public localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse calculateTransportCost
                  (
                  localhost.soaproject.services.costcalculationservice.CalculateTransportCost calculateTransportCost2
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
                     transCostType.setCostType(transCost.round(new MathContext(2, RoundingMode.CEILING)));
                     
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
    