package main.java.ieseuropa;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private int posicion;
	private boolean turno;
	private ArrayList <Carta> cartasMano;
	
	public Jugador (String nombre, int posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public boolean isTurno() {
		return turno;
	}
	public void setTurno(boolean turno) {
		this.turno = turno;
	}

	public ArrayList<Carta> getCartasMano() {
		return cartasMano;
	}
	public void setCartasMano(ArrayList<Carta> cartasMano) {
		this.cartasMano = cartasMano;
	}

	@Override
	public String toString() {
		return "Jugador: nombre=" + nombre + ", posicion=" + posicion + ", turno=" + turno + ", cartasMano="
				+ cartasMano;
	}
	
	
}
