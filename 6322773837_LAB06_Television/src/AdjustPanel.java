import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class AdjustPanel extends JPanel{
	String text;

	public AdjustPanel(String centerText) {
		//create three buttons: Less, center text, and more 
		JButton decrease = new JButton("<<");
		JButton text = new JButton("centerText");
		JButton increase = new JButton(">>");
		

		//Add to this AdjustPanel panel
		this.add(decrease);
		this.add(text);
		this.add(increase);

	}
}