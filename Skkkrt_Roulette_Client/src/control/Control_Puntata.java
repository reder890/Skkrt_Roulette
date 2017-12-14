package control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;

import model.Giocata;
import model.Vincita;
import view.Istruzioni;
import view.Puntata;
import view.spinRoulette;

public class Control_Puntata implements ActionListener,WindowListener, FocusListener{

		private Puntata p;
		private Control_Login cl;
		private Giocata g;
		private Color colore;
		private spinRoulette spn;
		private Vincita win;
		private ObjectInputStream is;
        private ObjectOutputStream os;
		
		
		public Control_Puntata(Puntata p, Control_Login cl) {
			// TODO Auto-generated constructor stub
			this.p=p;		
			this.cl=cl;
			p.getBtnScommetti().addActionListener(this);
			p.getBtnIstruzioni().addActionListener(this);
			p.getTFQuota().addFocusListener(this);
			p.addWindowListener(this);
			
			try {
				os = new ObjectOutputStream(cl.getS().getOutputStream());
				is = new ObjectInputStream(cl.getS().getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				os.writeObject(new String(cl.getL().getTextField().getText()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==p.getBtnScommetti()){
			
			p.getLabelWarning1().setVisible(false);
			p.getLblNewLabel().setVisible(false);
			
			if(p.getComboBoxCol().getSelectedItem().toString().equals("Nero"))
				colore = Color.BLACK;
			else{
				if(p.getComboBoxCol().getSelectedItem().toString().equals("Rosso"))
					colore = Color.RED;
				else
					colore = Color.GREEN;
				
			}
			if(p.getTFQuota().equals("0"))
				p.getLblNewLabel().setVisible(true);
			else{
				if(Integer.parseInt(p.getTextField().getText())>Integer.parseInt(p.getLabelSaldo().getText()))
					p.getLabelWarning1().setVisible(true);
				else{				
					if(p.getSpinnerNum().isEnabled()==false)
						g=new Giocata(p.getLabelUser().getText(), Integer.parseInt(p.getTFQuota().getText()), 999, colore );
					if(p.getSpinnerNum().isEnabled())
						g=new Giocata(p.getLabelUser().getText(), Integer.parseInt(p.getTFQuota().getText()), (int)p.getSpinnerNum().getValue(), colore );
					try {	
					
						
						boolean flag = (boolean)is.readObject();
					
						if(flag){					
							os.writeObject(g);
							flag = false;
							p.setVisible(false);
							spn = new spinRoulette();
							spn.setVisible(true);
							spn.addWindowListener(this);
							win = (Vincita) is.readObject();			
							
							spn.getLblnumero().setText(""+win.getNumero());
							spn.getLblcolore().setBackground(win.getColor());
							if(win.getMode().equals("bad")){
								spn.getWinLine1().setText("Ci dispiace, ma questa volta non hai vinto :(");
								spn.getWinLine2().setText("Ritenta, sarai più fortunato!");
								p.getLabelSaldo().setText(""+(Integer.parseInt(p.getLabelSaldo().getText())-Integer.parseInt(p.getTFQuota().getText())));
							}
							else{
								spn.getWinLine1().setText("DAAAYUM!! HAI VINTO " +win.getVincita()+ "€ PUNTANDO SU " +win.getMode() +"!!" );
								spn.getWinLine2().setText("Dai, riprova! Potresti vincere di nuovo !");
								p.getLabelSaldo().setText(""+(win.getVincita()+Integer.parseInt(p.getLabelSaldo().getText())));
							}
						}
						else{
							//Parte non più utilizzata
						}
							
					} catch (IOException | ClassNotFoundException e1) {
						e1.printStackTrace();
					}
	
				}
			}
		}
		if(e.getSource()==p.getBtnIstruzioni()) {
			Istruzioni i= new Istruzioni();
			i.setVisible(true);
			i.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			//i.setVisible(true);
			
		}
		
	
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==p) {
			try {
				cl.getS().close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(0);
		}
		else {
			spn.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			spn.setVisible(false);
			p.setVisible(true);
			p.getLabelWarning1().setVisible(false);
		}
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void focusLost(FocusEvent arg0) {
		if((!p.getTFQuota().getText().equals("")) && p.getComboBoxCol().isEnabled()) {
			int s=(int) ((Integer.parseInt((p.getTFQuota().getText())))*(2));	
			if(p.getComboBoxCol().getSelectedItem().equals("Verde")) {
				s=(int) ((Integer.parseInt((p.getTFQuota().getText())))*(14));
			}
							
			p.getLblPossibileVincita().setVisible(true);
			p.getLabelVincita2().setText(""+s);;
			p.getLabelVincita2().setVisible(true);
			p.getLabelEuro().setVisible(true);
			
		}else{
			if(!p.getTFQuota().getText().equals("") && p.getSpinnerNum().isEnabled()) {			
				p.getLblPossibileVincita().setVisible(true);
				int s=(int) ((Integer.parseInt((p.getTFQuota().getText())))*(10));
				p.getLabelVincita2().setText(""+s);;
				p.getLabelVincita2().setVisible(true);
				p.getLabelEuro().setVisible(true);
			}
		}
		
	}

}
