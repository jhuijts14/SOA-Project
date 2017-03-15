

/**
 * RepairBillingServiceTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */
    package localhost.soaproject.services.repairbillingservice;

    /*
     *  RepairBillingServiceTest Junit test case
    */

    public class RepairBillingServiceTest extends junit.framework.TestCase{

     
          /**
          * Auto generated test method
          */
          public  void testsendBill() throws java.lang.Exception{

          localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub stub =
          new localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub();//the default implementation should point to the right endpoint
          localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub.DeliveryConfirmation deliveryConfirmation4=
                  (localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub.DeliveryConfirmation)getTestObject(localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub.DeliveryConfirmation.class);
                      // TODO : Fill in the deliveryConfirmation4 here
                  

          // Generate variables to be stored in the confirmation;
          DeliveryConfirmationType delivConfirmation = new DeliveryConfirmationType();
          deliveryConfirmation4.setDeliveryConfirmation(param);
                  //There is no output to be tested!
                  stub.sendBill(
                  deliveryConfirmation4);

              
          }
      
          /**
          * Auto generated test method
          */
          public  void testcalculateTotalCost() throws java.lang.Exception{

          localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub stub =
          new localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub();//the default implementation should point to the right endpoint
          localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub.Bill bill5=
                  (localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub.Bill)getTestObject(localhost.soaproject.services.repairbillingservice.RepairBillingServiceStub.Bill.class);
                      // TODO : Fill in the bill5 here
                  

          BillType billType = new BillType();
          billType.setApprovalResponse(param);
          billType.setCustomerInformation(param);
          billType.setDeliveryCost(param);
          billType
                  //There is no output to be tested!
                  stub.calculateTotalCost(
                  bill5);

              
          }
      
        //Create an ADBBean and provide it as the test object
        public org.apache.axis2.databinding.ADBBean getTestObject(java.lang.Class type) throws java.lang.Exception{
           return (org.apache.axis2.databinding.ADBBean) type.newInstance();
        }

        
        

    }
    