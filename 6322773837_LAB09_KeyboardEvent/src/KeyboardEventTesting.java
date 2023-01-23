import javax.swing.*;

public class KeyboardEventTesting extends JFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My Keyboard Event");
		KeyboardEvent KE = new KeyboardEvent();
		frame.add(KE);
		frame.setSize(800, 300); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
