
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package localhost.soaproject.services.repairtransportationservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairTransportationService".equals(namespaceURI) &&
                  "TimeResponseType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairtransportationservice.TimeResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "TransportationDistanceType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.TransportationDistanceType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairTransportationService".equals(namespaceURI) &&
                  "TransportationTimeType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairtransportationservice.TransportationTimeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairTransportationService".equals(namespaceURI) &&
                  "TransportationTimeRequestType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairtransportationservice.TransportationTimeRequestType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "ApprovalResponseType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.ApprovalResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "AddressType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.AddressType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "CustomerNameType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.CustomerNameType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairTransportationService".equals(namespaceURI) &&
                  "TransportationDistanceRequestType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairtransportationservice.TransportationDistanceRequestType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "EmailType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.EmailType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairTransportationService".equals(namespaceURI) &&
                  "UpdatedDeliveryTimeResponseType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairtransportationservice.UpdatedDeliveryTimeResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairTransportationService".equals(namespaceURI) &&
                  "UpdatedDeliveryTimeType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairtransportationservice.UpdatedDeliveryTimeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "RepairIDType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.RepairIDType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "RepairTimeType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.RepairTimeType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "CustomerType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.CustomerType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "CostType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.CostType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairTransportationService".equals(namespaceURI) &&
                  "DistanceResponseType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairtransportationservice.DistanceResponseType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    