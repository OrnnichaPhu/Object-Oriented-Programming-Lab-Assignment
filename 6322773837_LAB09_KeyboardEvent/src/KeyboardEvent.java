import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyboardEvent extends JPanel implements KeyListener {
	//String message = " ";
	String message = "Tarn  stays safe from COVID-19.";
	
	
	KeyboardEvent(){
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font mf = new Font("SansSerif",Font.BOLD, 32);
		g.setFont(mf);
		g.setColor(Color.BLUE);
		//g.drawString(("Tarn  stays safe from COVID-19."+message), 0, 100);
		g.drawString(message, 0, 100);
		
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		message = Character.toString(ke.getKeyChar());
		repaint();
	}

	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}

}
