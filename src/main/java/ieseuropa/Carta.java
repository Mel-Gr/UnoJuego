package main.java.ieseuropa;

public class Carta {
	private Color color;
	private Num num;
	
	public Carta (Color color, Num num) {
		this.color= color;
		this.num = num;
	}
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Num getNum() {
		return num;
	}
	public void setNum(Num num) {
		this.num = num;
		
	}
 
	

}
