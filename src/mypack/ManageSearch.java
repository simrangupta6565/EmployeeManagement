package mypack;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class ManageSearch {

	JFrame jf = new JFrame();
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	public void showGUI() {
		jf.setBounds(500,50,1000,900);
		jf.setTitle("Employee Details");
		jf.setLayout(new GridLayout(3, 1));

	      jf.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });    
	      JLabel headerLabel = new JLabel("", JLabel.CENTER);        
	      statusLabel = new JLabel("",JLabel.CENTER);    
	      statusLabel.setSize(350,100);

	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());

	      jf.add(headerLabel);
	      jf.add(controlPanel);
	      jf.add(statusLabel);
	      jf.setVisible(true);  
	      headerLabel.setText("Control in action: JTable"); 

	      String[] columnNames = {"Employee ID", "Employee Name", "Employee Email"};
	      Object[][] data = {
	         {"Vibha", 150000},
	         {"Saatvik", 71000}
	      };
	      JTable table = new JTable(data, columnNames);
	      JScrollPane scrollPane = new JScrollPane(table);
	      scrollPane.setSize(300, 300);
	      table.setFillsViewportHeight(true);
	      controlPanel.add(scrollPane);      
	      jf.setVisible(true);     
	}

}
