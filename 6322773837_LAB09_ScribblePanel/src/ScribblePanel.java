import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScribblePanel extends JPanel implements MouseListener, MouseMotionListener {
	int r = 20;
	int x = 0;
	int y = 0;

	
	ScribblePanel(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.setFocusable(true);
		
		
	}


	public void mouseDragged(MouseEvent e) {
		Graphics g = getGraphics();
		if(e.getModifiers() == InputEvent.BUTTON1_MASK) {
			g.setColor(Color.BLACK);
			g.drawLine(x, y, e.getX(), e.getY());
			x = e.getX();
			y = e.getY();
		}
		else {
			g.setColor(getBackground());
			g.fillOval(e.getX()-r, e.getY()-r, 2*r, 2*r);
			x = e.getX();
			y = e.getY();
		}
	}

	public void mouseMoved(MouseEvent e) {}
	

	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		if(e.getModifiers() == InputEvent.BUTTON1_MASK) {
			repaint();
		}
	}

	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		}

	public void mouseReleased(MouseEvent e) {}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

}
