package tp1.p1.logic.gameobjects;

public class SunflowerList {

	private Sunflower[] sunflowers;// Array de Sunflower;

	private int count; // contador de cu�ntos tengo
	
	public SunflowerList(int size) {
	// constructor : crea lo necesario
		this.count = size;
	}
	
	public void add(Sunflower sunflower) {
		// a�ado el sunflower al array, sumo uno al contador
		
		this.count++;
	}
	
	public Sunflower getSunflowerInPosition(int col, int row) {
	  //  busca en el array un sunflower que tenga esa posici�n en el tablero
	  // y lo devuelve. Sin nohay devuelve null
		return;
	}
	
	public boolean isPositionEmpty(int col, int row) {
		return getSunflowerInPosition(col, row) == null;
	}

	public void update() {
	Sunflower sunflowers = new Sunflower(null, count, count, count, count);
	sunflowers.update();
	// recorre el array , llamando al update de cada sunflower	
	}
}
