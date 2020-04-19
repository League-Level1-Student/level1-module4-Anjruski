package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class piglatinboi implements ActionListener {
	JFrame JF = new JFrame();
	JPanel JP = new JPanel();
	JTextField JT1 = new JTextField(25);
	JButton JB = new JButton("do a flip");
	JTextField JT2 = new JTextField(30);
	
	public static void main(String[] args) {
piglatinboi PIG = new piglatinboi();

	PIG.run();
	
	
} 

void run () {
	JF.add(JP);
	JP.add(JT1);
	JP.add(JB);
	JP.add(JT2);
	JF.setVisible(true);
	JF.pack();
	JB.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if (e.getSource() == JB) {
	PigLatinTranslator plt = new PigLatinTranslator();
	System.out.println(plt.translate(JT1.getText()));
	JT2.setText(plt.translate(JT1.getText()));
}
	
	
	
	
	
	
}
	}




