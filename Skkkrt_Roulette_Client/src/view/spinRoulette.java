package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class spinRoulette extends JFrame {

	private JPanel contentPane;
	private JLabel titleLab1;
	private JLabel titleLab2;
	private JLabel titleLab3;
	private JLabel label;
	private JLabel lblVincita;
	private JLabel lblEstratto;
	private JLabel lblnumero;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel lblcolore;
	private JLabel winLine1;
	private JLabel winLine2;
	

	public spinRoulette() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 983, 633);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 212, 104));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		try {
			BufferedImage immagine= ImageIO.read(new File("images/roulette.png"));
			contentPane.setLayout(null);
			titleLab1 = new JLabel(new ImageIcon(immagine.getScaledInstance(205, 205, 1)));
			titleLab1.setBounds(65, 15, 228, 129);
			contentPane.add(titleLab1);
			
			immagine= ImageIO.read(new File("images/skkkrt.png"));
			titleLab2 = new JLabel(new ImageIcon(immagine.getScaledInstance(195, 70, 1)));
			titleLab2.setBounds(303, 11, 176, 61);
			contentPane.add(titleLab2);
			
			
			immagine= ImageIO.read(new File("images/rlt.png"));
			titleLab3 = new JLabel(new ImageIcon(immagine.getScaledInstance(195, 70, 1)));
			titleLab3.setBounds(303, 83, 176, 61);
			contentPane.add(titleLab3);
			
			immagine= ImageIO.read(new File("images/skkrtSpin.gif"));
			label = new JLabel(new ImageIcon(immagine.getScaledInstance(355, 355, 1)));
			label.setBounds(97, 151, 355, 355);
			contentPane.add(label);
			
			lblVincita = new JLabel("RISULTATI");
			lblVincita.setFont(new Font("Gabriola", lblVincita.getFont().getStyle() | Font.BOLD, lblVincita.getFont().getSize() + 19));
			lblVincita.setHorizontalAlignment(SwingConstants.CENTER);
			lblVincita.setBounds(560, 15, 397, 35);
			contentPane.add(lblVincita);
			
			lblEstratto = new JLabel("NUMERO:");
			lblEstratto.setFont(new Font("Gabriola", lblEstratto.getFont().getStyle(), lblEstratto.getFont().getSize() + 10));
			lblEstratto.setHorizontalAlignment(SwingConstants.CENTER);
			lblEstratto.setBounds(560, 83, 93, 29);
			contentPane.add(lblEstratto);
			
			lblnumero = new JLabel("");
			lblnumero.setFont(new Font("Gabriola", lblnumero.getFont().getStyle(), lblnumero.getFont().getSize() + 10));
			lblnumero.setHorizontalAlignment(SwingConstants.CENTER);
			lblnumero.setBounds(663, 83, 294, 29);
			contentPane.add(lblnumero);
			
			label_2 = new JLabel("COLORE: ");
			label_2.setFont(new Font("Gabriola", label_2.getFont().getStyle(), label_2.getFont().getSize() + 10));
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			label_2.setBounds(560, 143, 93, 29);
			contentPane.add(label_2);
			
			label_3 = new JLabel("I TUOI RISULTATI");
			label_3.setFont(new Font("Gabriola", label_3.getFont().getStyle() | Font.BOLD, label_3.getFont().getSize() + 19));
			label_3.setHorizontalAlignment(SwingConstants.CENTER);
			label_3.setBounds(560, 206, 397, 29);
			contentPane.add(label_3);
			
			lblcolore = new JLabel("");
			lblcolore.setFont(new Font("Gabriola", lblcolore.getFont().getStyle(), lblcolore.getFont().getSize() + 10));
			lblcolore.setHorizontalAlignment(SwingConstants.CENTER);
			lblcolore.setBounds(663, 143, 294, 29);
			lblcolore.setOpaque(true);
			contentPane.add(lblcolore);
			
			winLine1 = new JLabel("");
			winLine1.setFont(new Font("Gabriola", winLine1.getFont().getStyle(), winLine1.getFont().getSize() + 10));
			winLine1.setHorizontalAlignment(SwingConstants.CENTER);
			winLine1.setBounds(560, 246, 397, 29);
			contentPane.add(winLine1);
			
			winLine2 = new JLabel("");
			winLine2.setFont(new Font("Gabriola", winLine2.getFont().getStyle(), winLine2.getFont().getSize() + 10));
			winLine2.setHorizontalAlignment(SwingConstants.CENTER);
			winLine2.setBounds(560, 274, 397, 29);
			contentPane.add(winLine2);
			
			this.setResizable(false);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
			
	}


	public JLabel getWinLine1() {
		return winLine1;
	}


	public void setWinLine1(JLabel winLine1) {
		this.winLine1 = winLine1;
	}


	public JLabel getWinLine2() {
		return winLine2;
	}


	public void setWinLine2(JLabel winLine2) {
		this.winLine2 = winLine2;
	}


	public JLabel getTitleLab1() {
		return titleLab1;
	}


	public void setTitleLab1(JLabel titleLab1) {
		this.titleLab1 = titleLab1;
	}


	public JLabel getTitleLab2() {
		return titleLab2;
	}


	public void setTitleLab2(JLabel titleLab2) {
		this.titleLab2 = titleLab2;
	}


	public JLabel getTitleLab3() {
		return titleLab3;
	}


	public void setTitleLab3(JLabel titleLab3) {
		this.titleLab3 = titleLab3;
	}


	public JLabel getLabel() {
		return label;
	}


	public void setLabel(JLabel label) {
		this.label = label;
	}


	public JLabel getLblVincita() {
		return lblVincita;
	}


	public void setLblVincita(JLabel lblVincita) {
		this.lblVincita = lblVincita;
	}


	public JLabel getLblEstratto() {
		return lblEstratto;
	}


	public void setLblEstratto(JLabel lblEstratto) {
		this.lblEstratto = lblEstratto;
	}


	public JLabel getLblnumero() {
		return lblnumero;
	}


	public void setLblnumero(JLabel lblnumero) {
		this.lblnumero = lblnumero;
	}


	public JLabel getLabel_2() {
		return label_2;
	}


	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}


	public JLabel getLabel_3() {
		return label_3;
	}


	public void setLabel_3(JLabel label_3) {
		this.label_3 = label_3;
	}


	public JLabel getLblcolore() {
		return lblcolore;
	}


	public void setLblcolore(JLabel lblcolore) {
		this.lblcolore = lblcolore;
	}

}
