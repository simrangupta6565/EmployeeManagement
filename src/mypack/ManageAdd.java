package mypack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.*;
public class ManageAdd extends JFrame
implements ActionListener{
	JTextField txtName;
	JTextField txtEmail;
	JTextField txtEmployeeId;
	JButton btnSubmit;
	public void showGUI() {

		JFrame jf = new JFrame();
		jf.setSize(700,500);
		jf.setLocation(450,200);
		jf.setTitle("EmployeeDetails");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel lblTitle,lblName,lblEmployeeId,lblEmail;
		
		
		lblTitle = new JLabel("Employee Details");
		lblName = new JLabel("Name");
		lblEmail = new JLabel("Email");
		lblEmployeeId = new JLabel("Employee Id");
		txtName = new JTextField();
		txtEmail = new JTextField();
		txtEmployeeId = new JTextField();
		btnSubmit = new JButton("Submit");
		
		lblTitle.setBounds(180,20,130,30);
		lblEmployeeId.setBounds(80, 50, 130, 30);
		lblName.setBounds(80,100,130,30);
		lblEmail.setBounds(80,150,130,30);
		txtName.setBounds(220,50,200,30);
		txtEmail.setBounds(220,100,200,30);
		txtEmployeeId.setBounds(220,150,200,30);
		btnSubmit.setBounds(180,200,130,30);
		jf.add(lblTitle);
		
		jf.add(lblName);
		jf.add(lblEmail);
		jf.add(lblEmployeeId);
		jf.add(txtName);
		jf.add(txtEmail);
		jf.add(txtEmployeeId);
		jf.add(btnSubmit);
		btnSubmit.addActionListener(this);
		
		jf.setVisible(true);
		
	}
	public void Add(String Id, String name, String email)
			throws Exception
			{
				System.out.println(Id +" "+ name +" "+email);
				Integer id = Integer.parseInt(Id);
				Employee employee_details = new Employee();
				employee_details.setEmployeeId(id);
				employee_details.setEmployeeName(name);
				employee_details.setEmployeeEmail(email);
			
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("raj");
				EntityManager em = emf.createEntityManager();
				
				EntityTransaction et = em.getTransaction();
				et.begin();
				em.persist(employee_details);
				et.commit();
				JOptionPane.showMessageDialog(this,"Employee Added");
				em.close();
				emf.close();
			
			}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnSubmit)
		{
			String a = txtName.getText(), b = txtEmail.getText(), c = txtEmployeeId.getText();
			System.out.println(a+" "+b+" "+c);
			if(a.equals("")||b.equals("") || c.equals(""))
			{
				JOptionPane.showMessageDialog(this,"Invalid Credential");
			}
			else
			{
				ManageAdd l = new ManageAdd();
				try {
					l.Add(a, b, c );
					
					
					
		
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
	
		}
		
		
		
	}

}
