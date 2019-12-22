package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class blueorredboi implements ActionListener {
	
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
	
	
	JFrame JF = new JFrame();
	JPanel JP = new JPanel();
	JButton JB1 = new JButton("Trick");
	JButton JB2 = new JButton("Treat");
	
	void J() {
		JF.add(JP);
		JP.add(JB1);
		JP.add(JB2);
		JF.pack();
		JF.setVisible(true);	
		JB1.addActionListener(this);
		JB2.addActionListener(this);
	}
	
	
public static void main(String[] args) {
blueorredboi Jstuff = new blueorredboi();
Jstuff.J();
}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==JB1) {
		showPictureFromTheInternet("https://cdn.akc.org/Marketplace/Breeds/Pembroke_Welsh_Corgi_SERP.jpg");
	}
	
	if(e.getSource()==JB2) {
		showPictureFromTheInternet("https://i.pinimg.com/474x/78/49/08/7849081b91e4e3dc0b643b44ab62e6c8.jpg");
	}
	
	
}
}
