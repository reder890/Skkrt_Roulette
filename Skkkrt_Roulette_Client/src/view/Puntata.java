package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Puntata extends JFrame {

	private JPanel contentPane;
	private JTextField TFQuota;
	private JComboBox comboBoxCol;
	private JLabel lblSldoDisponibile;
	private JLabel labelSaldo;
	private JLabel labelValut;
	private JButton btnScommetti;
	private JButton btnIstruzioni;
	private JComboBox comboBoxNum;
	private JSpinner spinnerNum;
	private JLabel lblQuota;
	private JLabel lblPossibileVincita;
	private JLabel labelVincita2;
	private JLabel labelEuro; 
	public JLabel getLblPossibileVincita() {
		return lblPossibileVincita;
	}



	public void setLblPossibileVincita(JLabel lblPossibileVincita) {
		this.lblPossibileVincita = lblPossibileVincita;
	}



	public JLabel getLabelVincita2() {
		return labelVincita2;
	}



	public void setLabelVincita2(JLabel labelVincita2) {
		this.labelVincita2 = labelVincita2;
	}



	public JLabel getLabelEuro() {
		return labelEuro;
	}



	public void setLabelEuro(JLabel labelEuro) {
		this.labelEuro = labelEuro;
	}



	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel labelIMG;
	private JLabel labelTitle1;
	private JLabel labelTitle2;
	private JLabel labelWarning1;
	private JLabel labelUserSpace;
	private JLabel labelUser;
	private JLabel lblNewLabel;
	


	public Puntata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(160, 212, 104));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TFQuota = new RoundedTextField(30);
		TFQuota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		TFQuota.setBounds(99, 263, 86, 20);
		contentPane.add(TFQuota);
		TFQuota.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Gabriola", lblNumero.getFont().getStyle(), lblNumero.getFont().getSize() + 10));
		lblNumero.setBounds(38, 311, 64, 20);
		contentPane.add(lblNumero);
		lblNumero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==1 && !comboBoxCol.isEnabled()) {
					comboBoxCol.setEnabled(true);
					spinnerNum.setEnabled(false);
				}
				else {
					comboBoxCol.setEnabled(false);
					spinnerNum.setEnabled(true);
				}
			}
		});
	
		
		JLabel lblColore = new JLabel("Colore");
		lblColore.setFont(new Font("Gabriola", lblColore.getFont().getStyle(), lblColore.getFont().getSize() + 10));
		lblColore.setBounds(38, 358, 51, 20);
		contentPane.add(lblColore);
		lblColore.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==1 && comboBoxCol.isEnabled()) {
					comboBoxCol.setEnabled(false);
					spinnerNum.setEnabled(true);
				}
				else {
					comboBoxCol.setEnabled(true);
					spinnerNum.setEnabled(false);
				}
			}
		});
		
		comboBoxCol = new JComboBox();
		comboBoxCol.addItem("Rosso");
		comboBoxCol.addItem("Nero");
		comboBoxCol.addItem("Verde");
		comboBoxCol.setBounds(99, 358, 86, 20);
		contentPane.add(comboBoxCol);
		comboBoxCol.setEnabled(false);
		
		lblSldoDisponibile = new JLabel("Saldo disponibile :");
		lblSldoDisponibile.setFont(new Font("Gabriola", lblSldoDisponibile.getFont().getStyle() | Font.BOLD, lblSldoDisponibile.getFont().getSize() + 10));
		lblSldoDisponibile.setBounds(216, 192, 147, 20);
		contentPane.add(lblSldoDisponibile);
		
		labelSaldo = new JLabel("100");
		labelSaldo.setFont(new Font("Gabriola", labelSaldo.getFont().getStyle(), labelSaldo.getFont().getSize() + 10));
		labelSaldo.setBounds(357, 195, 29, 14);
		contentPane.add(labelSaldo);
		
		labelValut = new JLabel("\u20AC");
		labelValut.setFont(new Font("Gabriola", labelValut.getFont().getStyle(), labelValut.getFont().getSize() + 10));
		labelValut.setBounds(384, 194, 18, 17);
		contentPane.add(labelValut);
		
		btnScommetti = new JButton("Scommetti");
		btnScommetti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnScommetti.setBounds(300, 402, 102, 23);
		contentPane.add(btnScommetti);
		

		lblPossibileVincita = new JLabel("Possibile vincita:");
		lblPossibileVincita.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPossibileVincita.setBounds(223, 266, 102, 14);
		lblPossibileVincita.setVisible(false);
		contentPane.add(lblPossibileVincita);
		
		labelVincita2 = new JLabel("");
		labelVincita2.setBounds(335, 266, 36, 14);
		contentPane.add(labelVincita2);
		
		labelEuro = new JLabel("\u20AC");
		labelEuro.setBounds(374, 266, 18, 14);
		labelEuro.setVisible(false);
		contentPane.add(labelEuro);
		
		btnIstruzioni = new JButton("Istruzioni");
		btnIstruzioni.setBounds(38, 402, 89, 23);
		contentPane.add(btnIstruzioni);
		
		spinnerNum = new JSpinner();
		spinnerNum.setModel(new SpinnerNumberModel(0, 0, 14, 1));
		spinnerNum.setBounds(103, 311, 46, 20);
		contentPane.add(spinnerNum);
		
		lblQuota = new JLabel("Quota");
		lblQuota.setFont(new Font("Gabriola", lblQuota.getFont().getStyle(), lblQuota.getFont().getSize() + 10));
		lblQuota.setBounds(38, 263, 51, 20);
		contentPane.add(lblQuota);				
		try{
			BufferedImage immagine= ImageIO.read(new File("images/roulette.png"));
			labelIMG = new JLabel(new ImageIcon(immagine.getScaledInstance(205, 205, 1)));
			labelIMG.setBounds(10, 11, 228, 129);
			contentPane.add(labelIMG);
			
			immagine= ImageIO.read(new File("images/skkkrt.png"));
			labelTitle1 = new JLabel(new ImageIcon(immagine.getScaledInstance(195, 70, 1)));
			labelTitle1.setBounds(240, 11, 176, 61);
			contentPane.add(labelTitle1);
			
			
			immagine= ImageIO.read(new File("images/rlt.png"));
			labelTitle2 = new JLabel(new ImageIcon(immagine.getScaledInstance(195, 70, 1)));
			labelTitle2.setBounds(240, 76, 176, 61);
			contentPane.add(labelTitle2);
			
			labelWarning1 = new JLabel("Non hai abbastanza soldi!!");
			labelWarning1.setForeground(new Color(220, 20, 60));
			labelWarning1.setVisible(false);
			labelWarning1.setFont(labelWarning1.getFont().deriveFont(labelWarning1.getFont().getStyle() | Font.BOLD));
			labelWarning1.setHorizontalAlignment(SwingConstants.CENTER);
			labelWarning1.setBounds(205, 215, 168, 14);
			contentPane.add(labelWarning1);
			
			labelUserSpace = new JLabel("Utente:");
			labelUserSpace.setFont(new Font("Gabriola", labelUserSpace.getFont().getStyle(), labelUserSpace.getFont().getSize() + 10));
			labelUserSpace.setBounds(38, 188, 64, 28);
			contentPane.add(labelUserSpace);
			
			labelUser = new JLabel("");
			labelUser.setFont(new Font("Gabriola", labelUser.getFont().getStyle() | Font.BOLD, labelUser.getFont().getSize() + 10));
			labelUser.setHorizontalAlignment(SwingConstants.CENTER);
			labelUser.setBounds(99, 186, 102, 32);
			contentPane.add(labelUser);
			
			lblNewLabel = new JLabel("Scommessa di 0\u20AC?");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setForeground(new Color(220, 20, 60));
			lblNewLabel.setFont(new Font("Tahoma", lblNewLabel.getFont().getStyle() | Font.BOLD, lblNewLabel.getFont().getSize()));
			lblNewLabel.setBounds(83, 229, 120, 28);
			contentPane.add(lblNewLabel);
			lblNewLabel.setVisible(false);
			
			this.setResizable(false);
		}catch(Exception e){
			e.printStackTrace();
		}
	}



	public JTextField getTFQuota() {
		return TFQuota;
	}



	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}



	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}



	public void setTFQuota(JTextField tFQuota) {
		TFQuota = tFQuota;
	}



	public JTextField getTextField() {
		return TFQuota;
	}



	public void setTextField(JTextField textField) {
		this.TFQuota = textField;
	}



	public JComboBox getComboBoxCol() {
		return comboBoxCol;
	}



	public void setComboBoxCol(JComboBox comboBoxCol) {
		this.comboBoxCol = comboBoxCol;
	}



	public JLabel getLblSldoDisponibile() {
		return lblSldoDisponibile;
	}



	public void setLblSldoDisponibile(JLabel lblSldoDisponibile) {
		this.lblSldoDisponibile = lblSldoDisponibile;
	}



	public JLabel getLabelSaldo() {
		return labelSaldo;
	}



	public void setLabelSaldo(JLabel labelSaldo) {
		this.labelSaldo = labelSaldo;
	}



	public JLabel getLabelValut() {
		return labelValut;
	}



	public void setLabelValut(JLabel labelValut) {
		this.labelValut = labelValut;
	}



	public JButton getBtnScommetti() {
		return btnScommetti;
	}



	public void setBtnScommetti(JButton btnScommetti) {
		this.btnScommetti = btnScommetti;
	}



	public JButton getBtnIstruzioni() {
		return btnIstruzioni;
	}



	public void setBtnIstruzioni(JButton btnIstruzioni) {
		this.btnIstruzioni = btnIstruzioni;
	}



	public JComboBox getComboBoxNum() {
		return comboBoxNum;
	}



	public void setComboBoxNum(JComboBox comboBoxNum) {
		this.comboBoxNum = comboBoxNum;
	}



	public JSpinner getSpinnerNum() {
		return spinnerNum;
	}



	public void setSpinnerNum(JSpinner spinnerNum) {
		this.spinnerNum = spinnerNum;
	}



	public JLabel getLblQuota() {
		return lblQuota;
	}



	public void setLblQuota(JLabel lblQuota) {
		this.lblQuota = lblQuota;
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



	public JLabel getLabel_4() {
		return label_4;
	}



	public void setLabel_4(JLabel label_4) {
		this.label_4 = label_4;
	}



	public JLabel getLabelIMG() {
		return labelIMG;
	}



	public void setLabelIMG(JLabel labelIMG) {
		this.labelIMG = labelIMG;
	}



	public JLabel getLabelTitle1() {
		return labelTitle1;
	}



	public void setLabelTitle1(JLabel labelTitle1) {
		this.labelTitle1 = labelTitle1;
	}



	public JLabel getLabelTitle2() {
		return labelTitle2;
	}



	public void setLabelTitle2(JLabel labelTitle2) {
		this.labelTitle2 = labelTitle2;
	}



	public JLabel getLabelWarning1() {
		return labelWarning1;
	}



	public void setLabelWarning1(JLabel labelWarning1) {
		this.labelWarning1 = labelWarning1;
	}



	public JLabel getLabelUserSpace() {
		return labelUserSpace;
	}



	public void setLabelUserSpace(JLabel labelUserSpace) {
		this.labelUserSpace = labelUserSpace;
	}



	public JLabel getLabelUser() {
		return labelUser;
	}



	public void setLabelUser(JLabel labelUser) {
		this.labelUser = labelUser;
	}


}
