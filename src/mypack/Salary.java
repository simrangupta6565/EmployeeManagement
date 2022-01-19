package mypack;
import javax.swing.*;
public class Salary {

	public void showGUI() {
		JFrame jf = new JFrame();
		jf.setSize(1000,1000);
		jf.setLocation(00,00);
		jf.setTitle("MY Employee Manager");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel lblTitle,lblSubTitle,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField T1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
		JButton btnADD_GRADE,btnCLEAR;
		
		lblTitle= new JLabel("Welcome Admin");
		lblTitle.setBounds(320,30,500,50);
		jf.add(lblTitle);
		
		lblSubTitle= new JLabel("Grade details");
		lblSubTitle.setBounds(320,30,1000,100);
		jf.add(lblSubTitle);
		
		l1 = new JLabel(" Employee Id & Name");
		l1.setBounds(50,150,200,30);
		jf.add(l1);
		
		T1 = new JTextField();
		T1.setBounds(200,150,150,30);
		jf.add(T1);
		
		l2 = new JLabel("Current Grade Name");
		l2.setBounds(50,200,200,30);
		jf.add(l2);
		
		t2 = new JTextField();
		t2.setBounds(200,200,150,30);
		jf.add(t2);
		
		l3 = new JLabel("Employee Salary Month");
		l3.setBounds(50,250,200,30);
		jf.add(l3);
		
		t3 = new JTextField();
		t3.setBounds(200,250,150,30);
		jf.add(t3);
		
		
		l4 = new JLabel("HRA");
		l4.setBounds(50,300,100,30);
		jf.add(l4);
		
		t4 = new JTextField();
		t4.setBounds(200,300,150,30);
		jf.add(t4);
		
		
		l5 = new JLabel("TA");
		l5.setBounds(50,350,100,30);
		jf.add(l5);
		
		t5 = new JTextField();
		t5.setBounds(200,350,150,30);
		jf.add(t5);
		
		l6 = new JLabel("Bonus");
		l6.setBounds(400,150,200,30);
		jf.add(l6);
			
		t6 = new JTextField();
		t6.setBounds(600,150,150,30);
		jf.add(t6);
		
		
		l7 = new JLabel("Provident Fund");
		l7.setBounds(400,200,200,30);
		jf.add(l7);
		
		t7 = new JTextField();
		t7.setBounds(600,200,150,30);
		jf.add(t7);
		
		l8 = new JLabel("Net Salary");
		l8.setBounds(400,250,100,30);
		jf.add(l8);
		
		t8 = new JTextField();
		t8.setBounds(600,250,150,30);
		jf.add(t8);
				
		l9 = new JLabel("Current Department Name");
		l9.setBounds(400,300,200,30);
		jf.add(l9);
		
		t9= new JTextField();
		t9.setBounds(600,300,150,30);
		jf.add(t9);
		
		
		l10 = new JLabel("Employee Salary Year");
		l10.setBounds(400,350,200,30);
		jf.add(l10);
		
		t10 = new JTextField();
		t10.setBounds(600,350,150,30);
		jf.add(t10);
		
		
		
		
		btnADD_GRADE = new JButton("ADD_GRADE");
		btnADD_GRADE.setBounds(250,550,150,40);
		jf.add(btnADD_GRADE);
		
		btnCLEAR = new JButton("CLEAR");
		btnCLEAR.setBounds(450,550,150,40);
		jf.add(btnCLEAR);
		
		
	
		jf.setVisible(true);
		
	}

}
