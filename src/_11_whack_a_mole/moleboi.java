package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class moleboi implements ActionListener {
public static void main(String[] args) {
moleboi mole = new moleboi();
	mole.run();
	Random rand = new Random();
	
	mole.drawButtons(rand.nextInt(15));
}
JFrame JF = new JFrame("Click a button for only bragging rights");	
JPanel JP = new JPanel();
JButton Mole = new JButton("mole");
	
void run () {
		JF.add(JP);
		JF.setSize(750, 1000);
		JF.setVisible(true);
		Mole.addActionListener(this);
		
	}
	
	void drawButtons (int molelocation) {
		for (int i = 0; i < 15; i++) {
			if (i == molelocation) {
				JP.add(Mole);
			}
			else {
				JButton woah = new JButton("                            ");
				woah.addActionListener(this);
				JP.add(woah);
			}
		
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == Mole) {
			System.out.println("correct");
		}
		else {
			System.out.println("no");
		}
	}
	
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	void remove () {
		JF.remove(JP);
		JP = new JPanel();
		drawButtons(new Random().nextInt(15));
		JF.add(JP);
		JF.setSize(750, 1000);
	}
	
	
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}



}
