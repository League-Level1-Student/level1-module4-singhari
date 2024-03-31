package _10_slot_machine;

import javax.swing.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

public class SlotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel pan = new JPanel();
	JButton spin = new JButton("SPIN!");
	Random ran = new Random();
	public static void main(String[] args) {
		SlotMachine s = new SlotMachine();
		s.start();
	}
	void start(){
		spin.addActionListener(this);
	}
	String imageChooser() {
		int num = ran.nextInt(3);
		String fileName;
		if(num == 0) {
			fileName = "slotmachinecherries.jpeg";
		}
		else if(num == 1) {
			fileName = "slotmachineorange.jpeg";
		}
		else {
			fileName = "slotmachinewatermelon.jpeg";
		}
		return fileName;
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
  }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String fileName = imageChooser();
		try {
			JLabel imagee = createLabelImage(fileName);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
