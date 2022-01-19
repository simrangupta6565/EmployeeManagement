package mypack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainMenu extends JFrame
implements ActionListener {
	JButton  b1, b2, b3, b4, b5, b6;
	public void showGUI3() {
		super.setBounds(500,50,1000,900);
		super.setTitle("MAIN MENU");
		super.setResizable(false);
		
		b1 = new JButton("MANAGE EMPLOYEE");
		b1.setBounds(350, 100, 300, 50);
		super.add(b1);
		b1.addActionListener(this);
		
		
		b2 = new JButton("ADD NEW DEPARTMENT");
		b2.setBounds(350, 200, 300, 50);
		super.add(b2);
		b2.addActionListener(this);
		
		b3 = new JButton("ADD NEW GRADE");
		b3.setBounds(350, 300, 300, 50 );
		super.add(b3);
		b3.addActionListener(this);
		
		
		b4 = new JButton("EMPLOYEE GRADE DETAILS");
		b4.setBounds(350, 400, 300, 50);
		super.add(b4);
		b4.addActionListener(this);
		
		b5 = new JButton("PREPARE MONTHLY SALARY");
		b5.setBounds(350, 500, 300, 50);
		super.add(b5);
		b5.addActionListener(this);
		
		
		b6= new JButton("GENERATE REPORT");
		b6.setBounds(350, 600, 300, 50);
		super.add(b6);
		b6.addActionListener(this);
		
		
		
		super.setLayout(null);
		
		super.setVisible(true);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{

			Manage o = new Manage();
			o.showGUI();
			super.dispose();
	
		}
		else if(e.getSource()==b2){
			Department d = new Department();
			d.showGUI();
			
		}
		else if(e.getSource()==b3){
					NewGrade n= new NewGrade();
					n.showGUI();
					
				}
		else if(e.getSource()==b4){
			Grade g = new Grade();
			g.showGUI();
			
		}
		else if(e.getSource()==b5){
			Salary s = new Salary();
			s.showGUI();
			
		}
		else if(e.getSource()==b6){
			Report r = new Report();
			r.showGUI();
			
		}
		
	}

}
