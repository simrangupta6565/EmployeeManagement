package mypack;
import javax.swing.*;
public class Department {

	public void showGUI() {
		JFrame jf = new JFrame();
		jf.setSize(1000,1000);
		jf.setLocation(00,000);
		jf.setTitle("My Employee Manager");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel lblTitle,lblSubTitle,lblDepartment_details;
		JButton btnADD_DEPARTMENT,btnCancel;
		JTextField txtDepartmentName;
		
		lblTitle= new JLabel("Welcome Admin");
		lblTitle.setBounds(320,30,500,50);
		jf.add(lblTitle);
		
		lblSubTitle= new JLabel("Department Details");
		lblSubTitle.setBounds(320,30,1000,100);
		jf.add(lblSubTitle);
		
		lblDepartment_details= new JLabel("Department Name");
		lblDepartment_details.setBounds(200,250,150,40);
		jf.add(lblDepartment_details);
		
		txtDepartmentName = new JTextField();
		txtDepartmentName.setBounds(400,250,150,30);
		jf.add(txtDepartmentName);
		
		btnADD_DEPARTMENT = new JButton("ADD DEPARTMENT");
		btnADD_DEPARTMENT.setBounds(250,550,150,40);
		jf.add(btnADD_DEPARTMENT);
			
			
		btnCancel = new JButton("CANCEL");
		btnCancel.setBounds(450,550,150,40);
		jf.add(btnCancel);
		
		
		
		
		
		jf.add(lblTitle);
	
		
		
		
		jf.setVisible(true);
		
	}

}
