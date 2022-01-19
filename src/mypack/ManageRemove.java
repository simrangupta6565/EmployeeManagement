package mypack;
import javax.swing.*;
public class ManageRemove {

	public void showGUI() {
		JFrame jf = new JFrame();
		jf.setSize(700,500);
		jf.setLocation(450,200);
		jf.setTitle("Remove Employee");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		
		JLabel lblTitle;
		JButton btnSearch,btnBack;
		JTextField txtEmpID;
		
		lblTitle = new JLabel("Employee ID ");
		btnSearch = new JButton("Search");
		btnBack = new JButton("Back");
		txtEmpID = new JTextField();
		
		
		lblTitle.setBounds(40,60,250,30);
		btnSearch.setBounds(240,150,100,30);
		btnBack.setBounds(360,150,100,30);
		txtEmpID.setBounds(240,60,220,30);
		
		
		
		jf.add(lblTitle);
		jf.add(btnSearch);
		jf.add(btnBack);
		jf.add(txtEmpID);
		
		
		jf.setVisible(true);
		
	}

}
