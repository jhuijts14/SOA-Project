/**
 * 
 */
package localhost.soaproject.services.repairbillingservice;

import org.apache.axis2.AxisFault;

/**
 * @author Joep Huijts and Derrik Simmons
 *
 */
public class TestRBS {

	/**
	 * @param args
	 * @throws AxisFault 
	 */
	public static void main(String[] args) throws AxisFault {
		// TODO Auto-generated method stub

		// All the local variables for  information given for a bill;
		String approval = "Approved", repairID  = "1'", fName = "Joep", lName = "H", billStr = "Cals", 
				billHoNu = "60", billPoCo = "1223", billCi = "Enschede", email = "1@g.com", phone = "1234";
		double pickUpCost = 10, repairCost = 10, delivCost = 10;
		
		//
		
		
		RepairBillingServicePortStub repBillServStub = new RepairBillingServicePortStub();
		
		Bill testBill = new Bill();
		testBill.setBill(param);
	}

}
