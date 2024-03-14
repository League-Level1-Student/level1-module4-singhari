package _03_typing_tutor;
	import javax.swing.*;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
	import java.util.*;
public class TypeTutor implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter = generateRandomLetter();
	//Was complete until some script on the league computers deleted THE COMPLETED VERSION OF THIS AND MY COMPLETED BOOK OF ILLSIOUNS
	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel();
		//java was being mean and wouldn't let me cast normally.
		String current= String.valueOf(currentLetter);
		label.setText(current);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.pack();
	}
	static public void main(String[] args) {
		TypeTutor tutor = new TypeTutor();
		tutor.setup(); 
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		String newLetter = String.valueOf(currentLetter)/
		//label.setText(newLetter);
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
