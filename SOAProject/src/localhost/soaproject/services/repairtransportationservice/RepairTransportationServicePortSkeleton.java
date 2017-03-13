
/**
 * RepairTransportationServicePortSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.repairtransportationservice;
    
    import java.math.BigDecimal;
    import java.util.Scanner;

    import localhost.soaproject.services.commontypes.*;
    /**
     *  RepairTransportationServicePortSkeleton java skeleton for the axisService
     */
    public class RepairTransportationServicePortSkeleton implements RepairTransportationServicePortSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param updateDeliveryTime0 
             * @return updateDeliveryTimeResponse1 
         */
        
                 public localhost.soaproject.services.repairtransportationservice.UpdateDeliveryTimeResponse updateDeliveryTime
                  (
                  localhost.soaproject.services.repairtransportationservice.UpdateDeliveryTime updateDeliveryTime0
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#updateDeliveryTime");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getTransportationDistance2 
             * @return getTransportationDistanceResponse3 
         */
        
                 public localhost.soaproject.services.repairtransportationservice.GetTransportationDistanceResponse getTransportationDistance
                  (
                  localhost.soaproject.services.repairtransportationservice.GetTransportationDistance getTransportationDistance2
                  )
            {
                //TODO : fill this with the necessary business logic
                	 // Retrieve repair ID from request mmessage;
                RepairIDType repairID = getTransportationDistance2.getGetTransportationDistanceRequest().getRepair();
                int houseNumber = getTransportationDistance2.getGetTransportationDistanceRequest().getAddress().getHouseNumber();
                
                //Define Local Variable;
                String address;
                BigDecimal bd = new BigDecimal(1.0);
                TransportationDistanceType  transportationDistanceType = new TransportationDistanceType();
                
                //Scanner scanner = new Scanner(System.in);
                
                //User Scanner to get Customers Address;
                //System.out.print("What is the address where the bike will be picked up? ");
                //address = scanner.nextLine();
                // Simulate the distances depending on the address input
               // TransportationDistanceType[] transportationDistance = new TransportationDistanceType [1];
                
                //OPTIONS FOR INPUT ARE:
                //Getfertweg 5 7512BA
                //Hofstraat 41 7511HD
                //Marie de Roodelaan 42 7545RT
                
                if (houseNumber == 5) {
                	bd = 6.2;
                } else if (houseNumber == 41){
                	bd = 7.1;
                } else if (houseNumber == 42){
                	bd = 4.5;
                }
                // Set TransportationDistance
            	transportationDistanceType.setTransportationDistanceType(distance);                
                
                //Create the distance response type
                DistanceResponseType distanceResponseType = new DistanceResponseType();
                distanceResponseType.setRepair(repairID);
                distanceResponseType.setTransportationDistance(transportationDistanceType);
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getTransportationTime4 
             * @return getTransportationTimeResponse5 
         */
        
                 public localhost.soaproject.services.repairtransportationservice.GetTransportationTimeResponse getTransportationTime
                  (
                  localhost.soaproject.services.repairtransportationservice.GetTransportationTime getTransportationTime4
                  )
            {
                //TODO : fill this with the necessary business logic
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#getTransportationTime");
        }
     
    }
    