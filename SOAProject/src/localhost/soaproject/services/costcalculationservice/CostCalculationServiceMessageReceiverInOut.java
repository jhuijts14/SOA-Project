
/**
 * CostCalculationServiceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
        package localhost.soaproject.services.costcalculationservice;

        /**
        *  CostCalculationServiceMessageReceiverInOut message receiver
        */

        public class CostCalculationServiceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        CostCalculationServiceSkeletonInterface skel = (CostCalculationServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("calculateRepairCost".equals(methodName)){
                
                localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse calculateRepairCostResponse13 = null;
	                        localhost.soaproject.services.costcalculationservice.CalculateRepairCost wrappedParam =
                                                             (localhost.soaproject.services.costcalculationservice.CalculateRepairCost)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.soaproject.services.costcalculationservice.CalculateRepairCost.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               calculateRepairCostResponse13 =
                                                   
                                                   
                                                         skel.calculateRepairCost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), calculateRepairCostResponse13, false, new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/CostCalculationService/",
                                                    "calculateRepairCost"));
                                    } else 

            if("calculateTransportCost".equals(methodName)){
                
                localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse calculateTransportCostResponse15 = null;
	                        localhost.soaproject.services.costcalculationservice.CalculateTransportCost wrappedParam =
                                                             (localhost.soaproject.services.costcalculationservice.CalculateTransportCost)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    localhost.soaproject.services.costcalculationservice.CalculateTransportCost.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               calculateTransportCostResponse15 =
                                                   
                                                   
                                                         skel.calculateTransportCost(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), calculateTransportCostResponse15, false, new javax.xml.namespace.QName("http://localhost:8080/SOAProject/services/CostCalculationService/",
                                                    "calculateTransportCost"));
                                    
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
            private  org.apache.axiom.om.OMElement  toOM(localhost.soaproject.services.costcalculationservice.CalculateRepairCost param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.soaproject.services.costcalculationservice.CalculateRepairCost.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.soaproject.services.costcalculationservice.CalculateTransportCost param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.soaproject.services.costcalculationservice.CalculateTransportCost.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse wrapCalculateRepairCost(){
                                localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse wrappedElement = new localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse();
                                return wrappedElement;
                         }
                    
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse wrapCalculateTransportCost(){
                                localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse wrappedElement = new localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse();
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
        
                if (localhost.soaproject.services.costcalculationservice.CalculateRepairCost.class.equals(type)){
                
                        return localhost.soaproject.services.costcalculationservice.CalculateRepairCost.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse.class.equals(type)){
                
                        return localhost.soaproject.services.costcalculationservice.CalculateRepairCostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (localhost.soaproject.services.costcalculationservice.CalculateTransportCost.class.equals(type)){
                
                        return localhost.soaproject.services.costcalculationservice.CalculateTransportCost.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse.class.equals(type)){
                
                        return localhost.soaproject.services.costcalculationservice.CalculateTransportCostResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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
    