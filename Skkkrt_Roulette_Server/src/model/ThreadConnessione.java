package model;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import view.Finestra;

public class ThreadConnessione implements Runnable {
	private Finestra f;
	private Socket s;
	private Estrazione e;
	private Vincita win;
	private ObjectInputStream is;
    private ObjectOutputStream os;
    private String s1;
    
	public ThreadConnessione(Socket s,Finestra f,Estrazione e) {
		this.s=s;
		this.f=f;
		this.e=e;
		s1=null;
		try {
			os = new ObjectOutputStream(s.getOutputStream());
			is = new ObjectInputStream(s.getInputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			s1=(String)is.readObject();
		} catch (ClassNotFoundException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		f.getLogTextArea().setText(f.getLogTextArea().getText()+s1+" Connected\n");
		new Thread(this).start();
	}

	@Override
	public void run() {	
		
		while(true) {			
			try {	
					
				os.writeObject(true);
				os.flush();
				
				
				
				Giocata message = (Giocata) is.readObject();
				f.getRouletteTextArea().setText(f.getRouletteTextArea().getText()+message.toString()+"\n");
				
				win = new Vincita("", 0,e.getNumero(),e.getColore());
				
				if(message.getNumero() == e.getNumero()){
					message.setQuota(message.getQuota()*10);
					win.setMode("Numero");
					win.setVincita(message.getQuota());
				}
				else{
					if(message.getColore().equals(e.getColore()) && e.getColore().equals(Color.RED)){
						message.setQuota(message.getQuota()*2);
						win.setMode("Rosso");
						win.setVincita(message.getQuota());
					}
					else{
						if(message.getColore().equals(e.getColore()) && e.getColore().equals(Color.BLACK)){
							message.setQuota(message.getQuota()*2);
							win.setMode("Nero");
							win.setVincita(message.getQuota());
						}
						else{
							if(message.getColore().equals(e.getColore()) && e.getColore().equals(Color.GREEN)){
								message.setQuota(message.getQuota()*14);
								win.setMode("Verde");
								win.setVincita(message.getQuota());
							}
							else{
								message.setQuota(0);
								win.setMode("bad");
							}
						}
					}
				}				
				os.writeObject(win);
				
			} catch (IOException | ClassNotFoundException e2) {
				//e2.printStackTrace();
				f.getLogTextArea().setText(f.getLogTextArea().getText()+s1+" Disconected\n");
			}

			synchronized(e) {
				try {
					e.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

}