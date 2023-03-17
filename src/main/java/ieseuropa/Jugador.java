package main.java.ieseuropa;

public class Jugador {

	
	
	
	
	
	
	
	public void empezarTurno () {
		if (!turno)
			turno = true;
	}
	
	public void terminarTurno () {
		if (turno)
			turno = false;
	}
}
