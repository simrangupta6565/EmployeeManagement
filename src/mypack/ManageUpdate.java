package mypack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


  

public class ManageUpdate extends JFrame
implements ActionListener {
	 public static void showGUI() {    
	      JFrame frame = new JFrame("Swing Tester");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      createUI(frame);
	      frame.setSize(560, 200);      
	      frame.setLocationRelativeTo(null);  
	      frame.setVisible(true);
	   }
	 public static void createUI(final JFrame frame){  
	      JPanel panel = new JPanel();
	      LayoutManager layout = new FlowLayout();  
	      panel.setLayout(layout);       

	      JCheckBox checkBox1 = new JCheckBox("Check Me 1");
	      JCheckBox checkBox2 = new JCheckBox("Check Me 2");
	      checkBox2.setEnabled(false);
	      JCheckBox checkBox3 = new JCheckBox("Check Me 3");
	      checkBox3.setMnemonic(KeyEvent.VK_C);

	      checkBox1.addActionListener(new ActionListener() {
	        
	         public void actionPerformed(ActionEvent e) {
	            Object source = e.getSource();
	            JOptionPane.showMessageDialog(frame, 
	               ((JCheckBox)source).getText() + ": " + ((JCheckBox)source).isSelected());
	         }
	      });  

	      panel.add(checkBox1);
	      panel.add(checkBox2);
	      panel.add(checkBox3);

	      frame.getContentPane().add(panel, BorderLayout.CENTER);    
	   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}

   
