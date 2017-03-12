
/**
 * UpdatedDeliveryTimeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

            
                package org.example.www.repairtransportationservice;
            

            /**
            *  UpdatedDeliveryTimeType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class UpdatedDeliveryTimeType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = UpdatedDeliveryTimeType
                Namespace URI = http://www.example.org/RepairTransportationService
                Namespace Prefix = ns4
                */
            

                        /**
                        * field for RepairID
                        */

                        
                                    protected org.example.www.commontypes.RepairIDType localRepairID ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.example.www.commontypes.RepairIDType
                           */
                           public  org.example.www.commontypes.RepairIDType getRepairID(){
                               return localRepairID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RepairID
                               */
                               public void setRepairID(org.example.www.commontypes.RepairIDType param){
                            
                                            this.localRepairID=param;
                                       

                               }
                            

                        /**
                        * field for DeliveryTime
                        */

                        
                                    protected org.example.www.repairtransportationservice.TransportationTimeType localDeliveryTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.example.www.repairtransportationservice.TransportationTimeType
                           */
                           public  org.example.www.repairtransportationservice.TransportationTimeType getDeliveryTime(){
                               return localDeliveryTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeliveryTime
                               */
                               public void setDeliveryTime(org.example.www.repairtransportationservice.TransportationTimeType param){
                            
                                            this.localDeliveryTime=param;
                                       

                               }
                            

                        /**
                        * field for RepairTime
                        */

                        
                                    protected org.example.www.commontypes.RepairTimeType localRepairTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.example.www.commontypes.RepairTimeType
                           */
                           public  org.example.www.commontypes.RepairTimeType getRepairTime(){
                               return localRepairTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RepairTime
                               */
                               public void setRepairTime(org.example.www.commontypes.RepairTimeType param){
                            
                                            this.localRepairTime=param;
                                       

                               }
                            

                        /**
                        * field for ApprovalResponse
                        */

                        
                                    protected org.example.www.commontypes.ApprovalResponseType localApprovalResponse ;
                                

                           /**
                           * Auto generated getter method
                           * @return org.example.www.commontypes.ApprovalResponseType
                           */
                           public  org.example.www.commontypes.ApprovalResponseType getApprovalResponse(){
                               return localApprovalResponse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApprovalResponse
                               */
                               public void setApprovalResponse(org.example.www.commontypes.ApprovalResponseType param){
                            
                                            this.localApprovalResponse=param;
                                       

                               }
                            

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.example.org/RepairTransportationService");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":UpdatedDeliveryTimeType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "UpdatedDeliveryTimeType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRepairID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RepairID cannot be null!!");
                                            }
                                           localRepairID.serialize(new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService","RepairID"),
                                               xmlWriter);
                                        
                                            if (localDeliveryTime==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DeliveryTime cannot be null!!");
                                            }
                                           localDeliveryTime.serialize(new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService","DeliveryTime"),
                                               xmlWriter);
                                        
                                            if (localRepairTime==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RepairTime cannot be null!!");
                                            }
                                           localRepairTime.serialize(new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService","RepairTime"),
                                               xmlWriter);
                                        
                                            if (localApprovalResponse==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ApprovalResponse cannot be null!!");
                                            }
                                           localApprovalResponse.serialize(new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService","ApprovalResponse"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.example.org/RepairTransportationService")){
                return "ns4";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                
                            elementList.add(new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService",
                                                                      "RepairID"));
                            
                            
                                    if (localRepairID==null){
                                         throw new org.apache.axis2.databinding.ADBException("RepairID cannot be null!!");
                                    }
                                    elementList.add(localRepairID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService",
                                                                      "DeliveryTime"));
                            
                            
                                    if (localDeliveryTime==null){
                                         throw new org.apache.axis2.databinding.ADBException("DeliveryTime cannot be null!!");
                                    }
                                    elementList.add(localDeliveryTime);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService",
                                                                      "RepairTime"));
                            
                            
                                    if (localRepairTime==null){
                                         throw new org.apache.axis2.databinding.ADBException("RepairTime cannot be null!!");
                                    }
                                    elementList.add(localRepairTime);
                                
                            elementList.add(new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService",
                                                                      "ApprovalResponse"));
                            
                            
                                    if (localApprovalResponse==null){
                                         throw new org.apache.axis2.databinding.ADBException("ApprovalResponse cannot be null!!");
                                    }
                                    elementList.add(localApprovalResponse);
                                

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static UpdatedDeliveryTimeType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            UpdatedDeliveryTimeType object =
                new UpdatedDeliveryTimeType();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"UpdatedDeliveryTimeType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (UpdatedDeliveryTimeType)org.example.www.repairtransportationservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService","RepairID").equals(reader.getName())){
                                
                                                object.setRepairID(org.example.www.commontypes.RepairIDType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService","DeliveryTime").equals(reader.getName())){
                                
                                                object.setDeliveryTime(org.example.www.repairtransportationservice.TransportationTimeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService","RepairTime").equals(reader.getName())){
                                
                                                object.setRepairTime(org.example.www.commontypes.RepairTimeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService","ApprovalResponse").equals(reader.getName())){
                                
                                                object.setApprovalResponse(org.example.www.commontypes.ApprovalResponseType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                              
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    