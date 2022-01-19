package mypack;
import javax.swing.*;
public class Grade {

	public void showGUI() {
		JFrame jf = new JFrame();
		jf.setSize(1000,1000);
		jf.setLocation(00,00);
		jf.setTitle("MY Employee Manager");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel lblTitle,lblSubTitle,lblGrade_Name,lblBasic,lblTravel_Allowance,lblMedical_Allowance,lblProvident_fund,lblGrade_Short_Name,lblHRA,lblBonus,lblProfessional_Tax,lblDearness_Allowance;
		JTextField txtGrade_Name,txtBasic,txtTravel_Allowance,txtMedical_Allowance,txtProvident_fund,txtGrade_Short_Name,txtHRA,txtBonus,txtProfessional_Tax,txtDearness_Allowance;
		JButton btnADD_GRADE,btnCLEAR;
		
		lblTitle= new JLabel("Welcome Admin");
		lblTitle.setBounds(320,30,500,50);
		jf.add(lblTitle);
		
		lblSubTitle= new JLabel("Grade details");
		lblSubTitle.setBounds(320,30,1000,100);
		jf.add(lblSubTitle);
		
		lblGrade_Name = new JLabel(" Grade Name");
		lblGrade_Name.setBounds(50,150,100,30);
		jf.add(lblGrade_Name);
		
		txtGrade_Name = new JTextField();
		txtGrade_Name.setBounds(200,150,150,30);
		jf.add(txtGrade_Name);
		
		lblBasic = new JLabel("Basic");
		lblBasic.setBounds(50,200,100,30);
		jf.add(lblBasic);
		
		txtBasic = new JTextField();
		txtBasic.setBounds(200,200,150,30);
		jf.add(txtBasic);
		
		lblTravel_Allowance = new JLabel("Travel Allowance");
		lblTravel_Allowance.setBounds(50,250,100,30);
		jf.add(lblTravel_Allowance);
		
		txtTravel_Allowance = new JTextField();
		txtTravel_Allowance.setBounds(200,250,150,30);
		jf.add(txtTravel_Allowance);
		
		
		lblMedical_Allowance = new JLabel("Medical Allowance");
		lblMedical_Allowance.setBounds(50,300,100,30);
		jf.add(lblMedical_Allowance);
		
		txtMedical_Allowance = new JTextField();
		txtMedical_Allowance.setBounds(200,300,150,30);
		jf.add(txtMedical_Allowance);
		
		
		lblProvident_fund = new JLabel("Provident Fund");
		lblProvident_fund.setBounds(50,350,100,30);
		jf.add(lblProvident_fund);
		
		txtProvident_fund = new JTextField();
		txtProvident_fund.setBounds(200,350,150,30);
		jf.add(txtProvident_fund);
		
		lblGrade_Short_Name = new JLabel("Grade Short Name");
		lblGrade_Short_Name.setBounds(400,150,200,30);
		jf.add(lblGrade_Short_Name);
		
		txtGrade_Short_Name = new JTextField();
		txtGrade_Short_Name.setBounds(600,150,150,30);
		jf.add(txtGrade_Short_Name);
		
		
		lblDearness_Allowance = new JLabel("Dearness_Allowance");
		lblDearness_Allowance.setBounds(400,200,200,30);
		jf.add(lblDearness_Allowance);
		
		txtDearness_Allowance = new JTextField();
		txtDearness_Allowance.setBounds(600,200,150,30);
		jf.add(txtDearness_Allowance);
		
		lblHRA = new JLabel("HRA");
		lblHRA.setBounds(400,250,100,30);
		jf.add(lblHRA);
		
		txtHRA = new JTextField();
		txtHRA.setBounds(600,250,150,30);
		jf.add(txtHRA);
		
		lblBonus = new JLabel("Bonus");
		lblBonus.setBounds(400,300,100,30);
		jf.add(lblBonus);
		
		txtBonus = new JTextField();
		txtBonus.setBounds(600,300,150,30);
		jf.add(txtBonus);
		
		
		lblProfessional_Tax = new JLabel("Professional Tax");
		lblProfessional_Tax.setBounds(400,350,100,30);
		jf.add(lblProfessional_Tax);
		
		txtProfessional_Tax = new JTextField();
		txtProfessional_Tax.setBounds(600,350,150,30);
		jf.add(txtProfessional_Tax);
		
		
		
		
		btnADD_GRADE = new JButton("ADD_GRADE");
		btnADD_GRADE.setBounds(250,550,150,40);
		jf.add(btnADD_GRADE);
		
		btnCLEAR = new JButton("CLEAR");
		btnCLEAR.setBounds(450,550,150,40);
		jf.add(btnCLEAR);
		
		
	
		jf.setVisible(true);
		
	}

}
