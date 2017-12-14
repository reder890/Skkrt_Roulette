package model;

import java.awt.Color;
import java.io.Serializable;

public class Giocata implements Serializable{
	
	private String username;
	private int quota;
	private int numero;
	private Color colore;
	
	public Giocata(String usr,int qta,int numb,Color col){
		this.username=usr;
		this.quota=qta;
		this.numero=numb;
		this.colore=col;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getQuota() {
		return quota;
	}

	public void setQuota(int quota) {
		this.quota = quota;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Color getColore() {
		return colore;
	}

	public void setColore(Color colore) {
		this.colore = colore;
	}

	@Override
	public String toString() {
		return "Giocata [username=" + username + ", quota=" + quota + ", numero=" + numero + ", colore=" + colore + "]";
	}
	

}
