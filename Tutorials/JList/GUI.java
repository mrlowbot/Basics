package Tutorials.JList;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JList<Object> list;
	private static String[] colornames = { "blue", "black", "red", "cyan", "greem" };
	private static Color[] colors = { Color.BLUE, Color.BLACK, Color.RED, Color.CYAN, Color.GREEN };

	public GUI() {
		super("Color program");
		setLayout(new FlowLayout());

		list = new JList<Object>(colornames);
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));

		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				getContentPane().setBackground(colors[list.getSelectedIndex()]);
			}
		});
	}

}
