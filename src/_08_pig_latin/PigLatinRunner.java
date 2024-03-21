package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PigLatinRunner implements ActionListener {
	 JFrame frame = new JFrame();
	 JPanel pan = new JPanel();
	 JButton engWordSubmit = new JButton(">>");
	 JTextField engWordEnter = new JTextField("English word");
	 JButton pigWordSubmit = new JButton("<<");
	 JTextField pigWordEnter = new JTextField("Pig Latin word");
	 JButton speak = new JButton("Speak");
	public static void main(String[] args) {
		PigLatinRunner l = new PigLatinRunner();
		 l.start();
	}
	void start() {

		 engWordSubmit.addActionListener(this);
		
		 pigWordSubmit.addActionListener(this);

		 speak.addActionListener(this);
		 pan.add(engWordSubmit);
		 pan.add(engWordEnter);
		 pan.add(pigWordSubmit);
		 pan.add(pigWordEnter);
		 pan.add(speak);
		 frame.add(pan);
		 frame.pack();
		 frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//https://www.geeksforgeeks.org/java-swing-jtextfield/
		String s = e.getActionCommand();
		if(s.equals(">>")) {
			
		}
		else if(s.equals("<<")) {
			
		}
		else if(s.equals("Speak")) {
			
		}	
	}
}
