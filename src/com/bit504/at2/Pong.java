package com.bit504.at2;

import javax.swing.JFrame;

public class Pong extends JFrame {

	private final static String WINDOW_TITLE = "Pong";
	private final static int WINDOW_WIDTH = 800;
	private final static int WINDOW_HEIGHT = 600;

	public Pong() {
		setTitle(WINDOW_TITLE);
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setResizable(false);
		setVisible(true);
		add(new PongPanel());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Pong();
			}
		});
	}
}