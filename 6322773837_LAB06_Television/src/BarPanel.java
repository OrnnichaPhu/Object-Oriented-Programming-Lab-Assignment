import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class BarPanel extends JPanel{
	public BarPanel() {
		//Create controlpanel and textfield_ChVolDisplay
		JTextField displayText = new JTextField("Ch 35 Vol 45");
		
		
		//Add to this BarPanel panel
		this.setLayout(new FlowLayout());
		this.add(displayText);
		this.add(new ControlPanel());
	
			

	}
}