
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package org.djbikeshop.www.bikeinspectionservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes/".equals(namespaceURI) &&
                  "BikePartType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.BikePartType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/BikeInspectionService/".equals(namespaceURI) &&
                  "InspectionResultsType".equals(typeName)){
                   
                            return  org.djbikeshop.www.bikeinspectionservice.InspectionResultsType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/BikeInspectionService/".equals(namespaceURI) &&
                  "InspectionRequestType".equals(typeName)){
                   
                            return  org.djbikeshop.www.bikeinspectionservice.InspectionRequestType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes/".equals(namespaceURI) &&
                  "RepairsDesiredType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.RepairsDesiredType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes/".equals(namespaceURI) &&
                  "PriceType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.PriceType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes/".equals(namespaceURI) &&
                  "RepairTimeType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.RepairTimeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes/".equals(namespaceURI) &&
                  "RepairIDType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.RepairIDType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    