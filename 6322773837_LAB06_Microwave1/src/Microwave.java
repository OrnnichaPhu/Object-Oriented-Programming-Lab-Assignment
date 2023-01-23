import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {
	public Microwave() {
		//Call the method: MicrowaveComponents
		this.MicrowaveComponents();
		
		
		//Set JFrame
		this.setTitle("The Front View of a Microwave Oven");
		this.setSize(250,550);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		


	
	public void MicrowaveComponents() {
		//Create the first panel of MicrowaveLayout to position its components
		JPanel panal01_MicrowaveLayout = new JPanel();
		panal01_MicrowaveLayout.setLayout(new BorderLayout());
		
		
		
		
		
		
		//Add the first panel into the EAST of MicrowaveLayout
		this.add(panal01_MicrowaveLayout, BorderLayout.EAST);

		
		//Create a button to place foods at the CENTER of MicrowaveLayout
		JButton bottom_Food = new JButton("Food to be placed here");
		this.add(bottom_Food, BorderLayout.CENTER);
		
		//Create the second panel and set GridLayout for adding the button's numbers 
		JPanel panal02_NumberLayout = new JPanel();
		panal02_NumberLayout.setLayout(new GridLayout(4,3));
		
		

		

		//At the first panel, Create a textfield to display its time at the NORTH of MicrowaveLayout
		JTextField textfield_TimeDisplay = new JTextField("Microwave Time Display");
		panal01_MicrowaveLayout.add(textfield_TimeDisplay, BorderLayout.NORTH);


		//Use a FOR loop to add the button's numbers into the NumberLayout
		JButton[] arrayBottom = new JButton[9];
		for(int i = 0; i < 9;i++) {
			arrayBottom[i] = new JButton(""+i);
		}
		for(int i = 0; i < 9; i++) {
			panal02_NumberLayout.add(arrayBottom[i]);
		}
		

		
		//Create three button(Stop, 0, Start) and add them into the second JPanel
		JButton zero = new JButton("0");
		JButton start = new JButton("Start");
		JButton stop = new JButton("Stop");
		
		panal02_NumberLayout.add(stop);
		panal02_NumberLayout.add(zero);
		panal02_NumberLayout.add(start);


		//Add the second JPanel to the first panel at the CENTER of MicrowaveLayout
		panal01_MicrowaveLayout.add(panal02_NumberLayout, BorderLayout.CENTER);

		
	}
public static void main(String[] args) {
	Microwave myMicrowave = new Microwave();
	}
}
