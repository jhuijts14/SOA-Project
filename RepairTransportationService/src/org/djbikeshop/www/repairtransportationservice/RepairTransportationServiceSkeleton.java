/**
 * RepairTransportationServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package org.djbikeshop.www.repairtransportationservice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.djbikeshop.www.commontypes.*;


/**
     *  RepairTransportationServiceSkeleton java skeleton for the axisService
     */
    public class RepairTransportationServiceSkeleton implements RepairTransportationServiceSkeletonInterface{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param updateDeliveryTime0 
             * @return updateDeliveryTimeResponse1 
         */
        
                 public org.djbikeshop.www.repairtransportationservice.UpdateDeliveryTimeResponse updateDeliveryTime
                  (
                  org.djbikeshop.www.repairtransportationservice.UpdateDeliveryTime updateDeliveryTime0
                  )
            {
                //TODO : fill this with the necessary business logic
               
                	//pull out the inputs from the request
                     RepairIDType repairID = updateDeliveryTime0.getUpdateDeliveryTimeRequest().getRepairID();
                     Calendar cal = Calendar.getInstance();
                     cal = updateDeliveryTime0.getUpdateDeliveryTimeRequest().getDeliveryTime().getTransportationTimeType();
                     int repairTime = updateDeliveryTime0.getUpdateDeliveryTimeRequest().getRepairTime().getRepairTimeType();
                     
                     //Local Variable
                     TransportationTimeType transportationTimeType = new TransportationTimeType();
                     
                     //Add the repair time to the time to deliver
                     cal.add(Calendar.MINUTE, repairTime);
                     
                     //set transportationtimetype to new value
                     transportationTimeType.setTransportationTimeType(cal);
                     
                     
                     
                     UpdatedDeliveryTimeResponseType updatedDeliveryTimeResponseType = new UpdatedDeliveryTimeResponseType();
                     //Set return variables
                     updatedDeliveryTimeResponseType.setRepair(repairID);
                     updatedDeliveryTimeResponseType.setUpdatedDeliveryTime(transportationTimeType);
                     
                     //Call return
                     UpdateDeliveryTimeResponse updateDeliveryTimeResponse = new UpdateDeliveryTimeResponse();
                     updateDeliveryTimeResponse.setUpdateDeliveryTimeResponse(updatedDeliveryTimeResponseType);
                     
                     return updateDeliveryTimeResponse;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getTransportationDistance2 
             * @return getTransportationDistanceResponse3 
         */
        
                 public org.djbikeshop.www.repairtransportationservice.GetTransportationDistanceResponse getTransportationDistance
                  (
                  org.djbikeshop.www.repairtransportationservice.GetTransportationDistance getTransportationDistance2
                  )
            {
                //TODO : fill this with the necessary business logic
                	// Retrieve repair ID and Address (houseNumber for simplicity) from request message;
                     RepairIDType repairID = getTransportationDistance2.getGetTransportationDistanceRequest().getRepair();
                     int houseNumber = getTransportationDistance2.getGetTransportationDistanceRequest().getAddress().getHouseNumber();
                     
                     //Define Local Variable;
                     //String address;
                     double distance = 0;
                     TransportationDistanceType  transportationDistanceType = new TransportationDistanceType();
                     
                     //OPTIONS FOR INPUT ARE:
                     //Getfertweg 5 7512BA
                     //Hofstraat 41 7511HD
                     //Marie de Roodelaan 42 7545RT
                     
                     if (houseNumber == 5) {
                     	distance = 6.2;
                     } else if (houseNumber == 41){
                     	distance = 7.1;
                     } else if (houseNumber == 42){
                     	distance = 4.5;
                     }
                     // Set TransportationDistance
                 	transportationDistanceType.setTransportationDistanceType((new BigDecimal(distance).setScale(2, RoundingMode.HALF_EVEN)));                
                     
                     //Create the distance response type
                     DistanceResponseType distanceResponseType = new DistanceResponseType();
                     distanceResponseType.setRepair(repairID);
                     distanceResponseType.setTransportationDistance(transportationDistanceType);
                     
                     //Create and return the distance response message;
                     GetTransportationDistanceResponse transportationDistanceResponse = new GetTransportationDistanceResponse();
                     transportationDistanceResponse.setGetTransportationDistanceResponse(distanceResponseType);
                     
                     return transportationDistanceResponse;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param getTransportationTime4 
             * @return getTransportationTimeResponse5 
         */
        
                 public org.djbikeshop.www.repairtransportationservice.GetTransportationTimeResponse getTransportationTime
                  (
                  org.djbikeshop.www.repairtransportationservice.GetTransportationTime getTransportationTime4
                  )
            {
                //TODO : fill this with the necessary business logic
                
                	 // Retrieve repair ID and Address (houseNumber for simplicity) from request message;
                     RepairIDType repairID = getTransportationTime4.getGetTransportationTimeRequest().getRepair();
                     int houseNumber = getTransportationTime4.getGetTransportationTimeRequest().getAddress().getHouseNumber();
                     
                     
                     String pattern = "yyyy-MM-dd HH:mm:ss";
                     DateFormat dateFormat = new SimpleDateFormat(pattern);
                     Calendar cal = Calendar.getInstance();
                     
                     //Local Variables
                     int MinutesAway = 0;
                     
                     TransportationTimeType transportationTimeType = new TransportationTimeType();
                     
                     //OPTIONS FOR INPUT ARE:
                     //Getfertweg 5 7512BA
                     //Hofstraat 41 7511HD
                     //Marie de Roodelaan 42 7545RT
                     
                     if (houseNumber == 5) {
                     	MinutesAway = 15;
                     } else if (houseNumber == 41){
                     	MinutesAway = 12;
                     } else if (houseNumber == 42){
                     	MinutesAway = 10;
                     }
                     
                     cal.add(Calendar.MINUTE, MinutesAway);
                     String newTime = dateFormat.format(cal.getTime());
                     
                     
                     
                     Date date = null;
     				try {
     					date = new SimpleDateFormat(pattern).parse(newTime);
     				} catch (ParseException e) {
     					// TODO Auto-generated catch block
     					e.printStackTrace();
     				}
                     cal.setTime(date);
                     
                     
                     transportationTimeType.setTransportationTimeType(cal);
                     
                     TimeResponseType timeResponseType = new TimeResponseType();
                     timeResponseType.setRepair(repairID);
                     timeResponseType.setTransportationTime(transportationTimeType);
                     
                   //Create and return the distance response message;
                     GetTransportationTimeResponse transportationTimeResponse = new GetTransportationTimeResponse();
                     transportationTimeResponse.setGetTransportationTimeResponse(timeResponseType);
                     
                     return transportationTimeResponse;
        }
     
    }
    