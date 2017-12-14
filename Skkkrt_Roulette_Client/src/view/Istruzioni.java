package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Istruzioni extends JFrame {

	private JPanel contentPane;
	private JLabel lblBenvenutiSulla;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblPerScegliereTra;

	public Istruzioni() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 212, 104));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblBenvenutiSulla = new JLabel("BENVENUTI SULLA SKRRT ROULETTE!");
		lblBenvenutiSulla.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBenvenutiSulla.setBounds(136, 11, 408, 18);
		contentPane.add(lblBenvenutiSulla);
		
		lblNewLabel = new JLabel("Salve, in questa pagina le verranno spiegate le modalit\u00E0 per giocare:\r\n\r\n\r\n\r\n\t\t\t\t");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 40, 433, 29);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("1) Decida quanto vuole scommettere (la QUOTA);\r\n\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(36, 80, 362, 19);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("2) Scelga su cosa vuole puntare ,qui ha due possibilit\u00E0:\r\n\t\t\t\r\n\t\t\t\t");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(36, 110, 376, 30);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("- un NUMERO preciso, da 0 a 14, che in caso di vincita\r\n\t\t\t         ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(119, 151, 412, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("le permetterebbero di avere il guadagno massimo, in\r\n\t\t\t          ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(129, 167, 382, 18);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("proporzione a quanto ha scommesso!\r\n");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(129, 185, 320, 18);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("\r\n\t\t\t\t\t\t      OPPURE\r\n\r\n\t\t\t\t");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(253, 212, 119, 14);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("- un COLORE, Rosso,Nero o Verde, che le permetterebbero");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(124, 237, 362, 14);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel(" di avere,con buone probabilit\u00E0, un'ottima vincita in caso");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(129, 254, 346, 14);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel(" il numero vincente fosse del colore da lei selezionato!\r\n\t\t\t   \r\n");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(129, 272, 346, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("COSA ASPETTA? PER TUTTI I NUOVI GIOCATORI E' DISPONIBILE UN BONUS");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10.setBounds(6, 348, 563, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel(" DI BENVENUTO DA BEN 100 \u20AC ! NON FARTELO SCAPPARE !\r\n\r\n\r\n");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_11.setBounds(16, 363, 433, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("il gioco \u00E8 vietato ai minori e pu\u00F2 causare dipendenza patologica,gioca senza esagerare");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 8));
		lblNewLabel_12.setBounds(322, 388, 293, 14);
		contentPane.add(lblNewLabel_12);
		
		lblPerScegliereTra = new JLabel("Per scegliere tra le due modalit\u00E0 basta cliccare, rispettivamente, su NUMERO o COLORE!");
		lblPerScegliereTra.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPerScegliereTra.setBounds(20, 316, 595, 21);
		contentPane.add(lblPerScegliereTra);
		
		this.setResizable(false);
	}
}
