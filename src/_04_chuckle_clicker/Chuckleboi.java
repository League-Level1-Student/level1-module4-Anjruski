package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckleboi implements ActionListener {
public static void main(String[] args) {
new Chuckleboi().MakeButtons();











}
JButton JB1 = new JButton("joke");
JButton JB2 = new JButton("punchline");

void MakeButtons() {
	JFrame JF = new JFrame();
	JF.setVisible(true);
	JPanel JP = new JPanel();
	JF.add(JP);
	JP.add(JB1);
	JP.add(JB2);
	JF.pack();
	
	JB1.addActionListener(this);
	
	JB2.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(JB1 == e.getSource()) {
		JOptionPane.showMessageDialog(null, "What’s the best thing about Switzerland?");
	}
	if(JB2 == e.getSource() ) {
		JOptionPane.showMessageDialog(null, "I don't know, but the flag is a big plus");
	}
}














}
