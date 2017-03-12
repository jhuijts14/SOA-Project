
/**
 * BillType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

            
                package localhost.soaproject.services.repairbillingservice;
            

            /**
            *  BillType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class BillType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = BillType
                Namespace URI = http://localhost:8080/SOAProject/services/RepairBillingService
                Namespace Prefix = ns14
                */
            

                        /**
                        * field for ApprovalResponse
                        */

                        
                                    protected localhost.soaproject.services.commontypes.ApprovalResponseType localApprovalResponse ;
                                

                           /**
                           * Auto generated getter method
                           * @return localhost.soaproject.services.commontypes.ApprovalResponseType
                           */
                           public  localhost.soaproject.services.commontypes.ApprovalResponseType getApprovalResponse(){
                               return localApprovalResponse;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ApprovalResponse
                               */
                               public void setApprovalResponse(localhost.soaproject.services.commontypes.ApprovalResponseType param){
                            
                                            this.localApprovalResponse=param;
                                       

                               }
                            

                        /**
                        * field for PickUpCost
                        */

                        
                                    protected localhost.soaproject.services.commontypes.CostType localPickUpCost ;
                                

                           /**
                           * Auto generated getter method
                           * @return localhost.soaproject.services.commontypes.CostType
                           */
                           public  localhost.soaproject.services.commontypes.CostType getPickUpCost(){
                               return localPickUpCost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param PickUpCost
                               */
                               public void setPickUpCost(localhost.soaproject.services.commontypes.CostType param){
                            
                                            this.localPickUpCost=param;
                                       

                               }
                            

                        /**
                        * field for RepairCost
                        */

                        
                                    protected localhost.soaproject.services.commontypes.CostType localRepairCost ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRepairCostTracker = false ;

                           public boolean isRepairCostSpecified(){
                               return localRepairCostTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return localhost.soaproject.services.commontypes.CostType
                           */
                           public  localhost.soaproject.services.commontypes.CostType getRepairCost(){
                               return localRepairCost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RepairCost
                               */
                               public void setRepairCost(localhost.soaproject.services.commontypes.CostType param){
                            localRepairCostTracker = param != null;
                                   
                                            this.localRepairCost=param;
                                       

                               }
                            

                        /**
                        * field for DeliveryCost
                        */

                        
                                    protected localhost.soaproject.services.commontypes.CostType localDeliveryCost ;
                                

                           /**
                           * Auto generated getter method
                           * @return localhost.soaproject.services.commontypes.CostType
                           */
                           public  localhost.soaproject.services.commontypes.CostType getDeliveryCost(){
                               return localDeliveryCost;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param DeliveryCost
                               */
                               public void setDeliveryCost(localhost.soaproject.services.commontypes.CostType param){
                            
                                            this.localDeliveryCost=param;
                                       

                               }
                            

                        /**
                        * field for CustomerInformation
                        */

                        
                                    protected localhost.soaproject.services.commontypes.CustomerType localCustomerInformation ;
                                

                           /**
                           * Auto generated getter method
                           * @return localhost.soaproject.services.commontypes.CustomerType
                           */
                           public  localhost.soaproject.services.commontypes.CustomerType getCustomerInformation(){
                               return localCustomerInformation;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CustomerInformation
                               */
                               public void setCustomerInformation(localhost.soaproject.services.commontypes.CustomerType param){
                            
                                            this.localCustomerInformation=param;
                                       

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://localhost:8080/SOAProject/services/RepairBillingService");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":BillType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "BillType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localApprovalResponse==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ApprovalResponse cannot be null!!");
                                            }
                                           localApprovalResponse.serialize(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","ApprovalResponse"),
                                               xmlWriter);
                                        
                                            if (localPickUpCost==null){
                                                 throw new org.apache.axis2.databinding.ADBException("PickUpCost cannot be null!!");
                                            }
                                           localPickUpCost.serialize(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","PickUpCost"),
                                               xmlWriter);
                                         if (localRepairCostTracker){
                                            if (localRepairCost==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RepairCost cannot be null!!");
                                            }
                                           localRepairCost.serialize(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","RepairCost"),
                                               xmlWriter);
                                        }
                                            if (localDeliveryCost==null){
                                                 throw new org.apache.axis2.databinding.ADBException("DeliveryCost cannot be null!!");
                                            }
                                           localDeliveryCost.serialize(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","DeliveryCost"),
                                               xmlWriter);
                                        
                                            if (localCustomerInformation==null){
                                                 throw new org.apache.axis2.databinding.ADBException("CustomerInformation cannot be null!!");
                                            }
                                           localCustomerInformation.serialize(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","CustomerInformation"),
                                               xmlWriter);
                                        
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://localhost:8080/SOAProject/services/RepairBillingService")){
                return "ns14";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService",
                                                                      "ApprovalResponse"));
                            
                            
                                    if (localApprovalResponse==null){
                                         throw new org.apache.axis2.databinding.ADBException("ApprovalResponse cannot be null!!");
                                    }
                                    elementList.add(localApprovalResponse);
                                
                            elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService",
                                                                      "PickUpCost"));
                            
                            
                                    if (localPickUpCost==null){
                                         throw new org.apache.axis2.databinding.ADBException("PickUpCost cannot be null!!");
                                    }
                                    elementList.add(localPickUpCost);
                                 if (localRepairCostTracker){
                            elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService",
                                                                      "RepairCost"));
                            
                            
                                    if (localRepairCost==null){
                                         throw new org.apache.axis2.databinding.ADBException("RepairCost cannot be null!!");
                                    }
                                    elementList.add(localRepairCost);
                                }
                            elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService",
                                                                      "DeliveryCost"));
                            
                            
                                    if (localDeliveryCost==null){
                                         throw new org.apache.axis2.databinding.ADBException("DeliveryCost cannot be null!!");
                                    }
                                    elementList.add(localDeliveryCost);
                                
                            elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService",
                                                                      "CustomerInformation"));
                            
                            
                                    if (localCustomerInformation==null){
                                         throw new org.apache.axis2.databinding.ADBException("CustomerInformation cannot be null!!");
                                    }
                                    elementList.add(localCustomerInformation);
                                

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
        public static BillType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            BillType object =
                new BillType();

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
                    
                            if (!"BillType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (BillType)localhost.soaproject.services.repairbillingservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","ApprovalResponse").equals(reader.getName())){
                                
                                                object.setApprovalResponse(localhost.soaproject.services.commontypes.ApprovalResponseType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","PickUpCost").equals(reader.getName())){
                                
                                                object.setPickUpCost(localhost.soaproject.services.commontypes.CostType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","RepairCost").equals(reader.getName())){
                                
                                                object.setRepairCost(localhost.soaproject.services.commontypes.CostType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","DeliveryCost").equals(reader.getName())){
                                
                                                object.setDeliveryCost(localhost.soaproject.services.commontypes.CostType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/RepairBillingService","CustomerInformation").equals(reader.getName())){
                                
                                                object.setCustomerInformation(localhost.soaproject.services.commontypes.CustomerType.Factory.parse(reader));
                                              
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
           
    