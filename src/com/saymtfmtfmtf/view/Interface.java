package com.saymtfmtfmtf.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Interface extends JFrame implements Runnable{
	
	private static final long serialVersionUID = -5789188723906457801L;
	
	

	public Interface() {
		setName("Client Computer");
		setPreferredSize(new Dimension(1024,1024));
		setEnabled(true);
		setResizable(false);
		 	
		//Login Screen
		JPanel loginScreen = new JPanel();
		loginScreen.setMaximumSize(new Dimension(256,64));
		loginScreen.setLayout(new GridLayout(2,2));
		
		//Username Text
		JTextField usernameText = new JTextField("Username: ");
		usernameText.setEditable(false);
		
		//Username TextField
		JTextField username = new JTextField();
		username.setSize(new Dimension(128,16));
		
		//Username Text
		JTextField passwordText = new JTextField("Password: ");
		passwordText.setEditable(false);
		
		//Password TextField
		JPasswordField password = new JPasswordField();
		password.setSize(new Dimension(128,16));
		
		loginScreen.add(usernameText);
		loginScreen.add(username);
		loginScreen.add(passwordText);
		loginScreen.add(password);
		
		setLayout(new BorderLayout(50,50));

		getContentPane().add(loginScreen, BorderLayout.CENTER);
		
		
		
		pack();
		setVisible(true);
		
		
		//Fill whole screen w/ locked features
		//ESC being escape window
		//Login Screens
			//If Success, unlock features (UNLESS TIME <= 0)
			//else prompt wrong cred.
	}

	
	
	@Override
	public void run() {
		// Will use..check time and display to user.
	}
}
