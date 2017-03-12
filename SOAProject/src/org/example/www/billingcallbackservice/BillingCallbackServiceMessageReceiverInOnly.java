

/**
 * BillingCallbackServiceMessageReceiverInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
        package org.example.www.billingcallbackservice;

        /**
        *  BillingCallbackServiceMessageReceiverInOnly message receiver
        */

        public class BillingCallbackServiceMessageReceiverInOnly extends org.apache.axis2.receivers.AbstractInMessageReceiver{

        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext inMessage) throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(inMessage);

        BillingCallbackServiceSkeletonInterface skel = (BillingCallbackServiceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = inMessage.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        
            if("confirmTotalCost".equals(methodName)){
            
            org.example.www.billingcallbackservice.TotalCostConfirmation wrappedParam = (org.example.www.billingcallbackservice.TotalCostConfirmation)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        org.example.www.billingcallbackservice.TotalCostConfirmation.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.confirmTotalCost(wrappedParam);
                                                } else 
            if("confirmBillSent".equals(methodName)){
            
            org.example.www.billingcallbackservice.BillSentConfirmation wrappedParam = (org.example.www.billingcallbackservice.BillSentConfirmation)fromOM(
                                                        inMessage.getEnvelope().getBody().getFirstElement(),
                                                        org.example.www.billingcallbackservice.BillSentConfirmation.class,
                                                        getEnvelopeNamespaces(inMessage.getEnvelope()));
                                            
                                                     skel.confirmBillSent(wrappedParam);
                                                
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }


        
        //
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.billingcallbackservice.TotalCostConfirmation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.billingcallbackservice.TotalCostConfirmation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(org.example.www.billingcallbackservice.BillSentConfirmation param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(org.example.www.billingcallbackservice.BillSentConfirmation.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

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
        
                if (org.example.www.billingcallbackservice.BillSentConfirmation.class.equals(type)){
                
                        return org.example.www.billingcallbackservice.BillSentConfirmation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
            
                if (org.example.www.billingcallbackservice.TotalCostConfirmation.class.equals(type)){
                
                        return org.example.www.billingcallbackservice.TotalCostConfirmation.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

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



        }//end of class

    