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
		String approval = , repairID, fName, lName, billStr, billHoNu, billPoCo, billCi;
		double pickUpCost, repairCost, delivCost;
		
		
		
		
		RepairBillingServicePortStub repBillServStub = new RepairBillingServicePortStub();
		
		Bill testBill = new Bill();
		testBill.setBill(param);
	}

}
