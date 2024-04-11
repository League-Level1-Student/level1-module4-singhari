package _11_lights_out;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.*;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * white) or off (gray). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {

	JPanel gamePanel = new JPanel();
	JFrame frame = new JFrame();
	int lNum = 25;
	Random ran = new Random();
	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
			gamePanel.setLayout(new GridLayout(5,5));
			//2. Add 25 JLabels to your gamePanel (these are your lights)
				for(int i = 0; i < lNum; i++) {
					JLabel l = new JLabel();
					String s = "" + i;
					l.setText(s);
				
			//3. Use setText() to add a position number to each light (0-24).

			//4. Set the background of each light to LIGHT_GRAY
			// - you will also have to set the background to opaque.
			// - Use light.setOpaque(true);
					l.setBackground(Color.WHITE);
					int nui = ran.nextInt(lNum);
					for(int j = 0; j < lNum; j++) {
						if(nui%3 == 0) {
							toggle(l);
						}
					}
					l.setOpaque(true);
			//5. Add a mouseListener to each light
					l.addMouseListener(this);
					gamePanel.add(l);
				}
		//6. Add your panel to a frame
			frame.add(gamePanel);
		//7. Set the size of the frame
		frame.setSize(600,600);
		frame.setBackground(Color.DARK_GRAY);
		frame.setVisible(true);
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`
			JLabel light = (JLabel) e.getSource();
		// 2. Get the number (position) of the light
			String nu = light.getText();
			int num = Integer.parseInt(nu);
			System.out.println(num);
		// 3. Now use the makeMove method to code which lights turn on and off.
			makeMove(num);
		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color
			int checker = 0;
			for(int i = 0; i < lNum; i++) {
			//	int checker = 0;
				JLabel checked = getLightAtPosition(i);
				Color idk = checked.getBackground();
				if(idk.equals(Color.WHITE)) {
					checker++;
				}
			}
			if(checker < 1) {
				System.out.println("You won!");
			}
		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?
			
	}

	void makeMove(int pos) {
		toggle((JLabel) gamePanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) gamePanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) gamePanel.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) gamePanel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.LIGHT_GRAY);
			System.out.println(label.getText());

		} else {
			label.setBackground(Color.WHITE);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}
