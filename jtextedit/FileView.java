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


public class FileView extends JFrame{

	public FileView(FileController controller)
    {
        setTitle("JTextEdit");
        setSize(700,700);
        setLayout(new BorderLayout());
        JMenuBar menuBar = new JMenuBar();
        
        //adding File components
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem printMenuItem = new JMenuItem("Print");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        
        //adding Edit components
        JMenu editMenu = new JMenu("Edit");
        JMenuItem findMenuItem = new JMenuItem("Find");
       // JMenuItem saveMenuItem = new JMenuItem("Save");
      //  JMenuItem printMenuItem = new JMenuItem("Print");
       // JMenuItem exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(loadMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(printMenuItem);
        fileMenu.add(exitMenuItem);
        
        editMenu.add(findMenuItem);
   //     fileMenu.add(saveMenuItem);
   //     fileMenu.add(printMenuItem);
    //    fileMenu.add(exitMenuItem);
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        this.setJMenuBar(menuBar);
        getContentPane().add(new JTextArea(), BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
