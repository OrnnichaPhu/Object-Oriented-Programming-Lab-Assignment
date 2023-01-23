import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//Inherit appropriate superclass 
public class ControlPanel extends JPanel{
	public ControlPanel() {		
		
		//create a On/Of button and add to the power panel 
		JButton on_off = new JButton("On/Off");
		
		//create two adjust panels and add to the layout of this control Panel
		AdjustPanel ch = new AdjustPanel("Ch");
		AdjustPanel vol = new AdjustPanel("Vol");
		this.add(ch);
		this.add(vol);
		this.add(on_off);
		

	}
}