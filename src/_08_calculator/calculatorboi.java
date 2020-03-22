package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorboi implements ActionListener {
public static void main(String[] args) {
	calculatorboi cali = new calculatorboi();
	cali.Run();
	
}
	JFrame JF = new JFrame();
	JTextField Number1 = new JTextField();
	JTextField Number2 = new JTextField();
	JButton AddButton = new JButton("add");
	JButton SubtractButton = new JButton("subtract");
	JButton MultiplyButton = new JButton("Multiply");
	JButton DivideButton = new JButton("Divide");
	JPanel JP = new JPanel();
	void Run() {
		JF.add(JP);
		JF.setVisible(true);
		JP.add(Number1);
		JP.add(Number2);
		JF.pack();
		JP.add(AddButton);
		AddButton.addActionListener(this);
		JP.add(SubtractButton);
		SubtractButton.addActionListener(this);
		JP.add(MultiplyButton);
		MultiplyButton.addActionListener(this);
		JP.add(DivideButton);
		DivideButton.addActionListener(this);
		JF.pack();
		
	}
	
	void add () {
		
	}
	
	void subtract () {
		
	}
	
	void multiply () {
		
	}
	
	void divide () {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
