// Copyright (c) 2011, Ryan J ryanjayako@gmail.com 
//===== Description: ========================================= 
//
//===== Additional Comments: ================================= 
//
//============================================================ 

package jtextedit;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class FileView extends JFrame {

	public FileView(FileController controller) {
		setTitle("JTextEdit");
		setSize(700, 700);
		setLayout(new BorderLayout());
		JMenuBar menuBar = new JMenuBar();
		JPanel statusPanel = new JPanel();
		
		//defining the panel layout
		statusPanel.setLayout(new BorderLayout());
		
		
		//adding a test label for status
		JLabel statusDummy = new JLabel("Stuats : Not done  ");
		statusPanel.add(statusDummy,BorderLayout.EAST);

		// adding File components
		JMenu fileMenu = new JMenu("File");
		JMenuItem loadMenuItem = new JMenuItem("Open");
		JMenuItem saveMenuItem = new JMenuItem("Save");
		JMenuItem printMenuItem = new JMenuItem("Print");
		JMenuItem exitMenuItem = new JMenuItem("Exit");

		// adding Edit components
		JMenu editMenu = new JMenu("Edit");
		JMenuItem findMenuItem = new JMenuItem("Find");
		JMenuItem findNextMenuItem = new JMenuItem("Find Next");
		JMenuItem replaceMenuItem = new JMenuItem("Replace");
		JMenuItem goToMenuItem = new JMenuItem("GoTo");
		JMenuItem addTimeMenuItem = new JMenuItem("Time and Date");
		
		// adding View components
		JMenu viewMenu = new JMenu("View");
		JMenuItem statusBarMenuItem = new JMenuItem("Status Bar");

		// adding Help components
		JMenu helpMenu = new JMenu("Help");
		JMenuItem aboutMenuItem = new JMenuItem("About");
		JMenuItem viewHelpMenuItem = new JMenuItem("View Help");
		
		//loading file menu
		fileMenu.add(loadMenuItem);
		fileMenu.add(saveMenuItem);
		fileMenu.add(printMenuItem);
		fileMenu.add(exitMenuItem);
		
		//loading Edit menu
		editMenu.add(findMenuItem);
		editMenu.add(findNextMenuItem);
		editMenu.add(replaceMenuItem);
		editMenu.add(goToMenuItem);
		editMenu.add(addTimeMenuItem);
		
		//loading View menu
		viewMenu.add(statusBarMenuItem);
		
		//loading Help Menu
		helpMenu.add(aboutMenuItem);
		helpMenu.add(viewHelpMenuItem);

		//loading menu's to menu bar component
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		//adding scrollbar
		JTextPane textArea = new JTextPane();
		JScrollPane scrollPane = new JScrollPane(textArea);
		
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		getContentPane().add(statusPanel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
