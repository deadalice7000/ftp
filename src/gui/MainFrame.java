package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {

	
	public MainFrame(){
		
		
		super("JAVA FTP CLIENT BY DEADALICE7000");
		setSize(800, 600);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		setJMenuBar(createMenuBar());

	}
	
	private JMenuBar createMenuBar(){
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu filesMenu = new JMenu("Files");
		JMenu optionsMenu = new JMenu("Options");
		JMenu helpMenu = new JMenu("Help");

		
		//ITEMS FOR filesMenu
		JMenuItem connectToServer = new JMenuItem("Connect to server...");
		JMenuItem disconnectMenuItem = new JMenuItem("Disconnect");
		JMenuItem exitMenuItem = new JMenuItem("Quit");
		
		//ITEMS FOR optionsMenu
		JMenuItem connectionSetUp = new JMenuItem("Connection setup");
		
		
		//ITEMS FOR helpMenu
		JMenuItem updateMenuItem = new JMenuItem("Update");
		JMenuItem aboutMenuItem = new JMenuItem("About");
		
		
		menuBar.add(filesMenu);
		menuBar.add(optionsMenu);
		menuBar.add(helpMenu);
		
		//ADDING ITEMS TO filesMenu
		filesMenu.add(connectToServer);
		filesMenu.add(disconnectMenuItem);
		filesMenu.add(exitMenuItem);
		
		//ADDING ITEMS TO optionsMenu
		optionsMenu.add(connectionSetUp);
		
		//ADDING ITEMS TO helpMenu
		helpMenu.add(updateMenuItem);
		helpMenu.add(aboutMenuItem);
		
		
		return menuBar;
	}
}
