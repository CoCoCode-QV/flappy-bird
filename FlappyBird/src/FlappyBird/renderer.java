package FlappyBird;

import java.awt.Graphics;

import javax.swing.JPanel;

public class renderer extends JPanel{

	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		GameBird.flappyBird.repaint(g);
	
	}
}
