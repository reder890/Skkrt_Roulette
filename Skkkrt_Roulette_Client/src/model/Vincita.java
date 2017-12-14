package model;

import java.awt.Color;
import java.io.Serializable;

public class Vincita implements Serializable {

	private String mode;
	private int vincita, numero;
	private Color color;
	
	
	public Vincita(String mode,int vincita, int numero, Color colore) {
		this.mode=mode;
		this.vincita=vincita;
		this.numero=numero;
		this.color=colore;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getMode() {
		return mode;
	}


	public void setMode(String mode) {
		this.mode = mode;
	}


	public int getVincita() {
		return vincita;
	}


	public void setVincita(int vincita) {
		this.vincita = vincita;
	}	
	
}
