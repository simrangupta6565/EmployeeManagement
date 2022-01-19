package mypack;
import javax.swing.*;
public class Report {

	public void showGUI() {
		JFrame jf = new JFrame();
		jf.setSize(1000,1000);
		jf.setLocation(00,00);
		jf.setTitle("My Employee Manager");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel lblTitle,lblSubTitle,lblEmpNameId;
		JButton btnSubmit;
		JTextField txtEmpNameId;
		
		lblTitle= new JLabel("Welcome Admin");
		lblTitle.setBounds(320,30,500,50);
		jf.add(lblTitle);
		
		lblSubTitle= new JLabel("Employee Report Details");
		lblSubTitle.setBounds(320,30,1000,100);
		jf.add(lblSubTitle);
		
		lblEmpNameId= new JLabel("Employee Name & Id");
		lblEmpNameId.setBounds(200,250,150,40);
		jf.add(lblEmpNameId);
		
		txtEmpNameId = new JTextField();
		txtEmpNameId.setBounds(400,250,150,30);
		jf.add(txtEmpNameId);
		
		
			
			
		btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(450,550,150,40);
		jf.add(btnSubmit);
		
		
		
		
		
		jf.add(lblTitle);
	
		
		
		
		jf.setVisible(true);
		
	}

}
