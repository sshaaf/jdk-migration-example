package com.redhat.migr.examples.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;


/**
 * 
 *  using awt.Color
 *  ref: https://github.com/windup/windup-rulesets/blob/master/rules-reviewed/openjdk7/oraclejdk7/oracle2openjdk.rhamt.xml
 * 
 * 
 * */

public class SwingApp extends JFrame {

	private static final long serialVersionUID = 1L;

	public SwingApp() {

		super("Migration App");
		this.setSize(200, 200);
		JPanel panel = new JPanel();

		panel.setLayout(new BorderLayout());
		panel.add(new JLabel("Migration example"), BorderLayout.CENTER);
		panel.setBackground(Color.RED);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.add(panel);
		this.setVisible(true);

	}

	public static void main(String args[]) {
		new SwingApp();

	}

}
