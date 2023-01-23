import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class Television extends JFrame {
	
	public Television(String title) {
		//Call a method TelevisionComponents
		TelevisionComponents();

		//set JFrame
		this.setTitle("My Television");
		this.setSize(900,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public void TelevisionComponents() {
		//create abutton_TelevisionScreen and panal_TelevisionButtonBar
		this.setLayout(new BorderLayout());
		JButton screen = new JButton();
		BarPanel BP = new BarPanel();
		//Add to this Television
		this.add(screen,BorderLayout.CENTER);
		this.add(BP,BorderLayout.SOUTH);

	}
}