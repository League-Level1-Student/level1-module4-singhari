package _09_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.*;

public class MoleWhacker implements ActionListener {
	 JFrame frame = new JFrame();
	 JPanel pan = new JPanel();
	 Random ran = new Random();
	 static int moles = 0;
	public static void main(String[] args) {
		MoleWhacker whack = new MoleWhacker();
		whack.start();
		//if(moles > 10 || moles == 10) {
		//	Date dat = new Date();
			//endGame(dat, moles);
	//	}
	}
	void start(){
		int num = ran.nextInt(26)+1;
		drawButton(num);
		frame.add(pan);
		frame.setSize(600,500);
		frame.setVisible(true);
		Date dat = new Date();
		int molesNeededToWin = 3;
		if(moles == molesNeededToWin) {
			endGame(dat, moles);
		}
	}
	//drawing buttons 
	public void drawButton(int i) {
		for(int j=0; j< i; j++) {
			JButton b = new JButton();
			b.addActionListener(this);
		//	int num1 = ran.nextInt(i);
			if(j == i-1) {
				b.setText("mole!");
			}
			pan.add(b);
		}
	}
	
	//for speaking
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    System.out.println("Your whack rate is "   + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
		if(s.equals("")) {
			speak("wrong");
		}
		else {
			speak("nice");
			moles++;
		}
	}

}