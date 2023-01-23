import java.awt.BorderLayout;

import javax.swing.*;

public class ScribblePenelTesting extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Scribble Panel");
		ScribblePanel SCP = new ScribblePanel();
		frame.setLayout(new BorderLayout());
		frame.add(SCP, BorderLayout.CENTER);
		frame.setSize(300, 300); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	}

}
