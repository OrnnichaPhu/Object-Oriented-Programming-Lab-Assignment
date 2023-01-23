import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingMessagePanel extends JPanel implements ActionListener, ItemListener, MouseMotionListener{
	JPanel ColorPanel = new JPanel();
	JPanel MessagePanel = new JPanel();
	JPanel DirectionPanel = new JPanel();
	JPanel RadiobuttonPanel = new JPanel();
	
	//ColorPanel
	JLabel ColorLB = new JLabel("Background Color");
	JRadioButton whiteBT = new JRadioButton("white");
	JRadioButton blackBT = new JRadioButton("black");
	
	//MessagePanel
	JLabel messageLB = new JLabel("Message to be displayed");
	JTextField blankTF = new JTextField("6322773837 S1G5 Tarn",40);
	Color textcolor;
	
	//DirectionPanel
	JButton leftBT = new JButton("Left");
	JButton rightBT = new JButton("Right");
	JButton upBT = new JButton("Up");
	JButton downBT = new JButton("Down");
	
	//RaiobuttonPanel
	JRadioButton useMouseBT = new JRadioButton("Use Mouse");
	
	String message = " ";
	int x = getX();
	int y = 100;
	
	public MovingMessagePanel(String s){
		JFrame frame = new JFrame(s);
		frame.setLayout(new BorderLayout());
		//add component + location
		frame.add(this, BorderLayout.CENTER);
		frame.add(MessagePanel, BorderLayout.NORTH);
		frame.add(ColorPanel, BorderLayout.WEST);
		frame.add(DirectionPanel, BorderLayout.SOUTH);
		frame.add(RadiobuttonPanel, BorderLayout.EAST);
		
		//MessagePanel add component + location
		MessagePanel.setLayout(new FlowLayout());
		MessagePanel.add(messageLB);
		MessagePanel.add(blankTF);
		
		//ColorPanel add component + location
		ColorPanel.setLayout(new GridLayout(3,1));
		ColorPanel.add(ColorLB);
		ColorPanel.add(whiteBT);
		ColorPanel.add(blackBT);

		
		//DirectionPanel add component + location
		DirectionPanel.setLayout(new FlowLayout());
		DirectionPanel.add(leftBT);
		DirectionPanel.add(rightBT);
		DirectionPanel.add(upBT);
		DirectionPanel.add(downBT);
		
		//RadiobuttonPanel add component + location
		RadiobuttonPanel.setLayout(new BorderLayout());
		RadiobuttonPanel.add(useMouseBT, BorderLayout.CENTER);
		
		//add register
		blankTF.addActionListener(this);
		
		blackBT.addItemListener(this);		
		whiteBT.addItemListener(this);
		
		
		leftBT.addActionListener(this);
		rightBT.addActionListener(this);
		upBT.addActionListener(this);
		downBT.addActionListener(this);
		
		this.addMouseMotionListener(this);
		useMouseBT.addActionListener(this);
		
		frame.setVisible(true);
		frame.setSize(800,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font mf = new Font("SansSerif",Font.BOLD, 32);
		g.setFont(mf);
		g.setColor(textcolor);
		g.drawString(message, x, y);
	}
	
	
	public void actionPerformed(ActionEvent e) {	
		//Exercise 2
		if (e.getSource() == blankTF) {
			message = e.getActionCommand();
		}
		//Exercise 4
		else if (e.getActionCommand() == "Left") {
			x = x-4;
		}
		else if (e.getActionCommand() == "Right") {
			x = x+4;
		}
		else if (e.getActionCommand() == "Up") {
			y = y-4;
		}
		else if (e.getActionCommand() == "Down") {
			y = y+4;
		}
		repaint();
	}
	
	//Exercise 5
	public void mouseDragged(MouseEvent e) {
		if (useMouseBT.isSelected()) {
			x = e.getX();
			y = e.getY();
			repaint();
		}	
	}
	public void mouseMoved(MouseEvent e) {}

	//Exercise 3
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == whiteBT) {
			blackBT.setSelected(false);
			setBackground(Color.white);
			textcolor = Color.black;
		}
		
		if (e.getSource() == blackBT) {
			whiteBT.setSelected(false);
			setBackground(Color.black);
			textcolor = Color.pink;
		}
		repaint();
	}

	//Main class
	public static void main(String[] args) {			
		new MovingMessagePanel("Moving Message Panel");
	}
	
	
	}