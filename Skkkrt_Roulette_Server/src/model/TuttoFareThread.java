package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import view.Finestra;

public class TuttoFareThread implements Runnable {
	private Estrazione e;
	private ArrayList<ThreadConnessione> utenti;
	private Finestra f;
	private boolean noNewClient=true;
	private ServerSocket ss;
	private Socket s;
	
	public TuttoFareThread(Estrazione e,Finestra f) {
		utenti=new ArrayList<ThreadConnessione>();
		this.e=e;
		this.f=f;
		try {
			ss=new ServerSocket(1518);
			ss.setSoTimeout(10);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void run() {
		e.randomize();
		while(true) {
			try {
				s=ss.accept();
				noNewClient=false;
				
			}
			catch(IOException IOe) {
				if(!utenti.isEmpty()) {
					
					synchronized(e) {
						e.randomize();
						e.notifyAll();
					}
					//System.out.println(e.getColore());
					noNewClient=true;
				}
				noNewClient=true;

			
			}
			if(!noNewClient) {
				synchronized(e) {
					e.randomize();
					e.notifyAll();
				}
				utenti.add(new ThreadConnessione(s,f,e));
				
			}
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

}
