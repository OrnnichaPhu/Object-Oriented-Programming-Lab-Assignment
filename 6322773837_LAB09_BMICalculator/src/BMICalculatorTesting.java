import java.awt.BorderLayout;

import javax.swing.*;

public class BMICalculatorTesting extends JFrame{

	public static void main(String[] args) {
		//Exercise1
		JFrame frame = new JFrame("My BMI Calculator");
		BMICalculator bmiCal = new BMICalculator();
		frame.add(bmiCal.panel1_UserInformation, BorderLayout.NORTH);
		frame.add(bmiCal.panel2_HeightandWeight, BorderLayout.CENTER);
		frame.add(bmiCal.panel3_BMIResult, BorderLayout.SOUTH);
		frame.setSize(400, 200); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
