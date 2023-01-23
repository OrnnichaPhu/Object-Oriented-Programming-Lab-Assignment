import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculator extends JPanel{
	//Exercise1
	JPanel panel1_UserInformation = new JPanel();
	JPanel panel2_HeightandWeight = new JPanel();
	JPanel panel3_BMIResult = new JPanel();
	
	JLabel InfoLB = new JLabel("Enter Your Information");
	JLabel HeightLB = new JLabel("Your Height (cm):");
	JLabel WeightLB = new JLabel("Your Weight (kg):");
	
	JTextField heightTF = new JTextField(30);
	JTextField weightTF = new JTextField(30);
	
	JButton CalBmiBT = new JButton("Compute BMI");
	JLabel bmiResultLB = new JLabel("BMI =");
	
	
	
	BMICalculator(){
		//panel1_UserInformation
		panel1_UserInformation.setLayout(new GridLayout(1,2));
		panel1_UserInformation.add(InfoLB);
		
		//panel2_HeightandWeight
		panel2_HeightandWeight.setLayout(new GridLayout(2,2));
		panel2_HeightandWeight.add(HeightLB);
		panel2_HeightandWeight.add(heightTF);
		panel2_HeightandWeight.add(WeightLB);
		panel2_HeightandWeight.add(weightTF);
		
		//panel3_BMIResult
		panel3_BMIResult.setLayout(new GridLayout(2,1));
		panel3_BMIResult.add(CalBmiBT);
		panel3_BMIResult.add(bmiResultLB);
		
		//register
		ActionInterpretor actinterListener= new ActionInterpretor();
		heightTF.addActionListener(actinterListener);
		weightTF.addActionListener(actinterListener);
		CalBmiBT.addActionListener(actinterListener);
	}
	
	class ActionInterpretor implements ActionListener{
		ActionInterpretor(){}

		public void actionPerformed(ActionEvent e) {
			double m = Double.parseDouble(heightTF.getText())/100;
			double kg = Double.parseDouble(weightTF.getText());
			double bmi = kg/(m*m);
			if(e.getSource() == CalBmiBT) {
				bmiResultLB.setText("BMI ="+ bmi);
			}
		}
		
	}

}