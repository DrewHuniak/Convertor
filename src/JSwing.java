import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.Format;

import javax.swing.*;

public class JSwing extends JFrame {
	private JTabbedPane tabbed;
	private JPanel panel1, panel2;
	private JTextField text1, text2 , text3, text4, text5, text6, text7;
	private JTextField eText1, eText2, eText3, eText4, eText5, eText6, eText7;
	public JSwing()
	{
		super("Converter");
		
		
		tabbed = new JTabbedPane();
		add(tabbed);
		
		panel1 = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		ActionHandling h = new ActionHandling();
	//	Verifier v = new Verifier();
		
		c.weightx = .2;
		
		
		text1 = new JTextField("Meters");
		text1.setEditable(false);
		c.gridx = 0;
		c.gridy = 0;
		panel1.add(text1, c);
		
		eText1 = new JTextField("1");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = -1;
		//v.verify(eText1);
		eText1.addKeyListener(h);
		panel1.add(eText1, c);
		
		text2 = new JTextField("Kilometers");
		text2.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;
		c.gridy = 0;
		panel1.add(text2, c);
		
		eText2 = new JTextField("0.001");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = -1;
		eText2.addKeyListener(h);
		panel1.add(eText2, c);
		
		text3 = new JTextField("Miles");
		text3.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 2;
		c.gridy = 0;
		panel1.add(text3, c);
		
		eText3 = new JTextField("0.00062150");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = -1;
		eText3.addKeyListener(h);
		panel1.add(eText3, c);
		
		text4 = new JTextField("Feet");
		text4.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 3;
		c.gridy = 0;
		panel1.add(text4, c);
		
		eText4 = new JTextField("3.281");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = -1;
		eText4.addKeyListener(h);
		panel1.add(eText4, c);
		
		text5 = new JTextField("Inches");
		text5.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 0;
		c.gridy = -2;
		panel1.add(text5, c);
		
		eText5 = new JTextField("39.37");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = -4;
		eText5.addKeyListener(h);
		panel1.add(eText5, c);
		
		text6 = new JTextField("Light Years");
		text6.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;
		c.gridy = -2;
		panel1.add(text6, c);
		
		eText6 = new JTextField("1.056970721911003E-16");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = -4;
		eText6.addKeyListener(h);
		panel1.add(eText6, c);
		
		text7 = new JTextField("Centimeters");
		text7.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 2;
		c.gridy = -2;
		panel1.add(text7, c);
		
		eText7 = new JTextField("100");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = -4;
		eText7.addKeyListener(h);
		panel1.add(eText7, c);
		
		
		panel2 = new JPanel();
		
		
		
		
		tabbed.addTab("Distance", panel1);
		tabbed.addTab("Weight", panel2);
		
		
//		JTextField textField = (JTextField) comp;
//        try {
//          Integer.parseInt(textField.getText());
//          returnValue = true;
//        } catch (NumberFormatException e) {
//          returnValue = false;
//        }
				
		
		
	}
	public class ActionHandling implements KeyListener
	{

