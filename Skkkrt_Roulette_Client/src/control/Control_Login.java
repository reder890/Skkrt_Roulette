package control;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


import view.Login;

public class Control_Login implements ActionListener {
	private Login l;
	private Puntata p;
	private Socket s;
	
	public Control_Login(Login l,Puntata p) {
		this.l=l;
		this.p=p;
		
		l.getBtnLogin().addActionListener(this);
		l.getBtnEsci().addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==l.getBtnLogin()){
			if(l.getTextField().getText().equals("")){
				JOptionPane.showMessageDialog(null, "INSERISCI UN USERNAME", "Campi mancanti", JOptionPane.ERROR_MESSAGE);
			}		
			else{
				if(l.getRoundedTextField().getText().equals("")){
					JOptionPane.showMessageDialog(null, "INSERISCI UN INDIRIZZO IP VALIDO", "Campi mancanti", JOptionPane.ERROR_MESSAGE);
				}else{
					try {
						s=new Socket(l.getRoundedTextField().getText(), 1518);				
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "OPS! NON RIUSCIAMO A TROVARE NESSUN SERVER A QUESTO IP", "Qualcosa è andato storto", JOptionPane.ERROR_MESSAGE);
					}
					Control_Puntata cp=new Control_Puntata(p,this);
					p.getLabelUser().setText(l.getTextField().getText());
					l.setVisible(false);
					p.setVisible(true);
				}
			}
		}
	
		if(e.getSource()==l.getBtnEsci()){
			
			System.exit(0);			
		}
				
}
	public Login getL() {
		return l;
	}


	public void setL(Login l) {
		this.l = l;
	}


	public Puntata getP() {
		return p;
	}


	public void setP(Puntata p) {
		this.p = p;
	}


	public Socket getS() {
		return s;
	}


	public void setS(Socket s) {
		this.s = s;
	}
}
