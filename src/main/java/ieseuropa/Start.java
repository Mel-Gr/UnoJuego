package main.java.ieseuropa;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		Mesa mesa = new Mesa();
		ArrayList <Carta> baraja = mesa.crearMazo();
		System.out.println(baraja.size());
		for (int i = 0; i < baraja.size(); i++) {
			System.out.println(baraja.get(i).toString());
		}
		
		

		
	}

}
