package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {

	private LogArea logArea;
	private LeftPanel leftPanel;
	private RightPanel rightPanel;
	private ButtonPanel buttonPanel;
	
	
	
	public MainFrame(){
		
		
		super("FTPJ- BEST FTP CLIENT IN JAVA XDDDDDD");
		setLayout(new BorderLayout());
		
		
		
		//CREATING COMPONENTS
		logArea = new LogArea();
		leftPanel = new LeftPanel();
		rightPanel = new RightPanel();
		buttonPanel = new ButtonPanel();
		//ADDING COMPONENTS TO THE JFRAME
		add(logArea, BorderLayout.SOUTH);
		add(leftPanel, BorderLayout.WEST);
		add(rightPanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.NORTH);
		//ADDING MENUBAR TO THE JFRAME
		setJMenuBar(createMenuBar());
		
		//LOOKANDFEEL XD
		setSize(1280, 800);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
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
