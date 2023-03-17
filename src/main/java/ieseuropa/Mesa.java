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
	
	public void crearMazo () {
		
	}
	
	public void barajarMazo () {
		
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
