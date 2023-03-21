package main.java.ieseuropa;

import java.util.ArrayList;

public class Mesa {
	private ArrayList <Carta> mazo;
	private ArrayList <Carta> descarte;
	private ArrayList <Jugador> jugadores;
	
	public Mesa () {
		
	}

	public ArrayList<Carta> getMazo() {
		return mazo;
	}
	public void setMazo(ArrayList<Carta> mazo) {
		this.mazo = mazo;
	}

	public ArrayList<Carta> getDescarte() {
		return descarte;
	}
	public void setDescarte(ArrayList<Carta> descarte) {
		this.descarte = descarte;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public ArrayList <Carta> crearMazo () {
		ArrayList <Carta> baraja = new ArrayList <Carta> ();
		for (int i = 0; i<Color.values().length-1; i ++) {
			baraja.add(new Carta(Color.values()[i], Num.cero));
			for (int j = 1; j<Num.values().length-2; j ++) {
				baraja.add(new Carta(Color.values()[i], Num.values()[j]));
				baraja.add(new Carta(Color.values()[i], Num.values()[j]));
			}
		}
		for (int i = 0; i < 4; i++) {
			baraja.add(new Carta(Color.Negro, Num.c));
			baraja.add(new Carta(Color.Negro, Num.mas4));
		}
		return baraja;
	}
	
	public void barajarMazo (ArrayList <Carta> mazo) {
		int i = 0;
		while (i < 200) {
			int num1 = (int)(Math.random() * 109);
			int num2 = (int)(Math.random() * 109);
			Carta aux = mazo.get(num1);
			mazo.set(num1,mazo.get(num2));
			mazo.set(num2, aux);
			i++;
		}
	}
	
	public void RepartirAJugadores () {
		 
	}
	
	public void robarCarta () {
		
	}

	@Override
	public String toString() {
		return "Mesa: mazo=" + mazo + ", descarte=" + descarte + ", jugadores=" + jugadores;
	}
	
	

}
