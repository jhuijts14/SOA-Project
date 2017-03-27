
/**
 * ErrorMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

package org.loans.approval;

public class ErrorMessage extends java.lang.Exception{

    private static final long serialVersionUID = 1490175771961L;
    
    private org.loans.schema.ErrorMessage faultMessage;

    
        public ErrorMessage() {
            super("ErrorMessage");
        }

        public ErrorMessage(java.lang.String s) {
           super(s);
        }

        public ErrorMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ErrorMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.loans.schema.ErrorMessage msg){
       faultMessage = msg;
    }
    
    public org.loans.schema.ErrorMessage getFaultMessage(){
       return faultMessage;
    }
}
    