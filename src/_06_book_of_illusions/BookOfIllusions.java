package _06_book_of_illusions;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
/** We’re going to make a slideshow of cool optical illusions. When the user clicks on an illusion, a new one will be loaded. **/

public class BookOfIllusions extends MouseAdapter {

	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame JF = new JFrame();
	JLabel JL;
	String illusion1 = "illusion1.jpeg";
	String illusion2 = "illusion1.jpg";
	public void run() {
		// 2. make the frame visible
		JF.setVisible(true);
		// 3. set the size of the frame
		JF.setSize(300, 300);
		// 4. find 2 images and save them to your project’s default package
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		
		// 7. use the "loadImage..." methods below to initialize your JLabel
		JL=loadImageFromComputer(illusion1);
		
		// 8. add your JLabel to the frame
		JF.add(JL);
		// 9. call the pack() method on the frame
		JF.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		JF.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
			System.out.println("clicc");
		// 12. remove everything from the frame that was added earlier
		JF.remove(JL);
		// 13. load a new image like before (this is more than one line of code)
		JLabel JL2;
		JL2=loadImageFromComputer(illusion2);
		JF.add(JL2);
		// 14. pack the frame
JF.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}


