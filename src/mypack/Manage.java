package mypack;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
public class Manage extends JFrame
implements ActionListener {
	JButton btnAdd,btnSearch,btnRemove,btnUpdate;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;

	   private JFrame mainFrame =new JFrame();
		JFrame jf = new JFrame();
	public void showGUI() {
		   
	
		jf.setBounds(500,50,1000,900);
		jf.setTitle("Employee Details");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		
		JLabel lblTitle;
		
		
		lblTitle = new JLabel("Employee Details");
		btnAdd = new JButton("Add");
		btnSearch = new JButton("Search");
		btnRemove = new JButton("Remove");
		btnUpdate = new JButton("Update");
		
		lblTitle.setBounds(430,20,200,40);
		btnAdd.setBounds(420,80,100,40);
		btnSearch.setBounds(530,80,100,40);
		btnRemove.setBounds(420,140,100,40);
		btnUpdate.setBounds(530,140,100,40);
		
		
		jf.add(lblTitle);
		jf.add(btnAdd);
		btnAdd.addActionListener(this);
		jf.add(btnSearch);
		btnSearch.addActionListener(this);
		jf.add(btnRemove);
		btnRemove.addActionListener(this);
		jf.add(btnUpdate);
		btnUpdate.addActionListener(this);
		
		
		
		jf.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd)
		{

			ManageAdd a = new ManageAdd();
			a.showGUI();
			
	
		}
		
		else if(e.getSource()==btnSearch)
		{
			ManageSearch s = new ManageSearch();
			s.showGUI();
			

			}
		
		else if(e.getSource()==btnRemove)
		{
			ManageRemove w = new ManageRemove();
			w.showGUI();
		

			}
		
		else if(e.getSource()==btnUpdate)
		{
		ManageUpdate b  = new ManageUpdate();
			b.showGUI();
			

			}
	}

}
