package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;

public class Finestra extends JFrame {

	private JPanel contentPane;
	private JTextArea logTextArea;
	private JLabel lblNewLabel;
	private JLabel lblEstrazioni;
	private JTextArea rouletteTextArea;

	public Finestra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		logTextArea = new JTextArea();
		logTextArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		logTextArea.setEditable(false);
		logTextArea.setBounds(10, 51, 550, 172);
		contentPane.add(logTextArea);
		
		lblNewLabel = new JLabel("USER LOGS");
		lblNewLabel.setFont(new Font("Gabriola", lblNewLabel.getFont().getStyle() | Font.BOLD, lblNewLabel.getFont().getSize() + 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(189, 11, 191, 29);
		contentPane.add(lblNewLabel);
		
		lblEstrazioni = new JLabel("ELENCO GIOCATE");
		lblEstrazioni.setFont(new Font("Gabriola", lblEstrazioni.getFont().getStyle() | Font.BOLD, lblEstrazioni.getFont().getSize() + 15));
		lblEstrazioni.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstrazioni.setBounds(189, 234, 191, 29);
		contentPane.add(lblEstrazioni);
		
		rouletteTextArea = new JTextArea();
		rouletteTextArea.setEditable(false);
		rouletteTextArea.setBounds(10, 274, 550, 166);
		contentPane.add(rouletteTextArea);
	}

	public JTextArea getLogTextArea() {
		return logTextArea;
	}

	public void setLogTextArea(JTextArea logTextArea) {
		this.logTextArea = logTextArea;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JLabel getLblEstrazioni() {
		return lblEstrazioni;
	}

	public void setLblEstrazioni(JLabel lblEstrazioni) {
		this.lblEstrazioni = lblEstrazioni;
	}

	public JTextArea getRouletteTextArea() {
		return rouletteTextArea;
	}

	public void setRouletteTextArea(JTextArea rouletteTextArea) {
		this.rouletteTextArea = rouletteTextArea;
	}

	public  JTextArea getTextArea()  {
			
		
		return logTextArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.logTextArea = textArea;
	}
}
