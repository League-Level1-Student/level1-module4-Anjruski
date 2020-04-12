package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class twitterboi implements ActionListener {
public static void main(String[] args) {
	twitterboi twitboi = new twitterboi();
	twitboi.run();
	
}
JFrame JF = new JFrame("twit");
JPanel JP = new JPanel();
JTextField JT = new JTextField(100);
JButton JB = new JButton("search");
void run () {
	JF.add(JP);
	JP.add(JT);
	JP.add(JB);
	JF.pack();
	JF.setVisible(true);
	JB.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
		
	}
}
