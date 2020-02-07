
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class JSwing extends JFrame {
	private JTabbedPane tabbed;
	private JPanel panel1, panel2;
	private JTextField text1, text2 , text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, text13;
	private JTextField eText1, eText2, eText3, eText4, eText5, eText6, eText7, eText8, eText9, eText10, eText11, eText12, eText13;
	public JSwing()
	{
		//Title
		super("Converter");
		
		
		tabbed = new JTabbedPane();
		add(tabbed);
		
		panel1 = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		ActionHandling h = new ActionHandling();
	
		
		
		
		//
		// Distance TextFields
		//
		c.weightx = .2;
		text1 = new JTextField("Meters");
		text1.setEditable(false);
		c.gridx = 0;							//Meters text field
		c.gridy = 0;
		panel1.add(text1, c);
											
		eText1 = new JTextField("1");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;							//Editable Meters text field
		c.gridy = -1;
		eText1.addKeyListener(h);
		panel1.add(eText1, c);
		
		text2 = new JTextField("Kilometers");
		text2.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;							//Kilometers text field
		c.gridy = 0;
		panel1.add(text2, c);
		
		eText2 = new JTextField("0.001");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;							//Editable Kilometers text field
		c.gridy = -1;
		eText2.addKeyListener(h);
		panel1.add(eText2, c);
		
		text3 = new JTextField("Miles");
		text3.setEditable(false);
		c.fill = GridBagConstraints.NONE;		//Miles text field 
		c.gridx = 2;
		c.gridy = 0;
		panel1.add(text3, c);
		
		eText3 = new JTextField("0.00062150");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;							//Editable Miles text field
		c.gridy = -1;
		eText3.addKeyListener(h);
		panel1.add(eText3, c);
		
		text4 = new JTextField("Feet");
		text4.setEditable(false);
		c.fill = GridBagConstraints.NONE;		//Feet text field
		c.gridx = 3;
		c.gridy = 0;
		panel1.add(text4, c);
		
		eText4 = new JTextField("3.281");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;							// Editable Feet text field
		c.gridy = -1;
		eText4.addKeyListener(h);
		panel1.add(eText4, c);
		
		text5 = new JTextField("Inches");
		text5.setEditable(false);
		c.fill = GridBagConstraints.NONE;		// Inches text field
		c.gridx = 0;
		c.gridy = -2;
		panel1.add(text5, c);
		
		eText5 = new JTextField("39.37");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;							//Editable Inches text field
		c.gridy = -4;
		eText5.addKeyListener(h);
		panel1.add(eText5, c);
		
		text6 = new JTextField("Light Years");
		text6.setEditable(false);
		c.fill = GridBagConstraints.NONE;		//Light years text field
		c.gridx = 1;
		c.gridy = -2;
		panel1.add(text6, c);
		
		eText6 = new JTextField("1.056970721911003E-16");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;							// Editable light years text field
		c.gridy = -4;
		eText6.addKeyListener(h);
		panel1.add(eText6, c);
		
		text7 = new JTextField("Centimeters");
		text7.setEditable(false);
		c.fill = GridBagConstraints.NONE;		//Centimeters text field
		c.gridx = 2;
		c.gridy = -2;
		panel1.add(text7, c);
		
		eText7 = new JTextField("100");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;							//Editable Centimeters text field
		c.gridy = -4;
		eText7.addKeyListener(h);
		panel1.add(eText7, c);
		
		
		
		//
		//Mass panel
		//
		
		panel2 = new JPanel(new GridBagLayout());
		
		text8 = new JTextField("Pounds");
		c.fill = GridBagConstraints.NONE;
		text8.setEditable(false);				//Pounds text field 
		c.gridx = 0;
		c.gridy = 0;
		panel2.add(text8, c);
		
		eText8 = new JTextField("1");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;							//Editable pounds text field
		c.gridy = -1;
		eText8.addKeyListener(h);
		panel2.add(eText8, c);
		
		text9 = new JTextField("Kilograms");
		text9.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 1;							//Kilograms text field
		c.gridy = 0;
		panel2.add(text9, c);
		
		eText9 = new JTextField("0.454");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;							//Editable Kilograms text field
		c.gridy = -1;	
		eText9.addKeyListener(h);
		panel2.add(eText9, c);
		
		text10 = new JTextField("Grams");
		text10.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 2;							//Grams text field
		c.gridy = 0;
		panel2.add(text10, c);
		
		eText10 = new JTextField("454.000");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;							//Editable grams text field
		c.gridy = -1;	
		eText10.addKeyListener(h);
		panel2.add(eText10, c);
		
		text11 = new JTextField("Ounce");
		text11.setEditable(false);
		c.fill = GridBagConstraints.NONE;
		c.gridx = 3;							//Ounce text field
		c.gridy = 0;
		panel2.add(text11, c);
		
		eText11 = new JTextField("16.000");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;							//Editable ounce text field
		c.gridy = -1;
		eText11.addKeyListener(h);
		panel2.add(eText11, c);
		
		text12 = new JTextField("Milligram");
		text12.setEditable(false);
		c.fill = GridBagConstraints.NONE;		//Milligram text field
		c.gridx = 0;
		c.gridy = -2;
		panel2.add(text12, c);
		
		eText12 = new JTextField("453592.000");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;							//Editable milligram text field
		c.gridy = -4;
		eText12.addKeyListener(h);
		panel2.add(eText12, c);
		
		text13 = new JTextField("Micrograms");
		text13.setEditable(false);
		c.fill = GridBagConstraints.NONE;		//Microgram text field
		c.gridx = 1;
		c.gridy = -2;
		panel2.add(text13, c);
		
		eText13 = new JTextField("453600000.000");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;							// Editable mircogram text field
		c.gridy = -4;
		eText13.addKeyListener(h);
		panel2.add(eText13, c);
		
		
		
		
		tabbed.addTab("Distance", panel1);
		tabbed.addTab("Mass", panel2);
		
	}
	public class ActionHandling implements KeyListener
	{

		@Override
		public void keyPressed(KeyEvent e) {
			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			double num;
			double num2;
			String s;
			String format = "%.3f";
			
			//Validate info entered in the text field so that only numbers can be entered
			try {
			
				if(((JTextComponent) e.getSource()).getText().equals(""))
				{		
					
				}
				else
				{
					Double.parseDouble(((JTextComponent) e.getSource()).getText());				
				}
			} 
		catch (NumberFormatException x) {
	        	JOptionPane.showMessageDialog(panel1 ,"You must enter a number", "Error", JOptionPane.ERROR_MESSAGE);
	        	((JTextComponent) e.getSource()).setText("");
	        }	
			
			
			//test
			if(e.getSource() == eText1)
			{				
				num = Double.parseDouble(eText1.getText()) / 1000;
				s = String.format(format, num);
				eText2.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				s = String.format(format, num);
				eText3.setText(s);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				s = String.format(format, num);
				eText4.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				s = String.format(format, num);
				eText5.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				s = String.valueOf(num);
				eText6.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				s = String.format(format, num);
				eText7.setText(s);
			}
			if(e.getSource() == eText2)
			{	
				num = Double.parseDouble(eText2.getText()) * 1000;
				s = String.format(format, num);
				eText1.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				s = String.format(format, num);
				eText3.setText(s);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				s = String.format(format, num);
				eText4.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				s = String.format(format, num);
				eText5.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				s = String.valueOf(num);
				eText6.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				s = String.format(format, num);
				eText7.setText(s);
			}
			if(e.getSource() == eText3)
			{
				num = Double.parseDouble(eText3.getText()) * 1609;
				s = String.format(format, num);
				eText1.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				s = String.format(format, num);
				eText2.setText(s);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				s = String.format(format, num);
				eText4.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				s = String.format(format, num);
				eText5.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				s = String.valueOf(num);
				eText6.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				s = String.format(format, num);
				eText7.setText(s);
			}
			if(e.getSource() == eText4)
			{
				num = Double.parseDouble(eText4.getText()) / 3.281;
				s = String.format("%.5f", num);
				eText1.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				s = String.format("%.5f", num);
				eText2.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				s = String.format("%.5f", num);
				eText3.setText(s);
				
				num = Double.parseDouble(eText4.getText()) * 12;	//
				s = String.format("%.5f", num);
				eText5.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				s = String.valueOf(num);
				eText6.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				s = String.format("%.5f", num);
				eText7.setText(s);
			}
			if(e.getSource() == eText5)
			{
				num = Double.parseDouble(eText5.getText()) / 39.37;
				s = String.format("%.5f", num);
				eText1.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				s = String.format("%.5f", num);
				eText2.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				s = String.format("%.5f", num);
				eText3.setText(s);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				s = String.format("%.5f", num);
				eText4.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				s = String.valueOf(num);
				eText6.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				s = String.format("%.5f", num);
				eText7.setText(s);
			}
			if(e.getSource() == eText6)
			{
				num = Double.parseDouble(eText6.getText()) * 9.461e+15;
				s = String.valueOf(num);
				eText1.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				s = String.format(format, num);
				eText2.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				s = String.format(format, num);;
				eText3.setText(s);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				s = String.format(format, num);
				eText4.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				s = String.format(format, num);
				eText5.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 100;
				s = String.format(format, num);
				eText7.setText(s);
			}
			if(e.getSource() == eText7)
			{
				num = Double.parseDouble(eText7.getText()) / 100;
				s = String.format("%.6f", num);
				eText1.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1000;
				s = String.format("%.6f", num);
				eText2.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 1609;
				s = String.format("%.6f", num);
				eText3.setText(s);
	
				num = Double.parseDouble(eText1.getText()) * 3.281;
				s = String.format("%.6f", num);
				eText4.setText(s);
				
				num = Double.parseDouble(eText1.getText()) * 39.37;
				s = String.format("%.6f", num);
				eText5.setText(s);
				
				num = Double.parseDouble(eText1.getText()) / 9.461e+15;
				s = String.valueOf(num);
				eText6.setText(s);
			}
			
		
			
		////////////////////////////////////////////////	
			
			
			
			
			
			
			
			
			
			
			
			
			
			if(e.getSource() == eText8)
			{
				num2 = Double.parseDouble(eText8.getText()) / 2.205;
				s = String.format(format ,num2);
				eText9.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 454;
				s = String.format(format ,num2);
				eText10.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 16;
				s = String.format(format ,num2);
				eText11.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 453592;
				s = String.format(format ,num2);
				eText12.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 4.536e+8;
				s = String.format(format ,num2);
				eText13.setText(s);
				
			}
			if(e.getSource() == eText9)
			{
				num2 = Double.parseDouble(eText9.getText()) * 2.205;
				s = String.format(format ,num2);
				eText8.setText(s);
				
				num2 = Double.parseDouble(eText9.getText()) * 1000;
				s = String.format(format ,num2);
				eText10.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 16;
				s = String.format(format ,num2);
				eText11.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 453592;
				s = String.format(format ,num2);
				eText12.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 4.536e+8;
				s = String.format(format ,num2);
				eText13.setText(s);
				
			}
			if(e.getSource() == eText10)
			{
				num2 = Double.parseDouble(eText10.getText()) / 454;
				s = String.format(format ,num2);
				eText8.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) / 2.205;
				s = String.format(format ,num2);
				eText9.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 16;
				s = String.format(format ,num2);
				eText11.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 453592;
				s = String.format(format ,num2);
				eText12.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 4.536e+8;
				s = String.format(format ,num2);
				eText13.setText(s);
				
			}
			if(e.getSource() == eText11)
			{
				num2 = Double.parseDouble(eText11.getText()) / 16;
				s = String.format(format ,num2);
				eText8.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) / 2.205;
				s = String.format(format ,num2);
				eText9.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 454;
				s = String.format(format ,num2);
				eText10.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 453592;
				s = String.format(format ,num2);
				eText12.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 4.536e+8;
				s = String.format(format ,num2);
				eText13.setText(s);
				
			}
			if(e.getSource() == eText12)
			{
				num2 = Double.parseDouble(eText12.getText()) / 453592;
				s = String.format("%.10f" ,num2);
				eText8.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) / 2.205;
				s = String.format("%.10f" ,num2);
				eText9.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 454;
				s = String.format("%.10f" ,num2);
				eText10.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 16;
				s = String.format("%.10f" ,num2);
				eText11.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 4.536e+8;
				s = String.format("%.10f" ,num2);
				eText13.setText(s);
				
			}
			if(e.getSource() == eText13)
			{
				num2 = Double.parseDouble(eText13.getText()) / 4.536e+8;
				s = String.format("%.10f" ,num2);
				eText8.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) / 2.205;
				s = String.format("%.10f" ,num2);
				eText9.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 454;
				s = String.format("%.10f" ,num2);
				eText10.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 16;
				s = String.format("%.10f" ,num2);
				eText11.setText(s);
				
				num2 = Double.parseDouble(eText8.getText()) * 453592;
				s = String.format("%.10f" ,num2);
				eText12.setText(s);
				
			}
			
	
		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

		}

	
}

	



