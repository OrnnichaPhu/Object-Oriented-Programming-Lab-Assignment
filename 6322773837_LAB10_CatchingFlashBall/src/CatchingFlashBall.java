import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CatchingFlashBall extends JPanel{
	TimerListener TL = new TimerListener();
	Catcher c = new Catcher();
	Timer timer = new Timer(1000,TL);
	
	int max;
	Point m;
	int xcenter;
	int ycenter;
	int r = 20;
	double r2;
	CatchingFlashBall(){
		this.setBackground(Color.BLACK);
		this.addMouseListener(c);
		timer.start();
		
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.orange);
		g.fillOval(xcenter, ycenter, r, r);
	}
	

	public static void main(String[] args) {
		JFrame frame = new JFrame(); //create an object of this frame
		CatchingFlashBall cfball = new CatchingFlashBall(); //create an object of CatchingFlashingBall
		frame.add(cfball); //add JPanel into JFrame
		//set a frame's resolution
		frame.setTitle("My Catching FlashBall"); //set Title of this frame
		frame.setSize(600, 400); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set default Close Operation

	}
	public class TimerListener implements ActionListener{
		public int nextInt(int max) {
			Random random = new Random();
			return (random.nextInt(max));
		}
		public void actionPerformed(ActionEvent e) {
			if(m != null) {
				if(r < r2) {
					xcenter = nextInt(getWidth());
					ycenter = nextInt(getHeight());
					repaint();
				}
			}
			else {				
				xcenter = nextInt(getWidth());
				ycenter = nextInt(getHeight());
				repaint();
			}			
		}		
	}


	
	public class Catcher implements MouseListener{
		double calculateDistance(int x1, int y1, int x2, int y2) {
			return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		}
		public void mouseClicked(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {
			m = e.getPoint();
			int x2 = (int) m.getX();
			int y2 = (int) m.getY();
			r2 = calculateDistance(xcenter,ycenter,x2,y2);
			
		}
		public void mouseReleased(MouseEvent e) {
			m = null;
		}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}		
	}

}
