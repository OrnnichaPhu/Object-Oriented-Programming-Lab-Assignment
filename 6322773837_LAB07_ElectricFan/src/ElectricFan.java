
import javax.swing.*;
import java.awt.*;


public class ElectricFan extends JPanel{	//a subclass of JPanel 
	
	//ElectricFan(){}
	
	public void paintComponent(Graphics g) {
		//super.paintComponent(g);

		// Exercise 1: Fan's frame
		g.setColor(Color.GRAY);
		g.fillOval(295, 95, 210, 210);
		g.setColor(Color.WHITE);
		g.fillOval(300, 100, 200, 200);

		// Exercise 2: Fan's Blades
		

		// Exercise 3: Fan's neck 

		// Exercise 4: Fan's base

		// Exercise 5: Fan's speed buttons

		// Exercise 5: Four red round speed buttons

	}
	public static void main(String [] args) {
		JFrame frame = new JFrame();
		//frame.setTitle();
		frame.setSize(800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ElectricFan ef = new ElectricFan();
		frame.add(ef);

	}
}