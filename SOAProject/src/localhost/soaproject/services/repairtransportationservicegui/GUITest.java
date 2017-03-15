package localhost.soaproject.services.repairtransportationservicegui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import org.apache.axis2.AxisFault;

import java.rmi.RemoteException;

import localhost.soaproject.services.repairbillingservice.*;
public class GUITest extends JFrame {

		private JButton invokebutton = null;
		private JTextField isbnfield = null;
		private JLabel jLabel = null;
		private JTextField resultfield = null;
		private JLabel jLabel1 = null;
		private JLabel urlLabel = null;
		private JTextField urlfield = null;
		private final String defaultUrl = 
			"http://localhost:8080/SOAProject/services/RepairBillingService";
		private String url;

		/**
		 * @param args
		 * @throws AxisFault 
		 */
		public static void main(String[] args) throws AxisFault {
			new GUITest();
		}

		/**
		 * This is the default constructor
		 * @throws AxisFault 
		 */
		public GUITest() throws AxisFault {
			super("RBS Client");
			wsInit(defaultUrl);
			initialize();
		}
		
		public RepairBillingServiceStub stub;
		public void wsInit(String endpoint) throws AxisFault{
			stub = new RepairBillingServiceStub(endpoint);
		}
		
		/**
		 * This method initializes this JFrame
		 * 
		 * @return void
		 */
		private void initialize() {
			Container c = this.getContentPane();
	        c.setLayout(new FlowLayout());
			
	        jLabel = new JLabel();
	        jLabel.setText("ISBN:");
	        jLabel1 = new JLabel();
			jLabel1.setText("Result:");
			urlLabel = new JLabel();
			urlLabel.setText("URL:");
			isbnfield = new JTextField(10);
			resultfield = new JTextField(10);
			
			invokebutton = new JButton();
			invokebutton.setText("Invoke");
			
			url = defaultUrl;
			
			invokebutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//update endpoint URL with the value of urlfield
					url = urlfield.getText();
					try {
						stub = new RepairBillingServiceStub(url);
						Repai.GetBookPrice request = 
							new BookPriceServiceStub.GetBookPrice();
						BookPriceServiceStub.GetBookPriceResponse response;
						request.setIsbn(isbnfield.getText());
						
							response = stub.getBookPrice(request);
						resultfield.setText(String.valueOf(response.getPrice()));
					} catch (AxisFault e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
					catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} 
				}
			});
			
			urlfield = new JTextField(url);
			urlfield.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() == urlfield) 
					{ 
						try {
							stub = new BookPriceServiceStub(url);
						} catch (AxisFault e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} 
					}
				}
			}); 
		
			c.add(jLabel);
			c.add(isbnfield);
			c.add(invokebutton);
			c.add(jLabel1);
			c.add(resultfield);
			c.add(urlLabel);
			c.add(urlfield);
			
			this.addWindowListener(new WindowAdapter() { 
	            public void windowClosing(WindowEvent e) { 
	            	System.exit(0); 				
	            	}
		    });
		
			this.setSize(420, 150);
			this.setVisible(true);
		}

}
