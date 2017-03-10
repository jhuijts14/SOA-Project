
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package org.example.www.repairtransportationservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "CostType".equals(typeName)){
                   
                            return  org.example.www.commontypes.CostType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "CustomerType".equals(typeName)){
                   
                            return  org.example.www.commontypes.CustomerType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/RepairTransportationService".equals(namespaceURI) &&
                  "TimeResponseType".equals(typeName)){
                   
                            return  org.example.www.repairtransportationservice.TimeResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/RepairTransportationService".equals(namespaceURI) &&
                  "DistantResponseType".equals(typeName)){
                   
                            return  org.example.www.repairtransportationservice.DistantResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/RepairTransportationService".equals(namespaceURI) &&
                  "TransportationTimeType".equals(typeName)){
                   
                            return  org.example.www.repairtransportationservice.TransportationTimeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "RepairTimeType".equals(typeName)){
                   
                            return  org.example.www.commontypes.RepairTimeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "RepairIDType".equals(typeName)){
                   
                            return  org.example.www.commontypes.RepairIDType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/RepairTransportationService".equals(namespaceURI) &&
                  "TransportationTimeRequestType".equals(typeName)){
                   
                            return  org.example.www.repairtransportationservice.TransportationTimeRequestType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "EmailType".equals(typeName)){
                   
                            return  org.example.www.commontypes.EmailType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "ApprovalResponseType".equals(typeName)){
                   
                            return  org.example.www.commontypes.ApprovalResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "CustomerNameType".equals(typeName)){
                   
                            return  org.example.www.commontypes.CustomerNameType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "AddressType".equals(typeName)){
                   
                            return  org.example.www.commontypes.AddressType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/RepairTransportationService".equals(namespaceURI) &&
                  "TransportationDistanceRequestType".equals(typeName)){
                   
                            return  org.example.www.repairtransportationservice.TransportationDistanceRequestType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/RepairTransportationService".equals(namespaceURI) &&
                  "UpdatedDeliveryTimeType".equals(typeName)){
                   
                            return  org.example.www.repairtransportationservice.UpdatedDeliveryTimeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/RepairTransportationService".equals(namespaceURI) &&
                  "UpdatedDeliveryTimeResponseType".equals(typeName)){
                   
                            return  org.example.www.repairtransportationservice.UpdatedDeliveryTimeResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.example.org/CommonTypes".equals(namespaceURI) &&
                  "TransportationDistanceType".equals(typeName)){
                   
                            return  org.example.www.commontypes.TransportationDistanceType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    