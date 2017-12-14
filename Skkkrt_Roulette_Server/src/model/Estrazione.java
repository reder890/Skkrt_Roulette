package model;

import java.awt.Color;
import java.util.Random;

public class Estrazione{
	
	private int numero;
	private Color colore;

	public Estrazione() {
		
		
	}
	public void randomize() {
		int numero;
		Color colore;
		Random rn = new Random();
		
		int n = 15 - 0;
		
		numero = rn.nextInt(n);
		if(numero%2 == 0 && numero!=0)
			colore=Color.BLACK;
		else{
			if(numero%2==1 && numero!=0)
				colore=Color.RED;
			else
				colore=Color.GREEN;
		}
		this.numero=numero;
		this.colore=colore;
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Estrazione numero: " + numero +", colore: " + colore +"";
	}

	public Color getColore() {
		return colore;
	}

	public void setColore(Color colore) {
		this.colore = colore;
	}

	

}
