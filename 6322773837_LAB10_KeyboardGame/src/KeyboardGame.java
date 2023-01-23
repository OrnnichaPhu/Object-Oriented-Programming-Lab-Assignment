import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;

public class KeyboardGame extends JPanel implements ActionListener, KeyListener{
	
	Timer timer = new Timer(1000,this);
	int score = 0;
	char displayChar = 'A';
	char respondChar = '?';
	Font myfont = new Font("SanSerif", Font.BOLD,45);
	
	KeyboardGame(){
		this.addKeyListener(this);
		this.setFocusable(true);
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		g.setFont(myfont);
		super.paintComponent(g);
		
		displayChar = getRandomChar();
		g.drawString("Letter: "+ displayChar, 75,75);
		g.drawString("Your Typed: ", 75,150);
		g.setColor(Color.BLUE);
		g.drawString(" " + respondChar, 380,150);
		g.drawString("Your Score: " + score, 75,225);
		
		
		
		
	}
	
	public char getRandomChar() {
		Random random = new Random();
		return (char) (65 + random.nextInt(26));
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame(); //create an object of this frame
		KeyboardGame k = new KeyboardGame(); //create an object of BMICaculator
		frame.add(k); //add JPanel into JFrame
		//set a frame's resolution
		frame.setTitle("My Keyboard Game");
		frame.setSize(500, 300); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set default Close Operation
	}

	public void keyTyped(KeyEvent e) {
		respondChar = e.getKeyChar();
		if(respondChar == displayChar) {
			score ++;
			repaint();
		}
	}

	public void keyPressed(KeyEvent e) {}

	public void keyReleased(KeyEvent e) {}

	public void actionPerformed(ActionEvent e) {
		repaint();
	}

}
