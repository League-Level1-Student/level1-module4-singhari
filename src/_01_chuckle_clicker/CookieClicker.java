package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CookieClicker implements ActionListener {
	
	//joke
	JButton mushroom = new JButton();
	//punchline
	JButton button = new JButton();
	public void makeButtons() {
		JFrame arcana = new JFrame();
		arcana.setVisible(true);
	    arcana.add(button); 
	    arcana.add(mushroom);
	    arcana.pack();
	    button.addActionListener(this);
	    mushroom.addActionListener(this);
	    
	    
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("hi");
		if(e.getSource() == button) {
			System.out.println("meeeeee");
		}
		else if(e.getSource() == mushroom) {
			System.out.println("some joke idk");
		}
	}
	static public void main(String[] args) {
		
	}
}
