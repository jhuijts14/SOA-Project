
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

        
            package localhost.soaproject.services.repairbillingservice;
        
            /**
            *  ExtensionMapper class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "EmailType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.EmailType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "ConfirmationType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.ConfirmationType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "TransportationDistanceType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.TransportationDistanceType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "RepairIDType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.RepairIDType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairBillingService".equals(namespaceURI) &&
                  "BillType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairbillingservice.BillType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "ApprovalResponseType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.ApprovalResponseType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/RepairBillingService".equals(namespaceURI) &&
                  "DeliveryConfirmationType".equals(typeName)){
                   
                            return  localhost.soaproject.services.repairbillingservice.DeliveryConfirmationType.Factory.parse(reader);
                        

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
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "CustomerType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.CustomerType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://localhost:8080/SOAProject/services/CommonTypes".equals(namespaceURI) &&
                  "CostType".equals(typeName)){
                   
                            return  localhost.soaproject.services.commontypes.CostType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    