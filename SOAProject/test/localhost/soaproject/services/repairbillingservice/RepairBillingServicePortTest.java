

/**
 * RepairBillingServicePortTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.repairbillingservice;

    /*
     *  RepairBillingServicePortTest Junit test case
    */

    public class RepairBillingServicePortTest extends junit.framework.TestCase{

     
          /**
          * Auto generated test method
          */
          public  void testsendBill() throws java.lang.Exception{

          localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub stub =
          new localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub();//the default implementation should point to the right endpoint
          localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub.DeliveryConfirmation deliveryConfirmation4=
                  (localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub.DeliveryConfirmation)getTestObject(localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub.DeliveryConfirmation.class);
                      // TODO : Fill in the deliveryConfirmation4 here
                  

                  //There is no output to be tested!
                  stub.sendBill(
                  deliveryConfirmation4);

              
          }
      
          /**
          * Auto generated test method
          */
          public  void testcalculateTotalCost() throws java.lang.Exception{

          localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub stub =
          new localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub();//the default implementation should point to the right endpoint
          localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub.Bill bill5=
                  (localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub.Bill)getTestObject(localhost.soaproject.services.repairbillingservice.RepairBillingServicePortStub.Bill.class);
                      // TODO : Fill in the bill5 here
                  

                  //There is no output to be tested!
                  stub.calculateTotalCost(
                  bill5);

              
          }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    