		@Override
		public void keyPressed(KeyEvent e) {
			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			double num;
		 //String regex = "[a-zA-Z]+"; 

			if(e.getSource() == eText1)
			{	
//				if(eText1.getText().matches(regex))
//				{
//					JOptionPane.showMessageDialog(panel1 ,"You must enter a number", "Error", JOptionPane.ERROR_MESSAGE);
//				}
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				String kilometers = String.valueOf(num);
				eText2.setText(kilometers);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				String miles = String.format("%.8f", num);
				eText3.setText(miles);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				String feet = String.valueOf(num);
				eText4.setText(feet);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				String inches = String.format("%.2f",num);
				eText5.setText(inches);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				String lightYears = String.valueOf(num);
				eText6.setText(lightYears);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				String centimeters = String.valueOf(num);
				eText7.setText(centimeters);
			}
			if(e.getSource() == eText2)
			{	
				num = Double.parseDouble(eText2.getText()) * 1000;
				String meters = String.valueOf(num);
				eText1.setText(meters);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				String miles = String.format("%.8f", num);
				eText3.setText(miles);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				String feet = String.valueOf(num);
				eText4.setText(feet);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				String inches = String.format("%.2f",num);
				eText5.setText(inches);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				String lightYears = String.valueOf(num);
				eText6.setText(lightYears);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				String centimeters = String.valueOf(num);
				eText7.setText(centimeters);
			}
			if(e.getSource() == eText3)
			{
				num = Double.parseDouble(eText3.getText()) * 1609;
				String meters = String.valueOf(num);
				eText1.setText(meters);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				String kilometers = String.valueOf(num);
				eText2.setText(kilometers);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				String feet = String.valueOf(num);
				eText4.setText(feet);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				String inches = String.format("%.2f",num);
				eText5.setText(inches);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				String lightYears = String.valueOf(num);
				eText6.setText(lightYears);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				String centimeters = String.valueOf(num);
				eText7.setText(centimeters);
			}
			if(e.getSource() == eText4)
			{
				num = Double.parseDouble(eText4.getText()) / 3.281;
				String meters = String.valueOf(num);
				eText1.setText(meters);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				String kilometers = String.valueOf(num);
				eText2.setText(kilometers);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				String miles = String.format("%.8f", num);
				eText3.setText(miles);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				String inches = String.format("%.2f",num);
				eText5.setText(inches);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				String lightYears = String.valueOf(num);
				eText6.setText(lightYears);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				String centimeters = String.valueOf(num);
				eText7.setText(centimeters);
			}
			if(e.getSource() == eText5)
			{
				num = Double.parseDouble(eText5.getText()) / 39.37;
				String meters = String.valueOf(num);
				eText1.setText(meters);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				String kilometers = String.valueOf(num);
				eText2.setText(kilometers);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				String miles = String.format("%.8f", num);
				eText3.setText(miles);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				String feet = String.valueOf(num);
				eText4.setText(feet);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				String lightYears = String.valueOf(num);
				eText6.setText(lightYears);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				String centimeters = String.valueOf(num);
				eText7.setText(centimeters);
			}
			if(e.getSource() == eText6)
			{
				num = Double.parseDouble(eText6.getText()) * 9.461e+15;
				String meters = String.valueOf(num);
				eText1.setText(meters);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				String kilometers = String.valueOf(num);
				eText2.setText(kilometers);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				String miles = String.format("%.8f", num);
				eText3.setText(miles);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				String feet = String.valueOf(num);
				eText4.setText(feet);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				String inches = String.format("%.2f",num);
				eText5.setText(inches);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				String centimeters = String.valueOf(num);
				eText7.setText(centimeters);
			}
			if(e.getSource() == eText7)
			{
				num = Double.parseDouble(eText7.getText()) / 100;
				String meters = String.valueOf(num);
				eText1.setText(meters);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				String kilometers = String.valueOf(num);
				eText2.setText(kilometers);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				String miles = String.format("%.8f", num);
				eText3.setText(miles);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				String feet = String.valueOf(num);
				eText4.setText(feet);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				String inches = String.format("%.2f",num);
				eText5.setText(inches);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				String lightYears = String.valueOf(num);
				eText6.setText(lightYears);
			}
	
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
//			 String regex = "[a-zA-Z]+"; 
//			 if(eText1.getText().matches(regex))
//					{
//						JOptionPane.showMessageDialog(panel1 ,"You must enter a number", "Error", JOptionPane.ERROR_MESSAGE);
//					}
		}

		}
//	public class Verifier extends InputVerifier 
//	{
//
//		@Override
//		public boolean verify(JComponent input) {
//			JTextField textField = (JTextField) input;
//	        try {
//	          Integer.parseInt(textField.getText());
//	          return true;
//	        } catch (NumberFormatException e) {
//	        	JOptionPane.showMessageDialog(panel1 ,"You must enter a number", "Error", JOptionPane.ERROR_MESSAGE);
//	          return false;
//	        }
//	
//		}
//		
//	}
	
}

	



