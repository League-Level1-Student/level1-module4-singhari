package _01_chuckle_clicker;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CookieClicker implements ActionListener {
	public void makeButtons() {
		JFrame arcana = new JFrame();
		arcana.setVisible(true);
	    JButton button = new JButton();
	    arcana.add(button);
	    JButton mushroom = new JButton();
	    arcana.add(mushroom);
	    arcana.pack();
	    button.addActionListener(this);
	    mushroom.addActionListener(this);
	    
	    
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("hi");
	}
	static public void main(String[] args) {
		
	}
}
