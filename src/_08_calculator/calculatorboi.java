package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorboi implements ActionListener {
public static void main(String[] args) {
	calculatorboi cali = new calculatorboi();
	cali.Run();
	
}
	JFrame JF = new JFrame("yeet");
	JTextField Number1 = new JTextField(10);
	JTextField Number2 = new JTextField(10);
	JButton AddButton = new JButton("add");
	JButton SubtractButton = new JButton("subtract");
	JButton MultiplyButton = new JButton("Multiply");
	JButton DivideButton = new JButton("Divide");
	JLabel JL = new JLabel();
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
		JP.add(JL);
		JF.pack();
		
	}
	
	int add (int numb1 , int numb2) {
	 return	numb1+numb2;
	}
	
	int subtract (int numb1, int numb2) {
	return numb1-numb2;
	}
	
	int multiply (int numb1, int numb2) {
		return numb1*numb2;
	}
	
	int divide (int numb1, int numb2) {
		return numb1/numb2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int yes = Integer.parseInt(Number1.getText());
		int no = Integer.parseInt(Number2.getText());
		int result = 0;
		if (e.getSource() == AddButton) {
		result = add(yes , no); 
		JL.setText(result + "");
		}
		if (e.getSource() == SubtractButton) {
		result = subtract(yes , no);
		JL.setText(result + "");
		}
		if (e.getSource() == MultiplyButton) {
			result = multiply(yes , no);
			JL.setText(result + "");
		}
	if (e.getSource() == DivideButton) {
		result = divide(yes, no);
		JL.setText(result + "");
	}
	
	
	
	
	
	
	
	}
}
