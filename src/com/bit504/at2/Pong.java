package com.bit504.at2;

import javax.swing.JFrame;

public class Pong extends JFrame {

	public Pong() {
		setTitle("Pong");
		setSize(800, 600);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Pong();
	}

}
