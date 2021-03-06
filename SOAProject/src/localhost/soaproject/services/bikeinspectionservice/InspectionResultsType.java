
/**
 * InspectionResultsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:04:10 GMT)
 */

            
                package localhost.soaproject.services.bikeinspectionservice;
            

            /**
            *  InspectionResultsType bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class InspectionResultsType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = InspectionResultsType
                Namespace URI = http://localhost:8080/SOAProject/services/BikeInspectionService
                Namespace Prefix = ns5
                */
            

                        /**
                        * field for RepairID
                        */

                        
                                    protected localhost.soaproject.services.commontypes.RepairIDType localRepairID ;
                                

                           /**
                           * Auto generated getter method
                           * @return localhost.soaproject.services.commontypes.RepairIDType
                           */
                           public  localhost.soaproject.services.commontypes.RepairIDType getRepairID(){
                               return localRepairID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RepairID
                               */
                               public void setRepairID(localhost.soaproject.services.commontypes.RepairIDType param){
                            
                                            this.localRepairID=param;
                                       

                               }
                            

                        /**
                        * field for RepairTime
                        */

                        
                                    protected localhost.soaproject.services.commontypes.RepairTimeType localRepairTime ;
                                

                           /**
                           * Auto generated getter method
                           * @return localhost.soaproject.services.commontypes.RepairTimeType
                           */
                           public  localhost.soaproject.services.commontypes.RepairTimeType getRepairTime(){
                               return localRepairTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RepairTime
                               */
                               public void setRepairTime(localhost.soaproject.services.commontypes.RepairTimeType param){
                            
                                            this.localRepairTime=param;
                                       

                               }
                            

                        /**
                        * field for NumberOfParts
                        */

                        
                                    protected int localNumberOfParts ;
                                

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getNumberOfParts(){
                               return localNumberOfParts;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param NumberOfParts
                               */
                               public void setNumberOfParts(int param){
                            
                                            this.localNumberOfParts=param;
                                       

                               }
                            

                        /**
                        * field for BikePart
                        * This was an Array!
                        */

                        
                                    protected localhost.soaproject.services.commontypes.BikePartType[] localBikePart ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBikePartTracker = false ;

                           public boolean isBikePartSpecified(){
                               return localBikePartTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return localhost.soaproject.services.commontypes.BikePartType[]
                           */
                           public  localhost.soaproject.services.commontypes.BikePartType[] getBikePart(){
                               return localBikePart;
                           }

                           
                        


                               
                              /**
                               * validate the array for BikePart
                               */
                              protected void validateBikePart(localhost.soaproject.services.commontypes.BikePartType[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BikePart
                              */
                              public void setBikePart(localhost.soaproject.services.commontypes.BikePartType[] param){
                              
                                   validateBikePart(param);

                               localBikePartTracker = param != null;
                                      
                                      this.localBikePart=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param localhost.soaproject.services.commontypes.BikePartType
                             */
                             public void addBikePart(localhost.soaproject.services.commontypes.BikePartType param){
                                   if (localBikePart == null){
                                   localBikePart = new localhost.soaproject.services.commontypes.BikePartType[]{};
                                   }

                            
                                 //update the setting tracker
                                localBikePartTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBikePart);
                               list.add(param);
                               this.localBikePart =
                             (localhost.soaproject.services.commontypes.BikePartType[])list.toArray(
                            new localhost.soaproject.services.commontypes.BikePartType[list.size()]);

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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://localhost:8080/SOAProject/services/BikeInspectionService");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":InspectionResultsType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "InspectionResultsType",
                           xmlWriter);
                   }

               
                   }
               
                                            if (localRepairID==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RepairID cannot be null!!");
                                            }
                                           localRepairID.serialize(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService","RepairID"),
                                               xmlWriter);
                                        
                                            if (localRepairTime==null){
                                                 throw new org.apache.axis2.databinding.ADBException("RepairTime cannot be null!!");
                                            }
                                           localRepairTime.serialize(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService","RepairTime"),
                                               xmlWriter);
                                        
                                    namespace = "http://localhost:8080/SOAProject/services/BikeInspectionService";
                                    writeStartElement(null, namespace, "NumberOfParts", xmlWriter);
                             
                                               if (localNumberOfParts==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("NumberOfParts cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfParts));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                              if (localBikePartTracker){
                                       if (localBikePart!=null){
                                            for (int i = 0;i < localBikePart.length;i++){
                                                if (localBikePart[i] != null){
                                                 localBikePart[i].serialize(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService","BikePart"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("BikePart cannot be null!!");
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://localhost:8080/SOAProject/services/BikeInspectionService")){
                return "ns5";
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

                
                            elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService",
                                                                      "RepairID"));
                            
                            
                                    if (localRepairID==null){
                                         throw new org.apache.axis2.databinding.ADBException("RepairID cannot be null!!");
                                    }
                                    elementList.add(localRepairID);
                                
                            elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService",
                                                                      "RepairTime"));
                            
                            
                                    if (localRepairTime==null){
                                         throw new org.apache.axis2.databinding.ADBException("RepairTime cannot be null!!");
                                    }
                                    elementList.add(localRepairTime);
                                
                                      elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService",
                                                                      "NumberOfParts"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumberOfParts));
                             if (localBikePartTracker){
                             if (localBikePart!=null) {
                                 for (int i = 0;i < localBikePart.length;i++){

                                    if (localBikePart[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService",
                                                                          "BikePart"));
                                         elementList.add(localBikePart[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("BikePart cannot be null!!");
                                    
                             }

                        }

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
        public static InspectionResultsType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            InspectionResultsType object =
                new InspectionResultsType();

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
                    
                            if (!"InspectionResultsType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (InspectionResultsType)localhost.soaproject.services.bikeinspectionservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService","RepairID").equals(reader.getName())){
                                
                                                object.setRepairID(localhost.soaproject.services.commontypes.RepairIDType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService","RepairTime").equals(reader.getName())){
                                
                                                object.setRepairTime(localhost.soaproject.services.commontypes.RepairTimeType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService","NumberOfParts").equals(reader.getName())){
                                
                                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                    if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                        throw new org.apache.axis2.databinding.ADBException("The element: "+"NumberOfParts" +"  cannot be null");
                                    }
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNumberOfParts(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService","BikePart").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list4.add(localhost.soaproject.services.commontypes.BikePartType.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/BikeInspectionService","BikePart").equals(reader.getName())){
                                                                    list4.add(localhost.soaproject.services.commontypes.BikePartType.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBikePart((localhost.soaproject.services.commontypes.BikePartType[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                localhost.soaproject.services.commontypes.BikePartType.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
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
           
    