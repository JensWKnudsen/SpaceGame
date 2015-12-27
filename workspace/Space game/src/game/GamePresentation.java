package game;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingConstants;

import Locations.Ship;
import Locations.StartLocation;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import java.util.Random;

public class GamePresentation extends JFrame {

	private static JPanel contentPane;
	private static JButton btn11;
	private static JButton btn12;
	private static JButton btn13;
	private static JButton btn14;
	private static JButton btn21;
	private static JButton btn22;
	private static JButton btn23;
	private static JButton btn24;
	private static JButton btn31;
	private static JButton btn32;
	private static JButton btn33;
	private static JButton btn34;
	private static JLabel lblTitle;
	private static JLabel lblHPCount;
	private static JLabel lblStrengthCount;
	private static JLabel lblDexterityCount;
	private static JLabel lblIntellectCount;
	private static List<Object> Locations = new ArrayList<Object>();
	private static List<ArrayList<String>> ButtonTexts = new ArrayList<ArrayList<String>>();
	private static Ship ship = new Ship();
	private static StartLocation startLocation = new StartLocation();
	private static int CurrentLocation = 1;
	private static Player_charecter Player_charecter = new Player_charecter(20,20,10,10,10);
	private static JTextArea textArea;
	private static Combat Combat = new Combat();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GamePresentation frame = new GamePresentation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GamePresentation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 907, 662);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHp = new JLabel("HP:");
		lblHp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHp.setBounds(714, 248, 70, 16);
		contentPane.add(lblHp);
		
		btn11 = new JButton(" ");
		btn11.setBounds(54, 487, 150, 25);
		contentPane.add(btn11);
		
		lblHPCount = new JLabel("0/0");
		lblHPCount.setBounds(796, 248, 70, 16);
		contentPane.add(lblHPCount);
		
		JLabel lblStrength = new JLabel("Strength:");
		lblStrength.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStrength.setBounds(714, 277, 70, 16);
		contentPane.add(lblStrength);
		
		JLabel lblDexterity = new JLabel("Dexterity:");
		lblDexterity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDexterity.setBounds(714, 306, 70, 16);
		contentPane.add(lblDexterity);
		
		JLabel lblIntellect = new JLabel("Intellect:");
		lblIntellect.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIntellect.setBounds(714, 335, 70, 16);
		contentPane.add(lblIntellect);
		
		lblStrengthCount = new JLabel("0");
		lblStrengthCount.setBounds(796, 277, 56, 16);
		contentPane.add(lblStrengthCount);
		
		lblDexterityCount = new JLabel("0");
		lblDexterityCount.setBounds(796, 306, 56, 16);
		contentPane.add(lblDexterityCount);
		
		lblIntellectCount = new JLabel("0");
		lblIntellectCount.setBounds(796, 335, 56, 16);
		contentPane.add(lblIntellectCount);
		
		btn12 = new JButton(" ");
		btn12.setBounds(216, 487, 150, 25);
		contentPane.add(btn12);
		
		 btn13 = new JButton(" ");
		btn13.setBounds(378, 487, 150, 25);
		contentPane.add(btn13);
		
		 btn14 = new JButton(" ");
		btn14.setBounds(540, 487, 150, 25);
		contentPane.add(btn14);
		
		 btn21 = new JButton(" ");
		btn21.setBounds(54, 525, 150, 25);
		contentPane.add(btn21);
		
		 btn22 = new JButton(" ");
		btn22.setBounds(216, 525, 150, 25);
		contentPane.add(btn22);
		
		 btn23 = new JButton(" ");
		btn23.setBounds(378, 525, 150, 25);
		contentPane.add(btn23);
		
		 btn24 = new JButton(" ");
		btn24.setBounds(540, 525, 150, 25);
		contentPane.add(btn24);
		
		 btn31 = new JButton(" ");
		btn31.setBounds(54, 563, 150, 25);
		contentPane.add(btn31);
		
		 btn32 = new JButton(" ");
		btn32.setBounds(216, 563, 150, 25);
		contentPane.add(btn32);
		
		 btn33 = new JButton(" ");
		btn33.setBounds(378, 563, 150, 25);
		contentPane.add(btn33);
		
		 btn34 = new JButton(" ");
		btn34.setBounds(540, 563, 150, 25);
		contentPane.add(btn34);
		
		textArea = new JTextArea();
		textArea.setBounds(54, 86, 638, 388);
		contentPane.add(textArea);
		textArea.setEditable(false);
		
		lblTitle = new JLabel("title");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitle.setBounds(54, 48, 636, 25);
		contentPane.add(lblTitle);
		
		JLabel lblNewLabel = new JLabel("Char pic");
		lblNewLabel.setBounds(704, 92, 150, 150);
		contentPane.add(lblNewLabel);
		
		Locations.add(Combat);
		Locations.add(startLocation);
		Locations.add(ship);
		
		ButtonTexts.add(Combat.ButtonText());
		ButtonTexts.add(startLocation.ButtonText());
		ButtonTexts.add(ship.ButtonText());
		
		
		UpdateButtons();
		UpdateStats();
		
		Intro Intro = new Intro();
		Intro.setVisible(true);
		
		btn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button11();
					break;
				case 2:
					startLocation.button11();
					break;
				case 3:
					ship.button11();
					break;
				}

			}
		});
		btn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button12();
					break;
				case 2:
					startLocation.button12();
					break;
				case 3:
					ship.button12();
					break;
				}

			}
		});
		btn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button13();
					break;
				case 2:
					startLocation.button13();
					break;
				case 3:
					ship.button13();
					break;
				}

			}
		});
		btn14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button14();
					break;
				case 2:
					startLocation.button14();
					break;
				case 3:
					ship.button14();
					break;
				}

			}
		});
		btn21.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button21();
					break;
				case 2:
					startLocation.button21();
					break;
				case 3:
					ship.button21();
					break;
				}

			}
		});
		btn22.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button22();
					break;
				case 2:
					startLocation.button22();
					break;
				case 3:
					ship.button22();
					break;
				}

			}
		});
		btn23.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button23();
					break;
				case 2:
					startLocation.button23();
					break;
				case 3:
					ship.button23();
					break;
				}

			}
		});
		btn24.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button24();
					break;
				case 2:
					startLocation.button24();
					break;
				case 3:
					ship.button24();
					break;
				}

			}
		});
		btn31.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button31();
					break;
				case 2:
					startLocation.button31();
					break;
				case 3:
					ship.button31();
					break;
				}

			}
		});
		btn32.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button32();
					break;
				case 2:
					startLocation.button32();
					break;
				case 3:
					ship.button32();
					break;
				}

			}
		});
		btn33.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button33();
					break;
				case 2:
					startLocation.button33();
					break;
				case 3:
					ship.button33();
					break;
				}

			}
		});
		btn34.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(CurrentLocation+1){
				case 1:
					Combat.button34();
					break;
				case 2:
					startLocation.button34();
					break;
				case 3:
					ship.button34();
					break;
				}

			}
		});
		
	}
	
	public static void UpdateButtons(){
		
		ButtonTexts.clear();
		ButtonTexts.add(Combat.ButtonText());
		ButtonTexts.add(startLocation.ButtonText());
		ButtonTexts.add(ship.ButtonText());
		
		btn11.setText(ButtonTexts.get(CurrentLocation).get(0));
		btn12.setText(ButtonTexts.get(CurrentLocation).get(1));
		btn13.setText(ButtonTexts.get(CurrentLocation).get(2));
		btn14.setText(ButtonTexts.get(CurrentLocation).get(3));
		btn21.setText(ButtonTexts.get(CurrentLocation).get(4));
		btn22.setText(ButtonTexts.get(CurrentLocation).get(5));
		btn23.setText(ButtonTexts.get(CurrentLocation).get(6));
		btn24.setText(ButtonTexts.get(CurrentLocation).get(7));
		btn31.setText(ButtonTexts.get(CurrentLocation).get(8));
		btn32.setText(ButtonTexts.get(CurrentLocation).get(9));
		btn33.setText(ButtonTexts.get(CurrentLocation).get(10));
		btn34.setText(ButtonTexts.get(CurrentLocation).get(11));
		
	}
	public static void UpdateStats(){
		
		String HP = Player_charecter.getHP() + "/" + Player_charecter.getMaxHP();
		lblHPCount.setText(HP);
		lblStrengthCount.setText(String.valueOf(Player_charecter.getStrength()));
		lblDexterityCount.setText(String.valueOf(Player_charecter.getDexterity()));
		lblIntellectCount.setText(String.valueOf(Player_charecter.getIntellect()));
	}
	public static void setText(String Text){
		textArea.setText(Text);
	}
	public static void setLocation(int Location){
		CurrentLocation = Location;
		System.out.println(CurrentLocation);
	}
	public static game.Player_charecter getPlayer(){
		return Player_charecter;
	}
	public static void UpdateTitle(String Title){
		lblTitle.setText(Title);
	}
	public static int randInt(int min, int max){
		int random = min + (int)(Math.random() * ((max - min) +1));
		return random;
	}
}
