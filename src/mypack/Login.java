package mypack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame
implements ActionListener{
	
	JTextField tf1, tf2;
	JLabel l1, l2;
	JButton b,b2;
	public static void main(String[] args) {
		Login l = new Login();
		l.showGUI1();

	}

	private void showGUI1() {
		super.setBounds(500,50,1000,900);
		super.setTitle("LOGIN");
		super.setResizable(false);
		
		tf1 = new JTextField();
		tf1.setBounds(300,300,300,50);
		super.add(tf1);
		
		tf2 = new JTextField();
		tf2.setBounds(300,400,300,50);
		super.add(tf2);
		
		l1 = new JLabel("Email:");
		l1.setBounds(200, 300, 150, 50);
		super.add(l1);
		
		l2 = new JLabel("Password:");
		l2.setBounds(200, 400, 150, 50);
		super.add(l2);
		
		b = new JButton("LOGIN");
		b.setBounds(350,600,150,70);
		super.add(b);
		b.addActionListener(this);
		
		super.setLayout(null);
		
		super.setVisible(true);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}
	public int LogIn(String email, String pw)
			throws Exception
			{
				int f1 =0;
				if(email.equals("admin"))
					f1=1;
				int l =0;
				if(pw.equals("admin"))
					l=1;
				 int k =  (f1==0)? 1/*email not found*/ : (l==0)? 2/*password not found*/ : 3;
				 return k;
			
			}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b)
		{
			String a = tf1.getText(), b = tf2.getText();
			
			if(a.equals("")||b.equals(""))
			{
				JOptionPane.showMessageDialog(this,"Invalid Credential");
			}
			else
			{
				Login l = new Login();
				try {
					int i = l.LogIn(a, b);
					
					if(i==1)
					{
						JOptionPane.showMessageDialog(this,"Invalid Email");
						tf1.setText("");
					}
					if(i==2)
					{
						JOptionPane.showMessageDialog(this,"Invalid Password");
						tf2.setText("");
					}
					if(i==3)
					{
						JOptionPane.showMessageDialog(this,"Redirecting to next Step");
						MainMenu m = new MainMenu();
						m.showGUI3();
						super.dispose();
					}
					
		
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}
	
		}
		
		
		
	}

}
