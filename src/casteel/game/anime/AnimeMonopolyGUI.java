package casteel.game.anime;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;

import javax.swing.*;

public class AnimeMonopolyGUI extends JFrame{

	/**
	 * Dunno, dun care...
	 */
	private static final long serialVersionUID = 8353610671872007253L;
	
	//private JPanel mainPanel = new JPanel();
	private BackgroundPanel back;
	private int numPlayers;
	private int numNPCs;
	private JMenuBar menuBar;
	private JMenu menu, helpMenu;
	private JMenuItem newGame, loadGame, saveGame;
	private JMenuItem about, help;
	
	
	public AnimeMonopolyGUI(){
		super("Anime Monopoly");
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("Pics/monopoly.jpg"));
		} catch (IOException e) {
			System.out.println("No background picture");
		}
		back = new BackgroundPanel(img, BackgroundPanel.SCALED, .0f,.0f);
		this.add(back);
		
		createMenus();
		this.setSize(new Dimension(640,640));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
	private void createMenus(){
		menuBar = new JMenuBar();
		
		createMenu();
		createHelp();
	}
	
	private void createMenu(){
		
		//Build the first menu
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_ALT);
		menu.getAccessibleContext().setAccessibleDescription(
				"Main menu");
		menuBar.add(menu);
		
		//A group of JMenuItems
		//New Game
		newGame = new JMenuItem("New Game", KeyEvent.VK_F2);
		newGame.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_1, ActionEvent.ALT_MASK));
		newGame.getAccessibleContext().setAccessibleDescription(
				"Begin a new game");
		menu.add(newGame);
		//Add seperator
		menu.addSeparator();
		//Load Game
		loadGame = new JMenuItem("Load Game", 
				new ImageIcon("Pics/load-icon.jpg"));
		loadGame.setMnemonic(KeyEvent.VK_F3);
		loadGame.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_2, ActionEvent.ALT_MASK));
		loadGame.getAccessibleContext().setAccessibleDescription(
				"Load a saved game");
		menu.add(loadGame);
		//Save Game
		saveGame = new JMenuItem("Save Game",
				new ImageIcon("Pics/save-icon.png"));
		saveGame.setMnemonic(KeyEvent.VK_F5);
		saveGame.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_3, ActionEvent.ALT_MASK));
		saveGame.getAccessibleContext().setAccessibleDescription(
				"Save current game");
		menu.add(saveGame);
		this.setJMenuBar(menuBar);
	}
	
	
	private void createHelp(){
		
		//Create Help menu
		helpMenu = new JMenu("Help");
		helpMenu.setMnemonic(KeyEvent.VK_CONTROL);
		helpMenu.getAccessibleContext().setAccessibleDescription("Help Menu");
		menuBar.add(helpMenu);
		
		//Help item
		help = new JMenuItem("Help");
		help.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_F12, ActionEvent.CTRL_MASK));
		help.getAccessibleContext().setAccessibleDescription(
				"Help for Anime Monopoly");
		helpMenu.add(help);
		
		helpMenu.addSeparator();
		
		//About item
		about = new JMenuItem("About");
		helpMenu.add(about);
	}
	
	
	public int getNumPlayers(){
		
		return numPlayers;
	}
	
	public int getNumNPCs(){
		
		return numNPCs;
	}
}
