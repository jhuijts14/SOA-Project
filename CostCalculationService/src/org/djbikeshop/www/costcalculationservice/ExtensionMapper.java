
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package org.djbikeshop.www.costcalculationservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "CustomerNameType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.CustomerNameType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "PriceType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.PriceType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "AddressType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.AddressType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CostCalculationService".equals(namespaceURI) &&
                  "TransportationCostResponseType".equals(typeName)){
                   
                            return  org.djbikeshop.www.costcalculationservice.TransportationCostResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CostCalculationService".equals(namespaceURI) &&
                  "GetTransportationCostType".equals(typeName)){
                   
                            return  org.djbikeshop.www.costcalculationservice.GetTransportationCostType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "BikePartType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.BikePartType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "TransportationDistanceType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.TransportationDistanceType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "CustomerType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.CustomerType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "CostType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.CostType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "RepairTimeType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.RepairTimeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "RepairIDType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.RepairIDType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CommonTypes".equals(namespaceURI) &&
                  "EmailType".equals(typeName)){
                   
                            return  org.djbikeshop.www.commontypes.EmailType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CostCalculationService".equals(namespaceURI) &&
                  "GetRepairCostType".equals(typeName)){
                   
                            return  org.djbikeshop.www.costcalculationservice.GetRepairCostType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.djbikeshop.org/CostCalculationService".equals(namespaceURI) &&
                  "RepairCostResponseType".equals(typeName)){
                   
                            return  org.djbikeshop.www.costcalculationservice.RepairCostResponseType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    