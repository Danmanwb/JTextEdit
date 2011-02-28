// Copyright (c) 2011, Ryan J ryanjayako@gmail.com 
//===== Description: ========================================= 
//
//===== Additional Comments: ================================= 
//
//============================================================ 

package jtextedit;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class FileView extends JFrame {

	public FileView(FileController controller) {
		setTitle("JTextEdit");
		setSize(700, 700);
		setLayout(new BorderLayout());
		JMenuBar menuBar = new JMenuBar();

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
		getContentPane().add(new JTextArea(), BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
