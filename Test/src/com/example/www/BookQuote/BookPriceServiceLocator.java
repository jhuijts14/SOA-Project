/**
 * BookPriceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.www.BookQuote;

public class BookPriceServiceLocator extends org.apache.axis.client.Service implements com.example.www.BookQuote.BookPriceService {

    public BookPriceServiceLocator() {
    }


    public BookPriceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookPriceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookPricePort
    private java.lang.String BookPricePort_address = "http://localhost:8080/project/services/BookPriceService";

    public java.lang.String getBookPricePortAddress() {
        return BookPricePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookPricePortWSDDServiceName = "BookPricePort";

    public java.lang.String getBookPricePortWSDDServiceName() {
        return BookPricePortWSDDServiceName;
    }

    public void setBookPricePortWSDDServiceName(java.lang.String name) {
        BookPricePortWSDDServiceName = name;
    }

    public com.example.www.BookQuote.BookQuote getBookPricePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookPricePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookPricePort(endpoint);
    }

    public com.example.www.BookQuote.BookQuote getBookPricePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.www.BookQuote.BookPriceBindingStub _stub = new com.example.www.BookQuote.BookPriceBindingStub(portAddress, this);
            _stub.setPortName(getBookPricePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookPricePortEndpointAddress(java.lang.String address) {
        BookPricePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.www.BookQuote.BookQuote.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.www.BookQuote.BookPriceBindingStub _stub = new com.example.www.BookQuote.BookPriceBindingStub(new java.net.URL(BookPricePort_address), this);
                _stub.setPortName(getBookPricePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BookPricePort".equals(inputPortName)) {
            return getBookPricePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.com/BookQuote", "BookPriceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.com/BookQuote", "BookPricePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookPricePort".equals(portName)) {
            setBookPricePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
