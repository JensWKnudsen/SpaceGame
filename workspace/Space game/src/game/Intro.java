package game;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;

public class Intro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton okButton;
	private JTextArea TextArea;
	private JTextField NameField;
	private String Text = "You are\n";
	private int OkCounter = 0;
	private JTextField ShipNameField;
	private JComboBox GenderBox;
	private JLayeredPane layeredPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Intro dialog = new Intro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Intro() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 432, 220);
		contentPanel.add(layeredPane);
		
		TextArea = new JTextArea();
		TextArea.setBounds(12, 13, 408, 194);
		layeredPane.add(TextArea,0);
		layeredPane.setLayer(TextArea, 0);
		TextArea.setEditable(false);
		TextArea.setText(Text);
		
		NameField = new JTextField();
		NameField.setBounds(89, 16, 116, 22);
		layeredPane.add(NameField,1);
		NameField.setColumns(10);	
		
		
		GenderBox = new JComboBox();
		GenderBox.setBounds(89, 38, 101, 22);
		layeredPane.add(GenderBox,1);
		GenderBox.setVisible(false);
		GenderBox.addItem("Woman");
		GenderBox.addItem("Man");
		
		ShipNameField = new JTextField();
		ShipNameField.setBounds(202, 61, 116, 22);
		layeredPane.add(ShipNameField,1);
		ShipNameField.setColumns(10);
		ShipNameField.setVisible(false);
		
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
		okButton = new JButton("OK");
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
			
		
		TextArea.setEnabled(false);
		
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				switch(OkCounter){
				case 0:
					Text = Text + "a young\n";
					ShipNameField.setVisible(true);
					TextArea.setText(Text);
					OkCounter = 1;
					break;
				case 1:
					Text = Text + "and captain of the\n";
					GenderBox.setVisible(true);
					TextArea.setText(Text);
					OkCounter = 2;
					break;
				case 2:
					Text = Text + "And you are in a heap of trouble";
					OkCounter = 3;
					break;
				case 3:
					GamePresentation.getPlayer().setName(NameField.getText());
					GamePresentation.getPlayer().setShipName(ShipNameField.getText());
					GamePresentation.getPlayer().setGender(GenderBox.getSelectedIndex());
					dispose();
					break;
				}
				
				
			}
		});
	}
}
