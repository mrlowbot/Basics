package Tutorials.JList;

/*
 * These two GUI classes just makes a box that changes color depending on the button pushed. 
 * @Karwan Maryame Azar
 */

import javax.swing.JFrame;

public class GUIMain {

	public static void main(String[] args) {

		GUI G = new GUI();
		G.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		G.setSize(500, 500);
		G.setVisible(true);
		G.setResizable(false);

	}
}
