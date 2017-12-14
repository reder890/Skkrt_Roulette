package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import javafx.geometry.Insets;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JLabel lblUsername;
	private JTextField textField;
	private JButton btnLogin;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JFormattedTextField roundedTextField;
	private JButton btnEsci;

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("SkrrtLogin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 355);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 212, 104));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Monotype Corsiva", lblUsername.getFont().getStyle(), lblUsername.getFont().getSize() + 20));
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(10, 163, 171, 35);
		contentPane.add(lblUsername);
		
		textField = new RoundedTextField(30);
		textField.setBounds(204, 176, 202, 20);
		contentPane.add(textField);
		Font fieldFont = new Font("Arial", Font.HANGING_BASELINE, 18);
        textField.setFont(fieldFont);
        textField.setBackground(new Color(234,255,183));
        textField.setForeground(new Color(20,20,20));
	
		btnLogin = new JButton("Connettiti!");
		btnLogin.setBounds(255, 283, 151, 23);
		contentPane.add(btnLogin);
		
		try {
			BufferedImage immagine= ImageIO.read(new File("images/roulette.png"));
			lblNewLabel = new JLabel(new ImageIcon(immagine.getScaledInstance(205, 205, 1)));
			lblNewLabel.setBounds(10, 11, 228, 129);
			contentPane.add(lblNewLabel);
			
			immagine= ImageIO.read(new File("images/skkkrt.png"));
			label = new JLabel(new ImageIcon(immagine.getScaledInstance(195, 70, 1)));
			label.setBounds(240, 11, 176, 61);
			contentPane.add(label);
			
			
			immagine= ImageIO.read(new File("images/rlt.png"));
			label_1 = new JLabel(new ImageIcon(immagine.getScaledInstance(195, 70, 1)));
			label_1.setBounds(240, 76, 176, 61);
			contentPane.add(label_1);
			
			label_2 = new JLabel("Lobby");
			label_2.setFont(new Font("Monotype Corsiva", label_2.getFont().getStyle(), label_2.getFont().getSize() + 20));
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setBounds(10, 203, 171, 35);
			contentPane.add(label_2);
			
			roundedTextField = new RoundedFTextField(ipFormat("###.###.###.###"));
			roundedTextField.setForeground(new Color(20, 20, 20));
			roundedTextField.setFont(new Font("Arial", Font.HANGING_BASELINE, 18));
			roundedTextField.setBackground(new Color(234, 255, 183));
			roundedTextField.setBounds(204, 216, 202, 20);
			contentPane.add(roundedTextField);
			
			btnEsci = new JButton("Esci");
			btnEsci.setBounds(51, 283, 151, 23);
			contentPane.add(btnEsci);
		
			this.setResizable(false);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public JLabel getLabel_2() {
		return label_2;
	}

	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}

	public JFormattedTextField getRoundedTextField() {
		return roundedTextField;
	}

	public void setRoundedTextField(JFormattedTextField roundedTextField) {
		this.roundedTextField = roundedTextField;
	}

	public JButton getBtnEsci() {
		return btnEsci;
	}

	public void setBtnEsci(JButton btnEsci) {
		this.btnEsci = btnEsci;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JLabel getLabel_1() {
		return label_1;
	}

	public void setLabel_1(JLabel label_1) {
		this.label_1 = label_1;
	}

	public JLabel getLblUsername() {
		return lblUsername;
	}

	public void setLblUsername(JLabel lblUsername) {
		this.lblUsername = lblUsername;
	}

	public JButton getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(JButton btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	protected MaskFormatter ipFormat(String formato){
		MaskFormatter maschera=null;
		try{
			maschera=new MaskFormatter(formato);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return maschera;
	}
}
