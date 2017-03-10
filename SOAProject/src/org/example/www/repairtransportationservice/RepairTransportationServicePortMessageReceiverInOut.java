
/**
 * RepairTransportationServicePortMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
        package org.example.www.repairtransportationservice;

        /**
        *  RepairTransportationServicePortMessageReceiverInOut message receiver
        */

        public class RepairTransportationServicePortMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        RepairTransportationServicePortSkeletonInterface skel = (RepairTransportationServicePortSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getTransportationTime".equals(methodName)){
                
                org.example.www.repairtransportationservice.GetTransportationTimeResponse getTransportationTimeResponse19 = null;
	                        org.example.www.repairtransportationservice.GetTransportationTime wrappedParam =
                                                             (org.example.www.repairtransportationservice.GetTransportationTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.repairtransportationservice.GetTransportationTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTransportationTimeResponse19 =
                                                   
                                                   
                                                         skel.getTransportationTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTransportationTimeResponse19, false, new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService/",
                                                    "getTransportationTime"));
                                    } else 

            if("getTransportationDistance".equals(methodName)){
                
                org.example.www.repairtransportationservice.GetTransportationDistanceResponse getTransportationDistanceResponse21 = null;
	                        org.example.www.repairtransportationservice.GetTransportationDistance wrappedParam =
                                                             (org.example.www.repairtransportationservice.GetTransportationDistance)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.repairtransportationservice.GetTransportationDistance.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               getTransportationDistanceResponse21 =
                                                   
                                                   
                                                         skel.getTransportationDistance(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), getTransportationDistanceResponse21, false, new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService/",
                                                    "getTransportationDistance"));
                                    } else 

            if("updateDeliveryTime".equals(methodName)){
                
                org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse updateDeliveryTimeResponse23 = null;
	                        org.example.www.repairtransportationservice.UpdateDeliveryTime wrappedParam =
                                                             (org.example.www.repairtransportationservice.UpdateDeliveryTime)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.example.www.repairtransportationservice.UpdateDeliveryTime.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               updateDeliveryTimeResponse23 =
                                                   
                                                   
                                                         skel.updateDeliveryTime(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), updateDeliveryTimeResponse23, false, new javax.xml.namespace.QName("http://www.example.org/RepairTransportationService/",
                                                    "updateDeliveryTime"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        }
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.repairtransportationservice.GetTransportationTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.repairtransportationservice.GetTransportationTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.repairtransportationservice.GetTransportationTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.repairtransportationservice.GetTransportationTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.repairtransportationservice.GetTransportationDistance param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.repairtransportationservice.GetTransportationDistance.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.repairtransportationservice.GetTransportationDistanceResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.repairtransportationservice.GetTransportationDistanceResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.repairtransportationservice.UpdateDeliveryTime param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.repairtransportationservice.UpdateDeliveryTime.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.repairtransportationservice.GetTransportationTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.repairtransportationservice.GetTransportationTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.repairtransportationservice.GetTransportationTimeResponse wrapGetTransportationTime(){
                                org.example.www.repairtransportationservice.GetTransportationTimeResponse wrappedElement = new org.example.www.repairtransportationservice.GetTransportationTimeResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.repairtransportationservice.GetTransportationDistanceResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.repairtransportationservice.GetTransportationDistanceResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.repairtransportationservice.GetTransportationDistanceResponse wrapGetTransportationDistance(){
                                org.example.www.repairtransportationservice.GetTransportationDistanceResponse wrappedElement = new org.example.www.repairtransportationservice.GetTransportationDistanceResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse wrapUpdateDeliveryTime(){
                                org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse wrappedElement = new org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (org.example.www.repairtransportationservice.GetTransportationDistance.class.equals(type)){
                
                        return org.example.www.repairtransportationservice.GetTransportationDistance.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.repairtransportationservice.GetTransportationDistanceResponse.class.equals(type)){
                
                        return org.example.www.repairtransportationservice.GetTransportationDistanceResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.repairtransportationservice.GetTransportationTime.class.equals(type)){
                
                        return org.example.www.repairtransportationservice.GetTransportationTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.repairtransportationservice.GetTransportationTimeResponse.class.equals(type)){
                
                        return org.example.www.repairtransportationservice.GetTransportationTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.repairtransportationservice.UpdateDeliveryTime.class.equals(type)){
                
                        return org.example.www.repairtransportationservice.UpdateDeliveryTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse.class.equals(type)){
                
                        return org.example.www.repairtransportationservice.UpdateDeliveryTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    